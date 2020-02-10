/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.accounting.daoImpl;

import com.generate.simplified.core.model.ParamBean;
import com.generate.simplified.core.entity.AccountCategories;
import com.generate.simplified.core.entity.AccountCategoriesDet; 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import com.generate.simplified.core.model.conta_confplancontable;

/**
 *
 * @author samsung
 */
public class AccountingCategoriesDAOImpl implements AccountingCategoriesDAO{
    Connection con;

    public AccountingCategoriesDAOImpl(Connection con) {
        this.con = con;
    } 

    @Override
    public String createAccountingCategories(AccountCategories p) {
        String rpt = "";
        try { 
            CallableStatement cs = con.prepareCall("{call fn_create_accounter_categories(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, p.getOperation());
            cs.setLong(2, p.getCod_accounting());
            cs.setString(3, p.getName_accounting()); 
            cs.setString(4, p.getUsrCrea());
            cs.setTimestamp(5, new java.sql.Timestamp(p.getTsCrea().getTime()));
            cs.setString(6, p.getUsrModi());
            cs.setTimestamp(7, new java.sql.Timestamp(p.getTsModi().getTime()));
            cs.setLong(8, p.getCtaOrga());
            cs.registerOutParameter(9, Types.VARCHAR);
            cs.execute();
            rpt = cs.getString(9); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rpt;
    }

/*    
    @Override
    public List<AccountCategories> listViewAccounting(AccountCategories a) {
        List<AccountCategories> list = new ArrayList();
        try {
            //CallableStatement cs = con.prepareCall("{call fn_list_accounting_categories(?,?,?)}");
            CallableStatement cs = con.prepareCall("{call fn_list_type_of_accounting(?,?,?)}");
            cs.setString(1, "_ROW");
            cs.setLong(2, a.getCtaOrga());
            cs.setLong(3, 0);
            ResultSet rs = cs.executeQuery();
            AccountCategories ac;
            while (rs.next()) {
                ac = new AccountCategories();
                ac.setCod_accounting(rs.getLong(1));
                ac.setName_accounting(rs.getString(2)); 
                ac.setUsrCrea(rs.getString(3));
                ac.setTsCrea(rs.getDate(4));
                ac.setUsrModi(rs.getString(5));
                ac.setTsModi(rs.getDate(6));
                ac.setCtaOrga(rs.getLong(7)); 
                list.add(ac);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
*/
    @Override
    public List<AccountCategories> listViewAccounting(AccountCategories a) {
        List<AccountCategories> list = new ArrayList();
        try {
            //CallableStatement cs = con.prepareCall("{call fn_list_accounting_categories(?,?,?)}");
            CallableStatement cs = con.prepareCall("{call fn_list_type_of_accounting(?,?,?)}");
            cs.setString(1, "_ROW");
            cs.setLong(2, a.getCtaOrga());
            cs.setLong(3, 0);
            ResultSet rs = cs.executeQuery();
            AccountCategories ac;
            while (rs.next()) {
                ac = new AccountCategories();
                ac.setCodtypecta(rs.getInt(1));
                ac.setName_accounting(rs.getString(2));  
                list.add(ac);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public AccountCategories viewAccountingById(AccountCategories a) { 
        AccountCategories ac=null;
        try {
            CallableStatement cs = con.prepareCall("{call fn_list_accounting_categories(?,?,?)}");
            cs.setString(1, "_BY");
            cs.setLong(2, a.getCtaOrga());
            cs.setLong(3, a.getCod_accounting());
            ResultSet rs = cs.executeQuery();            
            while (rs.next()) {
                ac = new AccountCategories();
                ac.setCod_accounting(rs.getLong(1));
                ac.setName_accounting(rs.getString(2)); 
                ac.setUsrCrea(rs.getString(3));
                ac.setTsCrea(rs.getDate(4));
                ac.setUsrModi(rs.getString(5));
                ac.setTsModi(rs.getDate(6));
                ac.setCtaOrga(rs.getLong(7)); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ac;
    }

    @Override
    public String createAccountingCategoriesDet(AccountCategoriesDet a) {
        String rpt = "";
        try { 
            CallableStatement cs = con.prepareCall("{call fn_create_accounter_categories_det(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, a.getOperation());
            cs.setLong(2, a.getCodAccountingDet());
            cs.setLong(3, a.getAccount().getCod_accounting()); 
            cs.setString(4, a.getConta().getIde_conta_plantplanconta()); 
            cs.setString(5, a.getAccount().getUsrCrea());
            cs.setTimestamp(6, new java.sql.Timestamp(a.getAccount().getTsCrea().getTime()));
            cs.setString(7, a.getAccount().getUsrModi());
            cs.setTimestamp(8, new java.sql.Timestamp(a.getAccount().getTsModi().getTime()));
            cs.setLong(9, a.getAccount().getCtaOrga());
            cs.registerOutParameter(10, Types.VARCHAR);
            cs.execute();
            rpt = cs.getString(10); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rpt;
    }

    /*@Override
    public List<AccountCategoriesDet> listViewAccountingDet(ParamBean p) {
        List<AccountCategoriesDet> lst=new ArrayList();
        try { 
            //CallableStatement cs = con.prepareCall("{call fn_list_accounting_categories_det(?,?,?,?)}");
            CallableStatement cs = con.prepareCall("{call fn_list_accounting_setting_by_type_account(?,?,?,?)}");
            cs.setString(1, "_BY");
            cs.setString(2, p.getCcosto()); 
            cs.setInt(3, p.getCodCompany());
            cs.setString(4, p.getCodTypeCta()); 
            ResultSet rs = cs.executeQuery();          
            AccountCategoriesDet det;
            while (rs.next()) {
                det = new AccountCategoriesDet();
                det.setCodAccountingDet(rs.getLong(1));
                AccountCategories ac=new AccountCategories();
                ac.setCod_accounting(rs.getLong(2));
                ac.setName_accounting(rs.getString(3)); 
                det.setTypecta(rs.getString(6)); 
                ac.setUsrCrea(rs.getString(7));
                ac.setTsCrea(rs.getDate(8));
                ac.setUsrModi(rs.getString(9));
                ac.setTsModi(rs.getDate(10));
                ac.setCtaOrga(rs.getLong(11)); 
                det.setAccount(ac);
                conta_confplancontable cc=new conta_confplancontable();
                cc.setIde_conta_plantplanconta(rs.getString(4));
                cc.setDescripcion(rs.getString(5));
                det.setConta(cc);
                lst.add(det);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst; 
    }*/
    
    @Override
    public List<AccountCategoriesDet> listViewAccountingDet(ParamBean p) {
        List<AccountCategoriesDet> lst=new ArrayList();
        try { 
            System.out.println("M:listViewAccountingDet p.getCodTypeCta() "+p.getCodTypeCta());
            //CallableStatement cs = con.prepareCall("{call fn_list_accounting_categories_det(?,?,?,?)}");
            CallableStatement cs = con.prepareCall("{call fn_list_accounting_setting_by_type_account(?,?,?,?)}");
            cs.setString(1, "_BY");
            cs.setString(2, p.getCcosto()); 
            cs.setInt(3, p.getCodCompany());
            cs.setInt(4, p.getCodTypeCta()); 
            ResultSet rs = cs.executeQuery();          
            AccountCategoriesDet det;
            while (rs.next()) {
                det = new AccountCategoriesDet();                                
                conta_confplancontable cc=new conta_confplancontable();
                AccountCategories ac=new AccountCategories();
                cc.setIde_conta_plantplanconta(rs.getInt(1)+"");
                ac.setCodtypecta(rs.getInt(2));  
                ac.setName_accounting(rs.getString(3)); 
                det.setNaturaleza(rs.getString(4)); 
                det.setConta(cc);
                det.setAccount(ac);
                lst.add(det);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst; 
    }
    
}
