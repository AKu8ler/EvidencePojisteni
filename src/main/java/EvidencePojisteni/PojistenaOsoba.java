package EvidencePojisteni;

// Vytvoření osoby
public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefoniCislo;


    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefoniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefoniCislo;
    }

    //gettery / settery
    public String getJmeno() {

        return jmeno;
    }
    public String getPrijmeni() {

        return prijmeni;
    }
    public String getTelefoniCislo() {
        return telefoniCislo;
    }
// vypis osoby s udaji
    @Override
    public String toString() {
        return "Jméno: " + jmeno + " " + prijmeni + ", Věk: " + vek + ", Telefonní číslo: " + telefoniCislo;
    }
}
