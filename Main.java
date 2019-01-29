import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int getal1;
        int getal2;
        String rekenuit;
        Scanner input = new Scanner(System.in);

        System.out.println("Vul het eerste getal in.");
            getal1 = input.nextInt();

        System.out.println("Vul het tweede getal in.");
            getal2 = input.nextInt();

        Scanner uitrekenen = new Scanner(System.in);
        System.out.println("Wat wil je met de getallen doen?");
        rekenuit = uitrekenen.next();

        if (rekenuit == "+");
        {
            System.out.println("Het antwoord is " + (getal1 + getal2));
        }

    }
}
