package FirstInheritance;

public class Main {
    public static void main(String[] args){
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println();

        Segitiga segitiga = new Segitiga();
        segitiga.hitung();
        segitiga.alas = 8;
        segitiga.tinggi = 10;
        segitiga.luas();
        segitiga.keliling();
        System.out.println();

        SegitigaSiku segitigaSiku = new SegitigaSiku(12, 16);
        segitigaSiku.hitung();
        segitigaSiku.pitagoras();
        segitigaSiku.luas();
        segitigaSiku.keliling();

        System.out.println();
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        System.out.println("Luas persegi panjang = " + persegiPanjang.luas());
        System.out.println("Keliling persegi panjang = " + persegiPanjang.keliling());

    }
}
