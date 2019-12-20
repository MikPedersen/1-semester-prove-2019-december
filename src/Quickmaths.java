/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */
import java.util.Scanner;

public class Quickmaths {
    //udregner gennemsnittet af a og b
    public static int gennemsnit(int a, int b){
        int resultgennemsnit = (a + b)/2;
        return resultgennemsnit;
    }
    //udregner summen af a og b
    public static int sum(int a, int b){
        int resultsum = a + b;
        return resultsum;
    }
    //metode som kører et loop med udregninger
    public static void start(){
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter two numbers");
            int firstnumber = input.nextInt();
            int secondnumber = input.nextInt();
            System.out.println("Firstnumber is " + firstnumber);
            System.out.println("Secondnumber is " + secondnumber);
            System.out.println("Average: " + gennemsnit(firstnumber, secondnumber));
            System.out.println("Sum: " +sum(firstnumber, secondnumber));
        }
    }

    public static void main(String[] args) {
        start();
    }
}
