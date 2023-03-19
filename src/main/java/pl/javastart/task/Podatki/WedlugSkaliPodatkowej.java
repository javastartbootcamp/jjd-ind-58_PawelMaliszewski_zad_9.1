package pl.javastart.task.Podatki;

public class WedlugSkaliPodatkowej extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, koszty, PODATEK_18_PROCENT, PODATEK_32_PROCENT);
    }

    @Override
    public String info() {
        return "Podatek naliczany od kwoty przychodów";
    }
}
