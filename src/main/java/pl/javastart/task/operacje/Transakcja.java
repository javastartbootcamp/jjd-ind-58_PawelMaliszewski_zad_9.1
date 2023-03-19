package pl.javastart.task.operacje;

public class Transakcja {
    private String nazwa;
    private double kwota;

    public Transakcja(String nazwa, double kwota) {
        this.nazwa = nazwa;
        this.kwota = kwota;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String info() {
        return "Nazwa: " + nazwa + ", Kwota: " + kwota;
    }
}
