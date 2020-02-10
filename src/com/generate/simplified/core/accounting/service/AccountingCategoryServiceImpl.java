/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.accounting.service;

import com.generate.simplified.core.model.ParamBean;
import com.generate.simplified.core.conexion.Conexion;
import com.generate.simplified.core.accounting.daoImpl.AccountingCategoriesDAOImpl;
import com.generate.simplified.core.entity.AccountCategories;
import com.generate.simplified.core.entity.AccountCategoriesDet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author samsung
 */
public class AccountingCategoryServiceImpl implements AccountingCategoriesService{

    @Override
    public String createAccountingCategories(AccountCategories a) {
        Connection con = null;
        String rpt="";
        try {
            con = Conexion.getConnection();
            con.setAutoCommit(false);
            AccountingCategoriesDAOImpl dao = new AccountingCategoriesDAOImpl(con);
            rpt=dao.createAccountingCategories(a);
            con.commit();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return rpt;
    }

    @Override
    public List<AccountCategories> listViewAccounting(AccountCategories a) {
        List<AccountCategories> lst = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            AccountingCategoriesDAOImpl dao = new AccountingCategoriesDAOImpl(con);
            lst = dao.listViewAccounting(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return lst;
    }

    @Override
    public AccountCategories viewAccountingById(AccountCategories a) {
         AccountCategories ac = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            AccountingCategoriesDAOImpl dao = new AccountingCategoriesDAOImpl(con);
            ac = dao.viewAccountingById(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return ac;
    }

    @Override
    public String createAccountingCategoriesDet(AccountCategoriesDet a) {
        Connection con = null;
        String rpt="";
        try {
            con = Conexion.getConnection();
            con.setAutoCommit(false);
            AccountingCategoriesDAOImpl dao = new AccountingCategoriesDAOImpl(con);
            rpt=dao.createAccountingCategoriesDet(a);
            con.commit();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return rpt;
    }

    @Override
    public List<AccountCategoriesDet> listViewAccountingDet(ParamBean p) {
        List<AccountCategoriesDet> lst = null;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            AccountingCategoriesDAOImpl dao = new AccountingCategoriesDAOImpl(con);
            lst = dao.listViewAccountingDet(p);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return lst;
    }
    
    
    
}
