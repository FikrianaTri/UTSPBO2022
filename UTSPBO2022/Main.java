public class Main {
    public static void main(String[] args) throws Exception {
        Tendik pegawai1 = new Tendik(20000101,"Samsudin", "Solo","23 September 1994","Laki-Laki", 2021);
        pegawai1.display();
        pegawai1.waktuLembur(20);
        pegawai1.setUangLembur(50000);
        pegawai1.displaygajitendik();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(20000201, "Miftah", "Yogyakarta","27 Juni 1986" , "Perempuan", 2002);
        dosen1.setNomorIndukDosen(987123);
        dosen1.setProdi("Teknik Informatika");
        dosen1.display();
        dosen1.displayDosen_prodi();
        dosen1.waktuLembur(6);
        dosen1.displaygajidosen();
    }
}