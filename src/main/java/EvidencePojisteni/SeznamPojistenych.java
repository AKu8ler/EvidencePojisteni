package EvidencePojisteni;


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
    public void VypisPojistenychOsob() {
        System.out.println("Pojištěné Osoby: ");
        for (PojistenaOsoba osoba : seznamPojistenych) {
            System.out.println(osoba);
        }
    }
    public void VyhledavaniPodleJmena(String jmeno, String prijmeny) {
        for(PojistenaOsoba osoba: seznamPojistenych) {
            if (osoba.getJmeno().equalsIgnoreCase(jmeno) && osoba.getPrijmeny().equalsIgnoreCase(prijmeny)) {
                System.out.println("Výsledek vyhledávání: " + osoba);
                return;
            }
        }
        System.out.println("Osoba nebyla nalezena.");
    }
}
