/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.rc.service.impl;

import com.generate.simplified.core.model.CajaBancosBean;
import com.generate.simplified.core.model.ParamRC;
import java.sql.Connection;
import java.util.List;
import com.generate.simplified.core.conexion.Conexion;
import com.generate.simplified.core.rc.dao.impl.RcDao;
import java.sql.SQLException;

/**
 *
 * @author samsung
 */
public class RcServiceImpl {

    public static List<CajaBancosBean> listAsientoSimplificado(ParamRC p) throws Exception {
        List<CajaBancosBean> lst = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            RcDao rc_dao = new RcDao(con);
            lst = rc_dao.listAsientoSimplificado(p);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return lst;
    }

    public static List<CajaBancosBean> listViewSeatSimplifiedByBook(ParamRC p) throws Exception {
        List<CajaBancosBean> lst = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            RcDao rc_dao = new RcDao(con);
            lst = rc_dao.listViewSeatSimplifiedByBook(p);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return lst;
    }

    public static List<CajaBancosBean> lstDiarioJframeAsiento(ParamRC p) throws Exception {
        List<CajaBancosBean> lst = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            RcDao dao = new RcDao(con);
            lst = dao.listAsientoDiary(p);
        } catch (SQLException e) {
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return lst;
    }

}
