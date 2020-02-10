/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.model;

import com.generate.simplified.core.entity.AccountCategories;
import com.generate.simplified.core.entity.AccountCategoriesDet;
import java.util.List;

/**
 *
 * @author samsung
 */
public class ResponseData {

    private List<AccountCategories> listAc;
    private List<AccountCategoriesDet> listDet;
    private List<CajaBancosBean> listBallBankOnly;
    private List<CajaBancosBean> listBallBankAll;

    public List<CajaBancosBean> getListBallBankOnly() {
        return listBallBankOnly;
    }

    public void setListBallBankOnly(List<CajaBancosBean> listBallBankOnly) {
        this.listBallBankOnly = listBallBankOnly;
    }

    public List<CajaBancosBean> getListBallBankAll() {
        return listBallBankAll;
    }

    public void setListBallBankAll(List<CajaBancosBean> listBallBankAll) {
        this.listBallBankAll = listBallBankAll;
    }

    public List<AccountCategories> getListAc() {
        return listAc;
    }

    public void setListAc(List<AccountCategories> listAc) {
        this.listAc = listAc;
    }

    public List<AccountCategoriesDet> getListDet() {
        return listDet;
    }

    public void setListDet(List<AccountCategoriesDet> listDet) {
        this.listDet = listDet;
    }

}
