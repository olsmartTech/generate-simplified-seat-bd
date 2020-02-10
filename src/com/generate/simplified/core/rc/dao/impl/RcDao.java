/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.rc.dao.impl;

import com.generate.simplified.core.model.CajaBancosBean;
import com.generate.simplified.core.model.ParamRC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samsung
 */
public class RcDao {

    Connection con;

    public RcDao(Connection con) {
        this.con = con;
    }

    public List<CajaBancosBean> listAsientoSimplificado(ParamRC p) throws SQLException {
        List<CajaBancosBean> lst = new ArrayList();
        try {
            //System.out.println("DAO M:listAsientoSimplificado 1>> " + p.getFlagDate());
            //System.out.println("DAO M:listAsientoSimplificado 2>> " + p.getFlagMode());
            System.out.println("DAO M:listAsientoSimplificado 3>> " + p.getCode());
            CallableStatement cs = this.con.prepareCall("{call fn_list_asiento_simplificado(?,?,?,?,?,?)}");
            cs.setInt(1, p.getCodEmpresa());
            cs.setDate(2, new java.sql.Date(p.getDateIni().getTime()));
            cs.setDate(3, new java.sql.Date(p.getDateFin().getTime()));
            cs.setString(4, p.getCode());
            cs.setString(5, p.getFlagMode());
            cs.setString(6, p.getFlagDate());
            ResultSet rs = cs.executeQuery();
            CajaBancosBean bean;
            while (rs.next()) {
                bean = new CajaBancosBean();
                bean.setVoucher(rs.getString(1));
                bean.setFechaContable("" + rs.getDate(2));
                bean.setCodLibro(rs.getInt(3) + "");
                bean.setGlosa(rs.getString(4));
                bean.setCuenta(rs.getString(5));
                bean.setDebe("" + Double.valueOf(Math.rint(rs.getDouble(6) * 100.0D) / 100.0D));
                bean.setHaber("" + Double.valueOf(Math.rint(rs.getDouble(7) * 100.0D) / 100.0D));
                bean.setVoucherOrigin(rs.getString(8));
                lst.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<CajaBancosBean> listViewSeatSimplifiedByBook(ParamRC p) throws SQLException {
        List<CajaBancosBean> lst = new ArrayList();
        try {
            System.out.println("listViewSeatSimplifiedByBook 1 " + p.getCodEmpresa());
            System.out.println("listViewSeatSimplifiedByBook 2 " + p.getCode());
            System.out.println("listViewSeatSimplifiedByBook 3 " + p.getFlagDate());
            CallableStatement cs = this.con.prepareCall("{call fn_list_seat_simplififiedbybook(?,?,?,?,?)}");
            cs.setInt(1, p.getCodEmpresa());
            cs.setDate(2, new java.sql.Date(p.getDateIni().getTime()));
            cs.setDate(3, new java.sql.Date(p.getDateFin().getTime()));
            cs.setString(4, p.getCode());
            cs.setString(5, p.getFlagDate());
            ResultSet rs = cs.executeQuery();
            CajaBancosBean bean;
            while (rs.next()) {
                bean = new CajaBancosBean();
                bean.setCodLibro(rs.getInt(1) + "");
                bean.setVoucher(rs.getString(2));
                bean.setVoucherOrigin(rs.getString(3));
                p.setVoucher(rs.getString(3));
                bean.setGlosa(viewDescripcionGlosa(p));
                lst.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<CajaBancosBean> listAsientoDiary(ParamRC p) throws SQLException {
        List<CajaBancosBean> lst = new ArrayList();
        try {
            CallableStatement cs = this.con.prepareCall("{call fn_list_asiento_diary(?,?,?,?,?)}");
            cs.setInt(1, p.getCodEmpresa());
            cs.setDate(2, new java.sql.Date(p.getDateIni().getTime()));
            cs.setDate(3, new java.sql.Date(p.getDateFin().getTime()));
            cs.setString(4, p.getCode());
            cs.setString(5, p.getFlagDate());
            ResultSet rs = cs.executeQuery();
            CajaBancosBean bean;
            while (rs.next()) {
                bean = new CajaBancosBean();
                bean.setNroAsiento(rs.getString(1));
                if ("-".equals(String.valueOf(Math.rint(rs.getDouble(2) * 100.0D) / 100.0D - Math.rint(rs.getDouble(3) * 100.0D) / 100.0D).substring(1))) {
                    bean.setDiferencia("" + Double.valueOf(-1.0D * (Math.rint(rs.getDouble(2) * 100.0D) / 100.0D) - Math.rint(rs.getDouble(3) * 100.0D) / 100.0D));
                } else {
                    bean.setDiferencia("" + Double.valueOf(Math.rint(rs.getDouble(2) * 100.0D) / 100.0D - Math.rint(rs.getDouble(3) * 100.0D) / 100.0D));
                }
                bean.setDebe("" + Double.valueOf(Math.rint(rs.getDouble(2) * 100.0D) / 100.0D));
                bean.setHaber("" + Double.valueOf(Math.rint(rs.getDouble(3) * 100.0D) / 100.0D));
                lst.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

    public String viewDescripcionGlosa(ParamRC p) throws SQLException { 
        String rpt="";
        try {
            CallableStatement cs = this.con.prepareCall("{call fn_recovery_name_glosa(?,?,?)}");            
            cs.setString(1, p.getVoucher());
            cs.setInt(2, p.getCodEmpresa());
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            rpt = cs.getString(3);     
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rpt;
    }
    
}
