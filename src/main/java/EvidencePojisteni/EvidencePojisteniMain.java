package EvidencePojisteni;


import java.util.Scanner;
import java.util.InputMismatchException;


public class EvidencePojisteniMain {
    public static void main(String[] args) {
        SeznamPojistenych seznamPojistenych = new SeznamPojistenych();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("1. Přidat osobu");
            System.out.println("2. Vypsat všechny pojištěné osoby");
            System.out.println("3. Vyhledat osobu podle jména");
            System.out.println("4. Ukončit");
            System.out.print("Vyberte operaci: ");

            int volba = -1; // Inicializace na neplatnou hodnotu

            try {
                volba = scanner.nextInt();
                scanner.nextLine(); // Spotřebovat zbytek řádku

                switch (volba) {
                    case 1:
                        System.out.println("Zadejte jméno: ");
                        String jmeno = scanner.nextLine();

                        System.out.println("Zadejte příjmení: ");
                        String prijmeni = scanner.nextLine();

                        System.out.println("Zadejte věk: ");
                        int vek = scanner.nextInt();

                        System.out.println("Zadejte telefonní číslo: ");
                        scanner.nextLine();
                        String telefoniCislo = scanner.nextLine();


                        PojistenaOsoba osoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefoniCislo);
                        seznamPojistenych.prijdeOsobu(osoba);
                        System.out.println("Osoba byla přidána mezi pojištěné.");
                        break;

                    case 2:
                        seznamPojistenych.vypisPojisteneOsoby();
                        break;

                    case 3:
                        System.out.println("Zadejte křestní jméno: ");
                        String hledejJmeno = scanner.nextLine();

                        System.out.println("Zadejte příjmení: ");
                        String hledejPrijmeni = scanner.nextLine();

                        seznamPojistenych.vyhledavaniPodleJmena(hledejJmeno, hledejPrijmeni);
                        break;

                    case 4:
                        System.out.println("Konec..");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Zadali jste špatnou volbu, zadejte volbu znovu: ");
                }
            } catch (InputMismatchException e) {
                // Pokud uživatel nezadá číslo, chyba bude zachycena a program bude pokračovat.
                System.out.println("Chyba: Zadali jste neplatný vstup. Zadejte číslo volby.");
                scanner.nextLine(); // Spotřebovat neplatný vstup
            }
        }
    }
}
