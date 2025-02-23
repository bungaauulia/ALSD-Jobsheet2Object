public class MataKuliahMain04 {
    
    public static void main(String[] args) {
        
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.kodeMK = "SIB242004";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 6;
       
        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();
        System.out.println();

        MataKuliah04 mk2 = new MataKuliah04(
        "SIB242006", 
        "Basis Data", 
        2, 3);
        mk2.tampilkanInformasi();
        mk2.tambahJam(1);
        mk2.tampilkanInformasi();
        System.out.println();

        MataKuliah04 mk3 = new MataKuliah04(
        "SIB242008", 
        "Matematika Lanjut", 
        2, 2);
        mk3.tampilkanInformasi();
        mk3.kurangiJam(3);
        System.out.println();

    }


}
