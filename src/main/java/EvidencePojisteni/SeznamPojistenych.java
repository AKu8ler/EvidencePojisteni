package EvidencePojisteni;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

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
}
