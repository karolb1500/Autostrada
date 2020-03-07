package autostada;

import autostada.Pojazd;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {
    public static void main(String[] args) {
        Queue<Pojazd>  kolejkaPojazdow = new ArrayBlockingQueue(100);
        Pojazd motocykl = new Motocykl(200, "QWE12345", "Yamaha", "R1", Silnik.SPALINOWY);
        Pojazd motocykl1 = new Motocykl(200, "SBE12345", "Yamaha", "R1", Silnik.SPALINOWY);
        Pojazd motocykl2 = new Motocykl(200, "DWG12345", "Yamaha", "R1", Silnik.SPALINOWY);

        kolejkaPojazdow.add(motocykl);
        kolejkaPojazdow.add(motocykl1);
        kolejkaPojazdow.add(motocykl2);

        Pojazd samochod = new Samochod(3500, "CAR2000", "Toyotq", "GT", Silnik.SPALINOWY);
        Pojazd samochod1 = new Samochod(3500, "CAR4000", "Toyotq", "GT", Silnik.SPALINOWY);
        Pojazd samochod2 = new Samochod(3500, "CAR15000", "Tesla", "GT", Silnik.ELEKTRYCZNY);

        kolejkaPojazdow.add(samochod);
        kolejkaPojazdow.add(samochod1);
        kolejkaPojazdow.add(samochod2);

    Bramka bramka = new Bramka(200);

    for (Pojazd pojazd : kolejkaPojazdow) {
        bramka.obsluzPojazd(pojazd);
    }
        System.out.println(kolejkaPojazdow);


    }
}
