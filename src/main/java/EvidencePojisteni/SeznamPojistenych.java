package EvidencePojisteni;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SeznamPojistenych {
    private List<PojistenaOsoba> seznamPojistenych;

    public SeznamPojistenych() {
        seznamPojistenych = new ArrayList<>();
    }

    public void prijdeOsobu(PojistenaOsoba osoba) {
        seznamPojistenych.add(osoba);
    }

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

    public void vyhledavaniPodleJmena(String jmeno, String prijmeni) {
        boolean nalezeno = false;
        for (PojistenaOsoba osoba : seznamPojistenych) {
            if (osoba.getJmeno().equalsIgnoreCase(jmeno) && osoba.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println("Výsledek vyhledávání: " + osoba);
                nalezeno = true;
                break; // Zastavit hledání po nalezení první shody.
            }
        }

        if (!nalezeno) {
            System.out.println("Osoba nebyla nalezena.");
        }
    }

    public void smazatPojistenouOsobu(String telefoniCisloProSmazaniOsoby) {
        Iterator<PojistenaOsoba> iterator = seznamPojistenych.iterator();
        while (iterator.hasNext()) {
            PojistenaOsoba osoba = iterator.next();
            if (osoba.getTelefoniCislo().equals(telefoniCisloProSmazaniOsoby)) {
                iterator.remove(); // Odstraní osobu se shodným telCislen.
                System.out.println("Pojištěná osoba s telefoním číslem: " + telefoniCisloProSmazaniOsoby + " byla smazána.");
            }
            else {
                System.out.println("Pojištěná osoba s telefoním číslem: " + telefoniCisloProSmazaniOsoby + " nebyla nalezena.");

            }
        }

    }
}
