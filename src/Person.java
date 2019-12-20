import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {
    //Variabler rettet til
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String[] fritidsStringeresser; // Snitning, LOL, strikke
    String[] smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    double vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    int[] eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    @Override
    public String toString() {
        return "Navn: " + navn + "By" + by;
    }

    //Her typecastes variablerne om til en ny type
    int vaegt2 = (int) vaegt;
    byte hojde2 = (byte) hojde;


    public static void main(String[] args) {
        //Her oprettes et person objekt, og han tildeles nogle parametre
        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        //Eksempler på typecasting
        person.vaegt = (long) 670000000;
        person.husnummer = String.valueOf((int) 32);
        person.postNummer = Integer.parseInt( "4700");
        //udskriver værdierne der er typecastet
        System.out.println(person.husnummer + " " + person.postNummer);


    }

}
