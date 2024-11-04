public class Akvarium {
    private int sirka;
    private int delka;
    private int hloubka;
    private int voda;

    @Override
    public String toString() {
        return zaporneCiNe(sirka, delka, hloubka, voda) + ". " + vejdeCiNe(sirka, delka, hloubka, voda);
    }

    public String zaporneCiNe(int sirka, int delka, int hloubka, int voda){
        this.sirka = sirka;
        this.delka = delka;
        this.hloubka = hloubka;
        this.voda = voda;
        if(sirka > 0 && delka > 0 && hloubka > 0 && voda >= 0){
            return "vsechny rozmery jsou kladne";
        }
        else
            return "jeden nebo vic rozmeru jsou zaporne";
    }

    public String vejdeCiNe(int sirka, int delka, int hloubka, int voda){
        this.sirka = sirka;
        this.delka = delka;
        this.hloubka = hloubka;
        this.voda = voda;
        if(sirka*delka*hloubka >= voda){
            return "Voda vejde do akvariu";
        }
        else
            return "Voda nevejde do akvariu";
    }

    public Akvarium(int sirka, int delka, int hloubka, int voda) {
        this.sirka = sirka;
        this.delka = delka;
        this.hloubka = hloubka;
        this.voda = voda;
    }

    public float getVoda() {
        return voda;
    }

    public void setVoda(int voda) {
        this.voda = voda;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getDelka() {
        return delka;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public int getHloubka() {
        return hloubka;
    }

    public void setHloubka(int hloubka) {
        this.hloubka = hloubka;
    }
}
