package EvidencePojisteni;


import java.util.Scanner;
import java.util.InputMismatchException;


public class EvidencePojisteniMain {
    public static void main(String[] args) {
        //vytvoreni konstance seznamu pojistenych
        SeznamPojistenych seznamPojistenych = new SeznamPojistenych();
        Scanner scanner = new Scanner(System.in);

        // "interface" uvod do aplikace
        System.out.println("---------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------");

        // cyklus pro opetovne pouzivani operaci
        while (true) {
            System.out.println("1. Přidat osobu");
            System.out.println("2. Vypsat všechny pojištěné osoby");
            System.out.println("3. Vyhledat osobu podle jména");
            System.out.println("4. Odstraněni osoby podle telefoniho čisla");
            System.out.println("5. Ukončit..");
            System.out.printf("volba:");

            int volba = -1; // Inicializace na neplatnou hodnotu

            // použití try-catch pro zachycení neplatné volby operace
            try {
                volba = scanner.nextInt();
                scanner.nextLine(); // Spotrebovani radku

                switch (volba) { // metoda switch použíta pro výběr operaci
                    case 1: // pridani uzivatele do seznamu
                        System.out.println("Zadejte jméno: ");
                        String jmeno = scanner.nextLine().trim();

                        System.out.println("Zadejte příjmení: ");
                        String prijmeni = scanner.nextLine().trim();

                        System.out.println("Zadejte věk: ");
                        int vek = scanner.nextInt();

                        System.out.println("Zadejte telefonní číslo: ");
                        scanner.nextLine();
                        String telefoniCislo = scanner.nextLine().trim();


                        PojistenaOsoba osoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefoniCislo);
                        seznamPojistenych.prijdeOsobu(osoba);
                        System.out.println("Osoba byla přidána mezi pojištěné.");
                        break;

                    case 2: // vypis seznamu pojistenych osob
                        seznamPojistenych.vypisPojisteneOsoby();
                        break;

                    case 3: // hledani v seznamu podle jmena a prijmeni
                        System.out.println("Zadejte křestní jméno: ");
                        String hledejJmeno = scanner.nextLine();

                        System.out.println("Zadejte příjmení: ");
                        String hledejPrijmeni = scanner.nextLine();

                        seznamPojistenych.vyhledavaniPodleJmena(hledejJmeno, hledejPrijmeni);
                        break;

                    case 4: // smazani osoby podle telefoniho cisla ze seznamu
                        System.out.println("Zadejte telefoni cislo osoby ke smazání:");
                        String telefoniCisloProVymazaniOsoby = scanner.nextLine().trim();
                        seznamPojistenych.smazatPojistenouOsobu(telefoniCisloProVymazaniOsoby);
                        break;

                    case 5: // ukončení programu
                        System.out.println("Konec..");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Zadali jste špatnou volbu, zadejte volbu znovu: ");
                }
            } catch (InputMismatchException e) { // Pokud uživatel nezadá číslo, chyba bude zachycena a program bude pokračovat.
                System.out.println("Chyba: Zadali jste neplatný vstup. Zadejte číslo volby.");
                scanner.nextLine();
            }
        }
    }
}
