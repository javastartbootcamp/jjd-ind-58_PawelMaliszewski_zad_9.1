package pl.javastart.task.Podatki;

public class FormaOpodatkowania {

    protected static final double PROG_PODATKOWY = 100_000;
    protected static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    protected static final double PODATEK_15_PROCENT_RYCZALT = .15;
    protected static final double PODATEK_18_PROCENT = .18;
    protected static final double PODATEK_19_PROCENT_LINIOWY = .19;
    protected static final double PODATEK_32_PROCENT = .32;

    public double wyliczPodatek(double przychody, double koszty) {
        return 0;
    }

    protected double podatek(double przchod, double koszty, double podatekDoProgu, double podatekPowyzejProgu) {
        double kwota = 0;
        double przychodPoOdlicznieuKosztow = przychodPoOdliczniuKosztow(przchod, koszty);
        if (przchod <= PROG_PODATKOWY) {
            if (przychodPoOdlicznieuKosztow > KWOTA_WOLNA_OD_PODATKU && przychodPoOdlicznieuKosztow <= PROG_PODATKOWY) {
                kwota += (przychodPoOdlicznieuKosztow - KWOTA_WOLNA_OD_PODATKU) * podatekDoProgu;
            } else if (przychodPoOdlicznieuKosztow > 0 && przychodPoOdlicznieuKosztow < KWOTA_WOLNA_OD_PODATKU) {
                kwota = 0;
            }
        } else if (przychodPoOdlicznieuKosztow > PROG_PODATKOWY) {
            kwota = (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * podatekDoProgu
                    + (przychodPoOdlicznieuKosztow - PROG_PODATKOWY) * podatekPowyzejProgu;
        }
        return kwota;
    }

    protected double przychodPoOdliczniuKosztow(double przychod, double koszty) {
        return przychod - koszty;
    }

    public String info() {
        return "";
    }
}
