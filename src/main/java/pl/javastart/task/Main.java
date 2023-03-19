package pl.javastart.task;

import pl.javastart.task.podatki.NaCzarno;
import pl.javastart.task.podatki.PodatekLiniowy;
import pl.javastart.task.podatki.WedlugSkaliPodatkowej;
import pl.javastart.task.podatki.RyczaltEwidencjonowany;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 2000);

        janNowakServices.wyswietlPodsumowanie();

        Firma janosik = new Firma("Transport", new WedlugSkaliPodatkowej());
        janosik.dodajPrzychod("Transport", 150_000);
        janosik.dodajWydatek("Paliwo", 20_000);

        janosik.wyswietlPodsumowanie();

        Firma kowal = new Firma("Kowal", new PodatekLiniowy());
        kowal.dodajPrzychod("jakaś usługa", 200_000);
        kowal.dodajWydatek("Paliwo", 10_000);

        kowal.wyswietlPodsumowanie();
    }
}
