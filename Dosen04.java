public class Dosen04 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int lamaKerja;

    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusAktif){
        this.statusAktif = statusAktif;
        if (statusAktif) {
            System.out.println("Dosen ini aktif.");
        } else {
            System.out.println("Dosen ini tidak aktif.");
        }
    }
    


    int hitungMasaKerja(int tahunSkrg) {
        lamaKerja = tahunSkrg - tahunBergabung;
        return lamaKerja;
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

public Dosen04() {
}

public Dosen04(String id, String nm, boolean status, int thnGabung, String bidangKeahlian) {
    idDosen = id;
    nama = nm;
    statusAktif = status;
    tahunBergabung = thnGabung;
    this.bidangKeahlian = bidangKeahlian;
}
}

   