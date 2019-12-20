package Quiz;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Opretter et spørgsmål sætter parametre
        Sporgsmaal sporgsmaal = new Sporgsmaal();
        Svar svar = new Svar();
        sporgsmaal.setSporgsmaal("Hvor lang er afleveringsperioden på 1. semester prøven");
        sporgsmaal.setSvarmulighed1("3 timer");
        sporgsmaal.setSvarmulighed2("5 timer");
        sporgsmaal.setSvarmulighed3("7 timer");
        sporgsmaal.setPoint(100);
        sporgsmaal.setRigtigtSvar(sporgsmaal.getSvarmulighed3());
        System.out.println(sporgsmaal.getSporgsmaal());
        System.out.println(sporgsmaal.getSvarmulighed1() + ", " + sporgsmaal.getSvarmulighed2() + " eller " + sporgsmaal.getSvarmulighed3());
        svar.setSvar(input.nextLine());
        while (!sporgsmaal.getRigtigtSvar().equals(svar.getSvar())){
            System.out.println("Forkert prøv igen");
            svar.setSvar(input.nextLine());
        }
        System.out.println("Korrekt du fik " + sporgsmaal.getPoint() + " point");

    }
}
