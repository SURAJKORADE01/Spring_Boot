package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien
{
    @Id // aro become primary key
    private int aro;
    private String aname;
    private String acity;
    private int amarks;

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcity() {
        return acity;
    }

    public void setAcity(String acity) {
        this.acity = acity;
    }

    public int getAmarks() {
        return amarks;
    }

    public void setAmarks(int amarks) {
        this.amarks = amarks;
    }


}
