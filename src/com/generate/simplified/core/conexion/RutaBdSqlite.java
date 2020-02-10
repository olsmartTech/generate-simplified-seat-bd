/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.conexion;

import java.net.URL;

/**
 *
 * @author samsung
 */
public class RutaBdSqlite { 
    //String ruta="/com/nucleoti/core/driver/recursos/sqlite/bdSmart.db";
    //String rutaInterna="/bdsqlite/bdSmart.db";
    String rutaExterna="bdsqlite/bdSmart.db";
    
    public String path() {
        //URL url = this.getClass().getResource(rutaInterna);
        //return url.toString();
        return rutaExterna;
    }

    public String pathInterna() {
        //String ruta="/com/nucleoti/core/driver/recursos/sqlite/bdLicenseSqlite.db";
        String ruta="bdsqlite/bdExpirationLicenceSqlite.db";
        URL url = this.getClass().getResource(ruta);
        return ruta;//url.toString(); 
    }
    
    public String pathInternah2() {
        //String ruta="/com/nucleoti/core/driver/recursos/sqlite/bdLicenseSqlite.db";
        String rutah2="./configinload/loadini/bdini";
        URL url = this.getClass().getResource(rutah2);
        return rutah2;//url.toString(); 
    }
}
