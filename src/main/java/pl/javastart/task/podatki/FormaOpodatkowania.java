package pl.javastart.task.podatki;

public class FormaOpodatkowania {

    protected static final double PROG_PODATKOWY = 100_000;
    protected static final double KWOTA_WOLNA_OD_PODATKU = 10_000;

    public double wyliczPodatek(double przychody, double koszty) {
        return 0;
    }

    protected double przychodPoOdliczniuKosztow(double przychod, double koszty) {
        return przychod - koszty;
    }

    public String info() {
        return "";
    }
}
