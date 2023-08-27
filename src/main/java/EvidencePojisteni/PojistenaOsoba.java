package EvidencePojisteni;

public class PojistenaOsoba {
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    private String jmeno;

    public String getPrijmeny() {
        return prijmeny;
    }

    public void setPrijmeny(String prijmeny) {
        this.prijmeny = prijmeny;
    }

    private String prijmeny;

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    private int vek;

    public int getTelefoniCislo() {
        return telefoniCislo;
    }

    public void setTelefoniCislo(int telefoniCislo) {
        this.telefoniCislo = telefoniCislo;
    }

    private int telefoniCislo;

    public PojistenaOsoba(String jmeno,String prijmeny,int vek, int telefoniCislo){
        this.jmeno = jmeno;
        this.prijmeny = prijmeny;
        this.vek = vek;
        this.telefoniCislo = telefoniCislo;
    }

    @Override
    public String toString() {
        return "Jmeno: " + jmeno + " " + prijmeny + ", Age: " + vek + ", Telefoni číslo: " + telefoniCislo;
    }
}
