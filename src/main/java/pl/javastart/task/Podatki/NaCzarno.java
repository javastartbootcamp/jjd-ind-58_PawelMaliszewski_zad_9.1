package pl.javastart.task.Podatki;

public class NaCzarno extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return 0;
    }

    @Override
    public String info() {
        return "Brak";
    }
}
