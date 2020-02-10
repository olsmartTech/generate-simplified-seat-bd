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
public class Position {

    private int position;
    private String descrip;
    private int howMany;
    private int posiIni;
    private int posiEnd;

    public int getPosiIni() {
        return posiIni;
    }

    public void setPosiIni(int posiIni) {
        this.posiIni = posiIni;
    }

    public int getPosiEnd() {
        return posiEnd;
    }

    public void setPosiEnd(int posiEnd) {
        this.posiEnd = posiEnd;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

}