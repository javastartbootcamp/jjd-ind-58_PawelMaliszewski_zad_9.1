package pl.javastart.task.podatki;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final double PODATEK_15_PROCENT_RYCZALT = .15;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody);
    }

    protected double podatek(double przchod) {
        double kwota = 0;
        if (przchod <= PROG_PODATKOWY) {
            if (przchod > KWOTA_WOLNA_OD_PODATKU) {
                kwota = (przchod - KWOTA_WOLNA_OD_PODATKU) * PODATEK_15_PROCENT_RYCZALT;
            } else if (przchod > 0 && przchod < KWOTA_WOLNA_OD_PODATKU) {
                kwota = 0;
            }
        } else if (przchod > PROG_PODATKOWY) {
            kwota = (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * PODATEK_15_PROCENT_RYCZALT
                    + (przchod - PROG_PODATKOWY) * PODATEK_15_PROCENT_RYCZALT;
        }
        return kwota;
    }

    @Override
    public String info() {
        return "Ryczałt";
    }
}
