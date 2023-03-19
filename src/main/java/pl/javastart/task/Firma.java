package pl.javastart.task;

import pl.javastart.task.Operacje.Wydatki;
import pl.javastart.task.Podatki.FormaOpodatkowania;
import pl.javastart.task.Operacje.Przychody;
import pl.javastart.task.Operacje.Transakcje;

public class Firma {

    private final int iloscOperacji = 1000;
    private String nazwa;
    private final Transakcje[] transakcje = new Transakcje[iloscOperacji];
    private FormaOpodatkowania formaOpodatkowania;
    private int licznikTransakcji = 0;

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
        for (int i = 0; i < licznikTransakcji; i++) {
            if (transakcje[i] instanceof Wydatki) {
                sumaWydatkow += transakcje[i].getKwota();
            }
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (int i = 0; i < licznikTransakcji; i++) {
            if (transakcje[i] instanceof Przychody) {
                sumaPrzychodow += transakcje[i].getKwota();
            }
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        transakcje[licznikTransakcji] = new Przychody(nazwa, wartosc);
        licznikTransakcji++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        transakcje[licznikTransakcji] = new Wydatki(nazwa, wartosc);
        licznikTransakcji++;
    }
}
