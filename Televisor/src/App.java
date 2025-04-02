import Televisores.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pantalla pantallaCompartida = new Pantalla(55, "Oled", "1080p");

        Televisor tele1 = new Televisor("Samsung", "The Frame", pantallaCompartida, true, false);

        Televisor tele2 = new Televisor("LG", "SmartTV", pantallaCompartida, false, true);

        System.out.println(
                tele1.getMarca() + " -- " + tele1.getModelo() + " -- " + tele1.getPantalla().getResolucion() + " -- " + tele1.getPantalla().getTipo() + " -- " + tele1.getPantalla().getTamaño() + " -- " + tele1.esSmart() + " -- " + tele1.estaEncendida());

        System.out.println(
                tele2.getMarca() + " -- " + tele2.getModelo() + " -- " + tele2.getPantalla().getResolucion() + " -- " + tele2.getPantalla().getTipo() + " -- " + tele2.getPantalla().getTamaño() + " -- " + tele2.esSmart() + " -- " + tele2.estaEncendida());
    }
}
