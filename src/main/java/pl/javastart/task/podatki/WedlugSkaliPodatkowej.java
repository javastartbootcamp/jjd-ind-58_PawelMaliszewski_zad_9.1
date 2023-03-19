package pl.javastart.task.podatki;

public class WedlugSkaliPodatkowej extends FormaOpodatkowania {

    protected static final double PODATEK_18_PROCENT = .18;
    protected static final double PODATEK_32_PROCENT = .32;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, koszty);
    }

    protected double podatek(double przchod, double koszty) {
        double kwota = 0;
        double przychodPoOdlicznieuKosztow = przychodPoOdliczniuKosztow(przchod, koszty);
        if (przchod <= PROG_PODATKOWY) {
            if (przychodPoOdlicznieuKosztow > KWOTA_WOLNA_OD_PODATKU && przychodPoOdlicznieuKosztow <= PROG_PODATKOWY) {
                kwota = (przychodPoOdlicznieuKosztow - KWOTA_WOLNA_OD_PODATKU) * PODATEK_18_PROCENT;
            } else if (przychodPoOdlicznieuKosztow > 0 && przychodPoOdlicznieuKosztow < KWOTA_WOLNA_OD_PODATKU) {
                kwota = 0;
            }
        } else if (przychodPoOdlicznieuKosztow > PROG_PODATKOWY) {
            kwota = (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * PODATEK_18_PROCENT
                    + (przychodPoOdlicznieuKosztow - PROG_PODATKOWY) * PODATEK_32_PROCENT;
        }
        return kwota;
    }

    @Override
    public String info() {
        return "Podatek naliczany od kwoty przychodów";
    }
}
