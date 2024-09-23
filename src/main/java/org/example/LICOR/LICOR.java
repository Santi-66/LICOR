package org.example.LICOR;

public class LICOR {
    private String MARCA;
    private Integer precio;
    private Integer calorias ;
    private Integer GradosDA;

    private String SABOR;

    public LICOR() {
    }

    public LICOR(String MARCA, Integer precio, Integer calorias, Integer gradosDA, String SABOR) {
        this.MARCA = MARCA;
        this.precio = precio;
        this.calorias = calorias;
        GradosDA = gradosDA;
        this.SABOR = SABOR;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public Integer getGradosDA() {
        return GradosDA;
    }

    public void setGradosDA(Integer gradosDA) {
        GradosDA = gradosDA;
    }

    public String getSABOR() {
        return SABOR;
    }

    public void setSABOR(String SABOR) {
        this.SABOR = SABOR;
    }
}


