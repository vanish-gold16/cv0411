public class Zlomek {
    int citatel;
    int jmenovatel;


    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(int jmenovatel) {
        if(jmenovatel>0) {
            this.jmenovatel = jmenovatel;
        }
    }
}
