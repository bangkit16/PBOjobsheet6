package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;

    DaftarGaji(int total){
        listPegawai = new Pegawai[total];
    }
    public void addPegawai(Pegawai pegawai){
        for(int i = 0; i<listPegawai.length ; i++){
            if(listPegawai[i] == null){
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }
    public void printSemuaGaji(){
        for(int i=0; i<listPegawai.length ; i++){
            System.out.println("Nama : " + listPegawai[i].getNama());
            System.out.println("NIP : " + listPegawai[i].nip);
            System.out.println("Alamat : " + listPegawai[i].alamat);
            System.out.println("Gaji : " + listPegawai[i].getGaji());
        }
    }
}
