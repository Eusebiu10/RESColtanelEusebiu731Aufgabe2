package com.company.Model;

import java.util.ArrayList;

public class Kunde {

    private Integer id;
    private String Name;
    private ArrayList<Film> imp;

    public Kunde(Integer id, String name, ArrayList<Film> imp) {
        this.id = id;
        Name = name;
        this.imp = imp;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Film> getImp() {
        return imp;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setImp(ArrayList<Film> imp) {
        this.imp = imp;
    }
}
