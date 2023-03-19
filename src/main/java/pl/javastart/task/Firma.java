package pl.javastart.task;

import pl.javastart.task.podatki.FormaOpodatkowania;
import pl.javastart.task.operacje.Transakcja;

public class Firma {

    private final int iloscOperacji = 1000;
    private String nazwa;
    private final Transakcja[] przychody = new Transakcja[iloscOperacji];
    private final Transakcja[] wydatki = new Transakcja[iloscOperacji];
    private FormaOpodatkowania formaOpodatkowania;
    private int licznikPrzychodow = 0;
    private int licznikWydatkow = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.info());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł",
                formaOpodatkowania.wyliczPodatek(zsumujPrzychody(), zsumujWydatki()));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (int i = 0; i < licznikWydatkow; i++) {
            sumaWydatkow += wydatki[i].getKwota();
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (int i = 0; i < licznikPrzychodow; i++) {
            sumaPrzychodow += przychody[i].getKwota();
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody[licznikPrzychodow] = new Transakcja(nazwa, wartosc);
        licznikPrzychodow++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki[licznikWydatkow] = new Transakcja(nazwa, wartosc);
        licznikWydatkow++;
    }
}
