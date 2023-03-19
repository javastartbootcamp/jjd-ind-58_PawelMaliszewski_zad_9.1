package pl.javastart.task.podatki;

public class WedlugSkaliPodatkowej extends FormaOpodatkowania {

    protected static final double PODATEK_18_PROCENT = .18;
    protected static final double PODATEK_32_PROCENT = .32;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, koszty);
    }

    protected double podatek(double przychod, double koszty) {
        double przychodPoOdlicznieuKosztow = przychodPoOdliczniuKosztow(przychod, koszty);
        if (przychodPoOdlicznieuKosztow <= KWOTA_WOLNA_OD_PODATKU) {
            return 0;
        } else if (przychodPoOdlicznieuKosztow <= PROG_PODATKOWY) {
            return (przychodPoOdlicznieuKosztow - KWOTA_WOLNA_OD_PODATKU) * PODATEK_18_PROCENT;
        }
        return (PROG_PODATKOWY - KWOTA_WOLNA_OD_PODATKU) * PODATEK_18_PROCENT
                    + (przychodPoOdlicznieuKosztow - PROG_PODATKOWY) * PODATEK_32_PROCENT;
    }

    @Override
    public String info() {
        return "Podatek naliczany od kwoty przychodów";
    }
}
