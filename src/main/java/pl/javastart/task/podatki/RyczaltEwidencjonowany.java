package pl.javastart.task.podatki;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final double PODATEK_15_PROCENT_RYCZALT = .15;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return przychody * PODATEK_15_PROCENT_RYCZALT;
    }

    @Override
    public String info() {
        return "Ryczałt";
    }
}
