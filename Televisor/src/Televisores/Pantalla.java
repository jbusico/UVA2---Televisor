package Televisores;

public class Pantalla {
    private int tamaño;
    private String tipo;
    private String resolucion;

    public Pantalla (int tamaño, String tipo, String resolucion) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.resolucion = resolucion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public String getResolucion() {
        return resolucion;
    }
}
