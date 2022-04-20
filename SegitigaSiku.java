package FirstInheritance;

public class SegitigaSiku extends Segitiga {
    float alas;
    float tinggi;
    float sisi_miring;

    public SegitigaSiku(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    void pitagoras() {
        sisi_miring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        System.out.println("Sisi miring = " + sisi_miring);
    }

    @Override
    float luas(){
        float luasSiku = (alas*tinggi)/2;
        System.out.println("Luas segitiga siku-siku = " + luasSiku);
        return luasSiku;
    }

    @Override
    float keliling(){
        float kll = alas+tinggi+sisi_miring;
        System.out.println("Keliling segtiga siku-siku = " + kll);
        return kll;
    }
}


