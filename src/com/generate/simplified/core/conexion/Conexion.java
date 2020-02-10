package com.generate.simplified.core.conexion;
 
import com.generate.simplified.core.utilitarios.Constants;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.PrintWriter; 
import java.sql.Connection;
import java.sql.DriverManager; 
/*    */ import java.sql.SQLException; 
import java.util.regex.Pattern;
import javax.swing.JOptionPane;  

public abstract class Conexion {

    private static Connection cn = null;
    /*Conexion a BD AWS*/
    
    public static Connection getConnectionSqliteLoadIni() {
        try {
            RutaBdSqlite r = new RutaBdSqlite();
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:" + r.path());
        } catch (ClassNotFoundException e) {
            cn = null;
            e.printStackTrace();
        } catch (SQLException e) {
            cn = null;
            e.printStackTrace();
        }
        return cn;
    }
    
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            String[] cadena = null;
            try {
                cadena = leerServidor().split(Pattern.quote("|"));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } 
            String[] server = cadena[0].split(":");
            String host = EncryptorAlpes.decrypt(Constants.KEY_ENCRIPT_ACCESS, Constants.KEY_DECRIPT_ACCESS, server[1]);            
            String[] puerto = cadena[1].split(":");
            String[] bd = cadena[2].split(":");
            String[] usuario = cadena[3].split(":");
            String[] pass = cadena[4].split(":"); 
            String password = EncryptorAlpes.decrypt(Constants.KEY_ENCRIPT_ACCESS, Constants.KEY_DECRIPT_ACCESS, pass[1]);
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + host + ":" + puerto[1] + "/" + bd[1]; 
            cn = DriverManager.getConnection(url, usuario[1], password);
        } catch (ClassNotFoundException e) {
            cn = null; 
        } catch (SQLException e) {
            cn = null; 
            String tipoBd = "Postgres";  
        }
        return cn;
    }

    private static String leerServidor() throws FileNotFoundException {
        BufferedReader bf = null;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            bf = new BufferedReader(new FileReader("C:\\localhost\\localhost.txt"));
            int concador = 0;
            String sCadena;
            while ((sCadena = bf.readLine()) != null) {
                _nameHost = sCadena;
                //System.err.println("NEW CADENA: " + sCadena);                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bf) {
                    bf.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return _nameHost;
    }

    static String _nameHost;
}
