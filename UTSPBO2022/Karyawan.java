public class Karyawan {
    protected int nomorPegawai;
    protected String nama;
    protected String alamat;
    protected String lahir;
    protected String jeniskelamin;
    protected int tahunmasuk;
    protected int gaji = 2000000;
    protected int jam;
    private int uangLembur;

    public void waktuLembur(int waktu){
        this.jam = waktu;
    }

    public int tampilinWaktuLembur(){
        return this.jam;
    }
    protected void setUangLembur(int lemburan){
        this.uangLembur = lemburan;
    }
    public  int getUangLembur(){
        return this.uangLembur;
    }
    public int getLembur(){
        return (this.uangLembur * this.jam) + this.gaji;
    }

}