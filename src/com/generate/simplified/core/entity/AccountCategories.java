/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.entity;

import java.util.Date;

/**
 *
 * @author samsung
 */
public class AccountCategories {

    private String operation;
    private int codtypecta;
    private long cod_accounting;
    private String name_accounting;
    private String usrCrea;
    private Date tsCrea;
    private String usrModi;
    private Date tsModi;
    private long ctaOrga;

    public int getCodtypecta() {
        return codtypecta;
    }

    public void setCodtypecta(int codtypecta) {
        this.codtypecta = codtypecta;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getCod_accounting() {
        return cod_accounting;
    }

    public void setCod_accounting(long cod_accounting) {
        this.cod_accounting = cod_accounting;
    }

    public String getName_accounting() {
        return name_accounting;
    }

    public void setName_accounting(String name_accounting) {
        this.name_accounting = name_accounting;
    }

    public String getUsrCrea() {
        return usrCrea;
    }

    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }

    public Date getTsCrea() {
        return tsCrea;
    }

    public void setTsCrea(Date tsCrea) {
        this.tsCrea = tsCrea;
    }

    public String getUsrModi() {
        return usrModi;
    }

    public void setUsrModi(String usrModi) {
        this.usrModi = usrModi;
    }

    public Date getTsModi() {
        return tsModi;
    }

    public void setTsModi(Date tsModi) {
        this.tsModi = tsModi;
    }

    public long getCtaOrga() {
        return ctaOrga;
    }

    public void setCtaOrga(long ctaOrga) {
        this.ctaOrga = ctaOrga;
    }

}
