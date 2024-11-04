public class Ctverec {
    int delkaStrany;

    @Override
    public String toString() {
        return "Delka strany je " + delkaStrany + "cm, obvod = " + obvod(delkaStrany) + "cm, obsah = "
                + obsah(delkaStrany);
    }

    public int obvod(int delkaStrany){
        return delkaStrany*4;
    }

    public int obsah(int delkaStrany){
        return delkaStrany*delkaStrany;
    }

    public Ctverec(int delkaStrany) {
        this.delkaStrany = delkaStrany;
    }

    public int getDelkaStrany() {
        return delkaStrany;
    }

    public void setDelkaStrany(int delkaStrany) {
        if(delkaStrany >= 0){
            this.delkaStrany = delkaStrany;
        }
    }
}
