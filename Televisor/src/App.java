import Televisores.*;

public class App {
    public static void main(String[] args) throws Exception {
        Televisor tele1 = new Televisor("Samsung", "The Frame", "OLED", 55, "4k", true, false);

        Televisor tele2 = new Televisor("LG", "SmartTV", "HDTV", 45, "1080p", false, true);

        System.out.println(
                tele1.getMarca() + " -- " + tele1.getModelo() + " -- " + tele1.getResolucion()
                        + " -- " + tele1.getTipo() + " -- " + tele1.getTamañoDePantalla() + " -- " + tele1.esSmart()
                        + " -- " + tele1.estaEncendida());

        System.out.println(
                tele2.getMarca() + " -- " + tele2.getModelo() + " -- " + tele2.getResolucion()
                        + " -- " + tele2.getTipo() + " -- " + tele2.getTamañoDePantalla() + " -- " + tele2.esSmart()
                        + " -- " + tele2.estaEncendida());
    }
}
