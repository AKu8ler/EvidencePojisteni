package EvidencePojisteni;

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

    public String getJmeno() {

        return jmeno;
    }
    public String getPrijmeni() {

        return prijmeni;
    }
    public String getTelefoniCislo() {
        return telefoniCislo;
    }

    @Override
    public String toString() {
        return "Jméno: " + jmeno + " " + prijmeni + ", Věk: " + vek + ", Telefonní číslo: " + telefoniCislo;
    }
}
