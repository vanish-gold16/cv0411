import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Trojuhelnik trojuhelnik = new Trojuhelnik(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(trojuhelnik);

        System.out.println("**************************");

        System.out.print("Zadejte cislo: ");
        int cislo = scanner.nextInt();
        if(cislo == 0){
            System.out.println("Cislo je 0");
        }
        else if(cislo%2 == 0){
            System.out.println("Cislo " + cislo + " je sude");
        }
        else
            System.out.println("Cislo " + cislo + " je liche");

        System.out.println("**************************");

        System.out.println("Zadejte rozmery akvaria:");
        int stranaA = scanner.nextInt();
        int stranaB = scanner.nextInt();
        int stranaC = scanner.nextInt();
        System.out.print("Zadejte mnozstvi vody: ");
        int mnozstviVody = scanner.nextInt();

        Akvarium akvarium = new Akvarium(stranaA, stranaB, stranaC, mnozstviVody);

        System.out.println(akvarium);

        System.out.println("**************************");

        Ctverec ctverec = new Ctverec(10);

        System.out.println(ctverec);

        System.out.print("Zadejte novou stranu ctverce: ");
        ctverec.setDelkaStrany(scanner.nextInt());

        while(ctverec.delkaStrany<=0) {
            System.out.print("Zadejte novou stranu ctverce: ");
            ctverec.setDelkaStrany(scanner.nextInt());
        }

        System.out.println(ctverec);
        */
        System.out.println("**************************");

        String testovaOtazka = "Ve kterem roce byla zalozena 1. Ceskoslovenska republika?\n1) 1917\n2) 1918\n3) 1919\n" +
                "\"Správnou dopověď zadaj jako hodnotu 1, 2 nebo 3: ";
        System.out.print(testovaOtazka);
        TestovaOtazka otazka = new TestovaOtazka(testovaOtazka, 1, 2, 3,
                1918);
        int odpovedUzivatele = scanner.nextInt();
        if (odpovedUzivatele == otazka.odpoved1) {
            System.out.println(otazka.getOdpoved1() + " je spatna odpoved. Spravna odpoved je " + otazka.spravnaOdpoved);
        }
        else if (odpovedUzivatele == otazka.odpoved2) {
            System.out.println(otazka.getOdpoved2() + " je spravna odpoved.");
        }
        else if (odpovedUzivatele == otazka.odpoved3) {
            System.out.println(otazka.getOdpoved3() + " je spatna odpoved. Spravna odpoved je " + otazka.spravnaOdpoved);
        }
        else
            System.out.println("Takova odpoved neexistuje");

        System.out.println("**************************");

        Zlomek ab = new Zlomek(5, 3);
        System.out.println(ab);
        Zlomek bc = new Zlomek(scanner.nextInt(), scanner.nextInt());
        System.out.println(bc);
        Zlomek cd = new Zlomek(scanner.nextInt(), 2);
        System.out.println(cd);
    }
}