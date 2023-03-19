package pl.javastart.task.podatki;

public class PodatekLiniowy extends  FormaOpodatkowania {
    private static final double PODATEK_19_PROCENT_LINIOWY = .19;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, koszty);
    }

    private double podatek(double przchod, double koszty) {
        double kwota = 0;
        double przychodPoOdlicznieuKosztow = przychodPoOdliczniuKosztow(przchod, koszty);
        if (przchod <= PROG_PODATKOWY) {
            if (przychodPoOdlicznieuKosztow > KWOTA_WOLNA_OD_PODATKU && przychodPoOdlicznieuKosztow <= PROG_PODATKOWY) {
                kwota = (przychodPoOdlicznieuKosztow - KWOTA_WOLNA_OD_PODATKU) * PODATEK_19_PROCENT_LINIOWY;
            } else if (przychodPoOdlicznieuKosztow > 0 && przychodPoOdlicznieuKosztow < KWOTA_WOLNA_OD_PODATKU) {
                kwota = 0;
            }
        } else if (przychodPoOdlicznieuKosztow > PROG_PODATKOWY) {
            kwota = (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * PODATEK_19_PROCENT_LINIOWY
                    + (przychodPoOdlicznieuKosztow - PROG_PODATKOWY) * PODATEK_19_PROCENT_LINIOWY;
        }
        return kwota;
    }

    @Override
    public String info() {
        return "Podatek Liniowy";
    }
}
