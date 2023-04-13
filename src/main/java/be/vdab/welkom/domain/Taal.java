package be.vdab.welkom.domain;

public class Taal {
    private final String code;
    private final String naam;

    public Taal(String code, String naam) {
        this.code = code;
        this.naam = naam;
    }

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }
}
