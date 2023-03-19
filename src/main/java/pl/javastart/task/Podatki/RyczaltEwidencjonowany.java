package pl.javastart.task.Podatki;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, 0, PODATEK_15_PROCENT_RYCZALT, PODATEK_15_PROCENT_RYCZALT);
    }

    @Override
    public String info() {
        return "Ryczałt";
    }
}
