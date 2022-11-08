public class Dosen extends Karyawan{
    private String prodi;
    private int nidsn;
    private int uanglembur = 100000;

    public Dosen(int nip, String newNama, String newAlamat, String newLahir, String newJenkel1, int newmasukTahun){
        this.nomorPegawai = nip;
        this.nama = newNama;
        this.alamat = newAlamat;
        this.lahir = newLahir;
        this.jeniskelamin = newJenkel1;
        this.tahunmasuk = newmasukTahun;
    }

    public void setProdi(String newprodi){
        this.prodi = newprodi;
    }
    public String getProdi(){
        return this.prodi;
    }

    public void setNomorIndukDosen(int newNomorIndukdosen){
        this.nidsn = newNomorIndukdosen;
    }

    public int getNomorIndukDosen(){
        return this.nidsn;
    }
    void displayDosen_prodi(){
        System.out.println("No Induk Dosen : " + this.nidsn );
        System.out.println("Jurusan yang diampu Dosen : " + this.prodi );
    }
    void display(){
        System.out.println("Nomor Pegawai : " + this.nomorPegawai);
        System.out.println("Nama : "+ this.nama);
        System.out.println("Alamat : "+ this.alamat);
        System.out.println("Lahir : "+ this.lahir);
        System.out.println("Jenis Kelamin : "+ this.jeniskelamin);
        System.out.println("Tahun Masuk : "+ this.tahunmasuk);
        System.out.println("Gaji Pokok : " + this.gaji);
    }
    @Override
    public  int getUangLembur(){
        return this.uanglembur;
    }
    @Override
    public int getLembur(){
        return (this.uanglembur * this.jam) + this.gaji;
    }

    void displaygajidosen(){
        System.out.println("Total Gaji : " + this.getLembur());
    }

}
