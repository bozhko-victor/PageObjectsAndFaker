package guru.qa.safron;

public class Protein {
    String vkus;
    int cena;
    String brand;
    String tip;
    int ves;
    boolean banka;
    boolean paket;
    String[] aminoKisloty = {"Leycin", "Izoleycin", "Valin"};
    int [] countAmino = {2, 1, 1};

    public Protein(String vkus, String brand, boolean banka, boolean paket) {
        this.vkus = vkus;
        this.brand = brand;
        this.banka = banka;
        this.paket = paket;
    }

    public Protein() {
    }

    void settip(String str) {
        this.tip = str;
    }

    void setVes(int ves1) {
        if (ves > 0) {
            System.out.println("Prot est!");
        } else {
            System.out.println("Prota net!");
        }
        this.ves = ves1;
    }

    boolean isBankaOrNot() {
        return banka;
    }

    boolean isPaketOrNot() {
        return paket;
    }


    void open() {
        System.out.println("Vkusnyashki!");
        if (banka) {
            System.out.println("Protik v banke!");
        } else {
            System.out.println("Protik v pakete!");
        }

    }

    void printAmino() {
        for (int i = 0; i < aminoKisloty.length; i++) {
            System.out.println(aminoKisloty[i]);
        }



    }

    void printAminoCount() {
        for (int i = 0; i < countAmino.length; i++) {
            System.out.println(countAmino[i]);
        }



    }
}
