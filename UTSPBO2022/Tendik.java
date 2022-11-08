public class Tendik extends Karyawan{
    public int jam;

    public Tendik(int nip, String newnama, String newalamat, String newttl, String newJenkel2, int newmasuktahun){
        this.nomorPegawai = nip;
        this.nama = newnama;
        this.alamat = newalamat;
        this.lahir = newttl;
        this.jeniskelamin = newJenkel2;
        this.tahunmasuk = newmasuktahun;
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

    void displaygajitendik(){
        System.out.println("Jumlah Jam Lembur : "+ this.tampilinWaktuLembur() + " Jam");
        System.out.println("Gaji Setelah Bonus Lembur: "+ this.getLembur());
    }
}