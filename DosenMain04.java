public class DosenMain04 {
    
    public static void main(String[] args) {
        
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen = "198007180001";
        dosen1.nama = "Dr. Kim Seon Ho, M. Eng";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2008;
        dosen1.bidangKeahlian = "Cyber Security";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();

        Dosen04 dosen2 = new Dosen04();
        dosen2.idDosen = "199312150007";
        dosen2.nama = "Prof. Ahn Hyo Seop";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2020;
        dosen2.bidangKeahlian = "Artificial Intelligence";

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Cloud Computing");
        System.out.println("Setelah perubahan keahlian:");
        dosen2.tampilInformasi();
        System.out.println();

        Dosen04 dosen3 = new Dosen04("199510030001", "Kim Ji Won S.Pd, M.Pd", 
        true, 2022, "Basis Data");

        dosen3.tampilInformasi();
        dosen3.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen3.hitungMasaKerja(2025) + " tahun");
    }
}
