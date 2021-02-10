package com.example.dif;

public class JuridicoCasos {
    private int id;
    private String nombres;

    public JuridicoCasos(){}

    public JuridicoCasos(int id, String nombres){
        this.id = id;
        this.nombres = nombres;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRol(String nombres){
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return nombres;
    }
}