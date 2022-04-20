package FirstInheritance;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    public Segitiga(){
        System.out.println("Segitiga memiliki 3 sisi");
    }

    public void hitung() {
        System.out.println("Menghitung luas dan keliling segitiga");
    }

    @Override
    float luas(){
        float luas_segitiga = (alas*tinggi)/2;
        System.out.println("Luas segitiga = " + luas_segitiga);
        return luas_segitiga;
    }

}



