package EvidencePojisteni;

// Vytvoření osoby
public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefoniCislo;

    // Konstruktor pro inicializaci údajů o osobě.
    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefoniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefoniCislo;
    }

    // Getter pro získání jména osoby.
    public String getJmeno() {
        return jmeno;
    }

    // Getter pro získání příjmení osoby.
    public String getPrijmeni() {
        return prijmeni;
    }

    // Getter pro získání telefonního čísla osoby.
    public String getTelefoniCislo() {
        return telefoniCislo;
    }

    // Přetížená metoda toString pro výpis údajů o osobě.
    @Override
    public String toString() {
        return "Jméno: " + jmeno + " " + prijmeni + ", Věk: " + vek + ", Telefonní číslo: " + telefoniCislo;
    }
}
