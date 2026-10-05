import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, alasan = "";
        int jumlahDokumen = 0, peringkatJuara = 0, statusPendanaan = 0;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();
        if (namaMahasiswa.isEmpty()) {
            alasan = "Nama mahasiswa tidak boleh kosong";
        }

        System.out.print("Masukkan jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, Lainnya): ");
        jenisKegiatan = input.nextLine();
        if (jenisKegiatan.isEmpty()) {
            alasan = "Jenis kegiatan tidak boleh kosong";
        }
        
        if (
            jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("Mandiri") ||
            jenisKegiatan.equalsIgnoreCase("PKM") ||
            jenisKegiatan.equalsIgnoreCase("Lainnya")
        ) {
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                System.out.println("Masukkan status pendanaan PKM (0 = tidak lolos, 1 = lolos): ");
                statusPendanaan = input.nextInt();
                if (statusPendanaan != 1) {
                    alasan = "Status pendanaan PKM tidak valid";
                }
            }
            
            System.out.println("Masukkan peringkat juara (1-3): ");
            peringkatJuara = input.nextInt();
            if (peringkatJuara < 1 || peringkatJuara > 3) {
                System.out.println("Masukkan jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen < 0 || jumlahDokumen > 4) {
                    alasan = "Peringkat juara tidak valid";
                }
            } else {
                alasan = "Peringkat juara tidak valid";
            }
        } else {
            alasan = "Jenis kegiatan tidak valid";
        }

        System.out.println("Mahasiswa: " + namaMahasiswa);
        System.out.println("Jenis Kegiatan: " + jenisKegiatan);
        System.out.println("Peringkat Juara: " + peringkatJuara);
        System.out.println("Jumlah Dokumen: " + jumlahDokumen);
        System.out.println("Status Pendanaan: " + statusPendanaan);
        System.out.print("Status: ");
        if (!alasan.isEmpty()) {
            System.out.print(alasan);
            System.out.print(". Dana penghargaan tidak diberikan.\n");
        } else {
            System.out.println("Dana penghargaan diberikan.");
        }
    }
}
