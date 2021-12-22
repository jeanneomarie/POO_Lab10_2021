package facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
    private String nume;
    private int varsta;
    private String locatiaCurenta;
    private List<FacebookAccount> prieteni;

    public FacebookAccount(String nume, int varsta, String locatieCurenta) {
        this.nume = nume;
        this.locatiaCurenta = locatieCurenta;
        this.varsta = varsta;
        this.prieteni = new ArrayList<>();
    }

    public void adaugarePrieten(FacebookAccount prieten) {
        prieteni.add(prieten);
    }

    public void stergerePrieten(FacebookAccount prieten) {
        prieteni.remove(prieten);
    }

    public void afisarePrieteni() {
        for (FacebookAccount prieten : this.prieteni) {
            System.out.println(prieten.nume);
        }
    }

    public void afisarePrieteniLocatie(String locatie) {
        for (FacebookAccount prieten : this.prieteni) {
            if (prieten.locatiaCurenta.equals(locatie))
                System.out.println(prieten.nume);
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getLocatiaCurenta() {
        return locatiaCurenta;
    }

    public void setLocatiaCurenta(String locatiaCurenta) {
        this.locatiaCurenta = locatiaCurenta;
    }

    public List<FacebookAccount> getPrieteni() {
        return prieteni;
    }

    public void setPrieteni(List<FacebookAccount> prieteni) {
        this.prieteni = prieteni;
    }

}