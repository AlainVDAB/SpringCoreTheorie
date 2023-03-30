package be.vdab.welkom.domain;

public class Land {
    private final String code;
    private final String naam;
    private final int oppervlakte;

    public Land(String code, String naam, int oppervlakte) {
        this.code = code;
        this.naam = naam;
        this.oppervlakte = oppervlakte;
    }

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }
}
