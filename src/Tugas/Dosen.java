package Tugas;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TarifSKS;

    Dosen(String nip,String nama, String alamat , int TarifSKS){
        super(nip, nama, alamat);
        this.TarifSKS = TarifSKS;
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        return jumlahSKS *TarifSKS;
    }
}
