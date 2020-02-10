/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.model;

/**
 *
 * @author samsung
 */
public class ParamSeat {

    private int codCompany;
    private long ctaOrgaId;
    private String ccosto;

    public String getCcosto() {
        return ccosto;
    }

    public void setCcosto(String ccosto) {
        this.ccosto = ccosto;
    }

    public long getCtaOrgaId() {
        return ctaOrgaId;
    }

    public void setCtaOrgaId(long ctaOrgaId) {
        this.ctaOrgaId = ctaOrgaId;
    }

    public int getCodCompany() {
        return codCompany;
    }

    public void setCodCompany(int codCompany) {
        this.codCompany = codCompany;
    }

}
