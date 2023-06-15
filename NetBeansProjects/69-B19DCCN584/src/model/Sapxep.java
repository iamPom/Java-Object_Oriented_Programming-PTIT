/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tiena
 */
public class Sapxep implements Serializable{
    private Phong p;
    private Lop l;
    private String phongth;

    public Sapxep() {
    }

    public Sapxep(Phong p, Lop l, String phongth) {
        this.p = p;
        this.l = l;
        this.phongth = phongth;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public Lop getL() {
        return l;
    }

    public void setL(Lop l) {
        this.l = l;
    }

    public String getPhongth() {
        return phongth;
    }

    public void setPhongth(String phongth) {
        this.phongth = phongth;
    }
    public Object[] toObject(){
        return new Object[]{
//            p.getMa(),p.getTen(),l.getMa(),l.,soluong,songay
        };
    }
}
