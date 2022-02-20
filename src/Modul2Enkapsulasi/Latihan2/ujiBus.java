package Modul2Enkapsulasi.Latihan2;

public class ujiBus {

    public static void main(String[] args) {
       Bus busMini = new Bus (21);
       busMini.cetak();
       busMini.addPenumpang(20);
       busMini.cetak();
       
       Bus busSedang = new Bus (20);
       busSedang.cetak();
       busSedang.addPenumpang(20);
       busSedang.cetak();
       
    }
    
}
