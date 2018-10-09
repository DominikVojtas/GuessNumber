
import java.util.Random;
import java.util.Scanner;

public class UhadniCislo {
    public static void main (String []args) {
        Random rand = new Random();
        int hadaneCislo = (50 + rand.nextInt(51));
        int pocetPokusov = 0;
        Scanner input = new Scanner (System.in);
        int hadaj;
        boolean vyhra = false;
        
        while (vyhra == false) {
            System.out.println("Uhadni cislo v intervale od 50 do 100");
            hadaj = input.nextInt();
            pocetPokusov++;
            if (hadaj == hadaneCislo) {
                vyhra = true;
                
            } else if (hadaj < hadaneCislo) {
                System.out.println("Tvoje cislo je prilis male");
            } else if (hadaj > hadaneCislo) {
                System.out.println("Tvoje cislo je prilis velke");
            }
                   
        }
                System.out.println("Vyhral si !");
                System.out.println("Cislo bolo " + hadaneCislo);
                System.out.println ("Trvalo ti to " + pocetPokusov + " pokusov");
    }
                
}
