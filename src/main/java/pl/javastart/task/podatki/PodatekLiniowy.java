package pl.javastart.task.podatki;

public class PodatekLiniowy extends  FormaOpodatkowania {
    private static final double PODATEK_19_PROCENT_LINIOWY = .19;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return przychodPoOdliczniuKosztow(przychody, koszty) * PODATEK_19_PROCENT_LINIOWY;
    }

    @Override
    public String info() {
        return "Podatek Liniowy";
    }
}
