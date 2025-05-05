import java.util.Scanner;

public class MainSurat18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(10);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat         : ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = scanner.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = scanner.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)    : ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();

                    Surat18 suratBaru = new Surat18(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    Surat18 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat sedang diproses:");
                        diproses.tampilkanInfo();
                    }
                    break;
                case 3:
                    Surat18 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampilkanInfo();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scanner.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}