package FirstInheritance;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar){
        System.out.println("Persegi panjang memiliki 4 sisi");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas(){
        return this.panjang*this.lebar;
    }

    @Override
    float keliling(){
        return 2*(this.panjang+this.lebar);
    }
}
