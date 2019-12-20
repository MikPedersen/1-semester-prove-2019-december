import java.awt.*;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     * for loop kører brugerne igennem
     */
    public void printBrugereArr() {
        for (int i = 0; i <brugere.length; i++) {
            System.out.println(brugere[i]);
        }
    }

    //for loop kører array gennem baglæns
    //Husk -1 da array altid started med at indsætte på position 0
    public void printBrugereReverseArr() {
        for (int i = brugere.length - 1; i >= 0; i--) {
            System.out.println(brugere[i]);
        }


    }

    public void waitingFor0() {
        Scanner input = new Scanner(System.in);
        while (input.nextInt() != 0){
            System.out.println("Enter a number");
        }
 
    }
}
