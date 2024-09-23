package org.example.CLIENTE;

public class CLIENTE {

    private String NOMBRE;
    private String CC;
    private String DIRECTION;
    private String NTF;
    private String genero;

    public CLIENTE() {
    }

    public CLIENTE(String NOMBRE, String CC, String DIRECTION, Integer NTF, String genero) {
        this.NOMBRE = NOMBRE;
        this.CC = CC;
        this.DIRECTION = DIRECTION;
        this.NTF = NTF;
        this.genero = genero;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String DIRECTION) {
        this.DIRECTION = DIRECTION;
    }

    public String getNTF() {
        return NTF;
    }

    public void setNTF(String NTF) {
        this.NTF = NTF;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

