public class TestovaOtazka {
    String textOtazky;
    int odpoved1;
    int odpoved2;
    int odpoved3;
    int spravnaOdpoved;

    @Override
    public String toString() {
        return textOtazky;
    }

    public TestovaOtazka(String textOtazky, int odpoved1, int odpoved2, int odpoved3, int spravnaOdpoved) {
        this.textOtazky = textOtazky;
        this.odpoved1 = odpoved1;
        this.odpoved2 = odpoved2;
        this.odpoved3 = odpoved3;
        this.spravnaOdpoved = spravnaOdpoved;
    }

    public String getTextOtazky() {
        return textOtazky;
    }

    public void setTextOtazky(String textOtazky) {
        this.textOtazky = textOtazky;
    }

    public int getOdpoved1() {
        return 1917;
    }

    public void setOdpoved1(int odpoved1) {
        this.odpoved1 = odpoved1;
    }

    public int getOdpoved2() {
        return 1918;
    }

    public void setOdpoved2(int odpoved2) {
        this.odpoved2 = odpoved2;
    }

    public int getOdpoved3() {
        return 1919;
    }

    public void setOdpoved3(int odpoved3) {
        this.odpoved3 = odpoved3;
    }

    public int getSpravnaOdpoved() {
        return spravnaOdpoved;
    }

    public void setSpravnaOdpoved(int spravnaOdpoved) {
        this.spravnaOdpoved = spravnaOdpoved;
    }
}
