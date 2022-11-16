package Matematika;

public class Kalkulator {
    int bilangan01;
    int bilangan02;
    Operasi operasi;

    Kalkulator(int bilangan01, int bilangan02, Operasi operasi ){
        this.bilangan01 = bilangan01;
        this.bilangan02 = bilangan02;
        this.operasi = operasi;
    }

    void cetakHasil(String jenisOperasi){
        switch (jenisOperasi){
            case "TAMBAH":
                System.out.println("TAMBAH : " + this.operasi.tambah(bilangan01,bilangan02));
                break;
            case "BAGI":
                System.out.println("BAGI : " + this.operasi.bagi(bilangan01,bilangan02));
                break;
            case "KALI":
                System.out.println("KALI :" + this.operasi.kali(bilangan01,bilangan02));
                break;
            case "KURANG":
                System.out.println("KURANG : "+ this.operasi.kurang(bilangan01, bilangan02));
                break;
            default:
                System.out.println("TAMBAH : " + this.operasi.tambah(bilangan01,bilangan02));
                break;
        }
    }
}
