package percobaan2;

public class ClassB extends ClassA{
    public int z;

    public void setZ(int z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("nilai Z:" + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah" + (x+y+z));
    }
}
