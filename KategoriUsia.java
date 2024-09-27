import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Variabel untuk menyimpan usia pengguna
        int usia = -1;
        
        // Meminta input dari pengguna dengan validasi input
        while (usia < 0) {
            System.out.print("Masukkan usia Anda: ");
            if (scanner.hasNextInt()) {
                usia = scanner.nextInt();
                
                if (usia < 0) {
                    System.out.println("Error: Usia harus berupa angka positif.");
                }
            } else {
                System.out.println("Error: Input tidak valid. Masukkan angka positif.");
                scanner.next(); // Membaca input yang salah agar dapat memulai loop lagi
            }
        }
        
        // Menentukan kategori usia
        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Kategori: Lansia");
        }
        
        // Menutup scanner
        scanner.close();
    }
}
