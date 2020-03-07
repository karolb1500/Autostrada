package autostada;

public class KalkulatorOplat implements KalkulatorOplatStandardowych {
    private final int oplata;

    public KalkulatorOplat(int oplata) {
        this.oplata = oplata;
    }

    public int obliczOplate(Pojazd pojazd) {
        return oplata;
    }
}
