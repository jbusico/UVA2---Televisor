package Televisores;

public class Televisor {
    private String marca;
    private String modelo;
    private String tipo;
    private int tamañoDePantalla;
    private String resolucion;
    private boolean esSmart;
    private boolean estaEncendido;

    public Televisor(String marca, String modelo, String tipo, int tamañoDePantalla, String resolucion,
            boolean esSmart, boolean estaEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tamañoDePantalla = tamañoDePantalla;
        this.resolucion = resolucion;
        this.esSmart = esSmart;
        this.estaEncendido = estaEncendido;
    }

    public String esSmart() {
        if (esSmart) {
            return "Es Smart";
        } else {
            return "No es Smart";
        }
    }

    public String estaEncendida() {
        if (estaEncendido) {
            return "Esta encendido";
        } else {
            return "No esta encendido";
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamañoDePantalla() {
        return tamañoDePantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

}
