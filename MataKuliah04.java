public class MataKuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode MK:" + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int tbhJam) {
        jumlahJam += tbhJam;
        System.out.println("Jumlah jam setelah ditambah: " + jumlahJam + " jam");
    }

    void kurangiJam(int krgJam) {
        if (jumlahJam >= krgJam) {
            jumlahJam -= krgJam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam + " jam");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi");
        }
    }
public MataKuliah04() {

}
public MataKuliah04(String kodeMK, String nama, int sks, int jmlJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.sks = sks;
    jumlahJam = jmlJam;
}
}