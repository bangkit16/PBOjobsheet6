package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(3);
        Dosen ds1 = new Dosen("54221", "Bangkit", "Bandung", 10000); 
        Dosen ds2 = new Dosen("32543", "Maulana", "Prigi", 20000); 
        Dosen ds3 = new Dosen("54213", "Caniago", "Tulungaung", 30000); 
        ds1.setSKS(4);
        ds2.setSKS(5);
        ds3.setSKS(3);
        dg.addPegawai(ds1);
        dg.addPegawai(ds2);
        dg.addPegawai(ds3);
        dg.printSemuaGaji();
    }
}
