public class Trojuhelnik {
    private int a;
    private int b;
    private int c;

    @Override
    public String toString() {
        return "Strana a = " + a + "cm, strana b = " + b + "cm, strana c = " + c + "cm. Tento trojuhelnik "
                + lzeSestrojit(a, b, c) + ", " + zapornaCiNe(a, b, c);
    }

    public Trojuhelnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String lzeSestrojit(int a, int b, int c){
        if(c > a && c > b){
            if(c < (a+b)){
                return "lze sestrojit";
            }
            else
                return "nelze sestrojit";
        }
        else if(a > c && a > b){
            if(a < (c+b)){
                return "lze sestrojit";
            }
            else
                return "nelze sestrojit";
        }
        else if(b > c && b > a){
            if(b < (c+a)){
                return "lze sestrojit";
            }
            else
                return "nelze sestrojit";
        }
        else
            return "nelze sestrojit";
    }

    public String zapornaCiNe(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        if(a > 0 && b > 0 && c > 0){
            return "vsechny strany jsou sude";
        }
        else
            return "jedna nebo vic stran nejsou sude";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
