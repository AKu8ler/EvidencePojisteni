package EvidencePojisteni;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvidencePojisteniMain {
    public static void main(String[] args) {
        SeznamPojistenych seznamPojistenych = new SeznamPojistenych();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Evidence pojistěných");
        System.out.println("---------------------------");

        while(true) {
            System.out.println("1. Přidat osobu");
            System.out.println("2. Vypsat všechny pojištěné osoby");
            System.out.println("3. Vyhledat Osobu podle jména");
            System.out.println("4. Ukončit");
            System.out.print("Vyberte operaci: ");
            int volba = scanner.nextInt();
            scanner.nextLine();

            switch (volba) {
                case 1:
                    System.out.println("Zadejte Jmeno: ");
                    String jmeno = scanner.nextLine();

                    System.out.println("Zadejete Přijmení: ");
                    String prijmeni = scanner.nextLine();

                    System.out.println("Zadejte Věk: ");
                    int vek = scanner.nextInt();

                    System.out.println("Zadejte telefoni číslo: ");
                    int telefoniCislo = scanner.nextInt();

                    PojistenaOsoba osoba = new PojistenaOsoba(jmeno,prijmeni,vek,telefoniCislo);
                    seznamPojistenych.prijdeOsobu(osoba);
                    System.out.println("Osoba byla přidana mezi pojištěné.");
                    break;

                case 2:
                    seznamPojistenych.VypisPojistenychOsob();
                    break;

                case 3:
                    System.out.println("Zadej křestní jméno: ");
                    String hledejJmeno = scanner.nextLine();
                    System.out.println("Zadej příjmení: ");
                    String hledejPrijmeny = scanner.nextLine();
                    seznamPojistenych.VyhledavaniPodleJmena(hledejJmeno, hledejPrijmeny);
                    break;

                case 4:
                    System.out.println("Konec..");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Zadali jste špatnou volbu, zadejte volbu znovu: ");
            }
        }
    }
}
