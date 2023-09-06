package EvidencePojisteni;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeznamPojistenych {

    private List<PojistenaOsoba> seznamPojistenych;

    public SeznamPojistenych() {
        seznamPojistenych = new ArrayList<>();
    }

    // Metoda pro přidání osoby do seznamu pojistěných osob.
    public void prijdeOsobu(PojistenaOsoba osoba) {
        seznamPojistenych.add(osoba);
    }

    // Metoda pro výpis pojistěných osob.
    public void vypisPojisteneOsoby() {
        if (seznamPojistenych.isEmpty()) {
            System.out.println("Seznam pojištěných osob je prázdný.");
        } else {
            System.out.println("Pojištěné osoby:");
            for (PojistenaOsoba osoba : seznamPojistenych) {
                System.out.println(osoba);
            }
        }
    }

    // Metoda pro vyhledání osob podle jména a příjmení.
    public void vyhledavaniPodleJmena(String jmeno, String prijmeni) {
        boolean nalezeno = false;
        for (PojistenaOsoba osoba : seznamPojistenych) {
            if (osoba.getJmeno().equalsIgnoreCase(jmeno) && osoba.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println("Výsledek vyhledávání: " + osoba);
                nalezeno = true;
            }
        }
        if (!nalezeno) {
            System.out.println("Osoba nebyla nalezena.");
        }
    }

    // Metoda pro smazání pojistěné osoby podle telefonního čísla.
    public void smazatPojistenouOsobu(String telefoniCisloProSmazaniOsoby) {
        Iterator<PojistenaOsoba> iterator = seznamPojistenych.iterator();
        boolean nalezene = false;

        while (iterator.hasNext()) {
            PojistenaOsoba osoba = iterator.next();
            if (osoba.getTelefoniCislo().equals(telefoniCisloProSmazaniOsoby)) {
                iterator.remove();
                nalezene = true;
                System.out.println("Pojištěná osoba s telefoním číslem: " + telefoniCisloProSmazaniOsoby + " byla smazána.");
            }
        }

        if (!nalezene) {
            System.out.println("Pojištěná osoba s telefoním číslem: " + telefoniCisloProSmazaniOsoby + " nebyla nalezena.");
        }
    }
}
