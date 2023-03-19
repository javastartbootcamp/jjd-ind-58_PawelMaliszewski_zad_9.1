package pl.javastart.task.Podatki;

public class PodatekLiniowy extends  FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return podatek(przychody, koszty, PODATEK_19_PROCENT_LINIOWY, PODATEK_19_PROCENT_LINIOWY);
    }

    @Override
    public String info() {
        return "Podatek Liniowy";
    }
}
