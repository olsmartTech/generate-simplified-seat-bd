/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.entity;

import com.generate.simplified.core.model.conta_confplancontable;

/**
 *
 * @author samsung
 */
public class AccountCategoriesDet {

    private String operation;
    private String naturaleza;
    private long codAccountingDet;
    private AccountCategories account;
    private conta_confplancontable conta;

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getCodAccountingDet() {
        return codAccountingDet;
    }

    public void setCodAccountingDet(long codAccountingDet) {
        this.codAccountingDet = codAccountingDet;
    }

    public AccountCategories getAccount() {
        return account;
    }

    public void setAccount(AccountCategories account) {
        this.account = account;
    }

    public conta_confplancontable getConta() {
        return conta;
    }

    public void setConta(conta_confplancontable conta) {
        this.conta = conta;
    }

}
