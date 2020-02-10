/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.model;

import java.util.Date;

/**
 *
 * @author samsung
 */
public class ParamRC {

    private String voucher;
    private String code;
    private String serie;
    private String correlativo;
    private String provider;
    private String ruc;
    private String typeCompro;
    private String periodo;
    private String month;
    private String year;
    private String flagDate;
    private String flagMode;
    private Date dateIni;
    private Date dateFin;
    private Integer codEmpresa;

    public String getFlagMode() {
        return flagMode;
    }

    public void setFlagMode(String flagMode) {
        this.flagMode = flagMode;
    }

    public String getFlagDate() {
        return flagDate;
    }

    public void setFlagDate(String flagDate) {
        this.flagDate = flagDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Date getDateIni() {
        return dateIni;
    }

    public void setDateIni(Date dateIni) {
        this.dateIni = dateIni;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getTypeCompro() {
        return typeCompro;
    }

    public void setTypeCompro(String typeCompro) {
        this.typeCompro = typeCompro;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}
