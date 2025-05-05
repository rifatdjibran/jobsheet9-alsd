import java.util.Scanner;
 
 public class MahasiswaDemo18 {
 
     public static void main(String[] args) {
         StackTugasMahasiswa18 stack = new StackTugasMahasiswa18(5);
         Scanner scan = new Scanner(System.in);
         int pilih;
 
         do {
             System.out.println("\n=========================");
             System.out.println("\n Menu : ");
             System.out.println("1. Mengumpulkan Tugas");
             System.out.println("2. Menilai Tugas");
             System.out.println("3. Melihat Tugas Teratas");
             System.out.println("4. Melihat Daftar Tugas ");
             System.out.println("5. Melihat Tugas Terbawah");
             System.out.println("6. Melihat Jumlah Tugas");
             System.out.println("0. Keluar");
             System.out.print("Pilih: ");
             pilih = scan.nextInt();
             scan.nextLine();
             switch (pilih) {
                 case 1:
                     System.out.print("NIM: ");
                     String nim = scan.nextLine();
                     System.out.print("Nama: ");
                     String nama = scan.nextLine();
                     System.out.print("Kelas: ");
                     String kelas = scan.nextLine();
                     Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas);
                     stack.push(mhs);
                     System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                     break;
                 case 2:
                     Mahasiswa18 dinilai = stack.pop();
                     if (dinilai != null) {
                         System.out.println("Menilai tugas dari " + dinilai.nama);
                         System.out.print("Masukkan nilai (0 - 100) : ");
                         int nilai = scan.nextInt();
                         dinilai.tugasDinilai(nilai);
                         System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                         String biner = stack.konversiDesimalKeBiner(nilai);
                         System.out.println("Nilai Biner Tugas: " + biner);
                     } else {
                         System.out.println("Tidak ada tugas untuk dinilai.");
                     }
                     break;
                 
                 case 3:
                     Mahasiswa18 lihat = stack.peek();
                     if (lihat != null) {
                         System.out.println("Tugas terakhir dikumpulkan oleh: " + lihat.nama);
                     } else {
                         System.out.println("Tidak ada tugas untuk dilihat.");
                     }
                     break;
                 case 4:
                     System.out.println("Daftar semua tugas");
                     System.out.println("Nama\tNIM\tKelas");
                     stack.printStack();
                     break;
                 case 5:
                     Mahasiswa18 terbawah = stack.peekBottom();
                     if (terbawah != null) {
                         System.out.println("Tugas pertama dikumpulkan oleh: " + terbawah.nama);
                     }
                     break;
                 case 6:
                     System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                     break;
                 case 0:
                     System.out.println("Terima kasih!");
                     break;
                 default:
                     System.out.println("Pilihan tidak valid.");
             }
         } while (pilih != 0);
     }
 }