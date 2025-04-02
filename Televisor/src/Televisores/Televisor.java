package Televisores;

public class Televisor {
    private String marca;
    private String modelo;
    private Pantalla pantalla;
    private boolean esSmart;
    private boolean estaEncendido;

    public Televisor(String marca, String modelo, Pantalla pantalla,boolean esSmart, boolean estaEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
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

    public Pantalla getPantalla() {
        return pantalla;
    }

    public boolean isEsSmart() {
        return esSmart;
    }

}
