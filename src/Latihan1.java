import java.util.Scanner;

public class Latihan1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // SISTEM PENGHITUNG

        // DEKLARASI

        int pilihan_user;

        System.out.println("SELAMAT DATANG DI MESIN PENGHITUNG");
        System.out.println("Di sini anda dapat melakukan hal berikut: ");
        System.out.println("1. Perhitungan Sederhana");
        System.out.println("2. Menghitung Pythagoras");
        System.out.println("3. Konvesi Suhu / Jarak");
        System.out.println("4. Menghitung Bunga");
        System.out.println("5. Simulasi Cicilan");
        System.out.println();

        System.out.print("Nomor berapa yang ingin anda lakukan?(1-5) : ");
        pilihan_user = scanner.nextInt();

        switch (pilihan_user){
            case 1 -> perhitungan_sederhana();
            case 2 -> rumus_pythagoras();
            case 3 -> konversi_suhu();
            case 4 -> menghitung_bunga();
            case 5 -> simulasi_cicilan();
            default -> System.out.println("Mohon Pilih Nomor Yang Sesuai");
        }
        scanner.close();
        System.out.println();
    }
    static double perhitungan_sederhana() {

        System.out.println("Perhitungan Sederhana");

        return 0;
    }
    static double konversi_suhu() {

        System.out.println("Konvesi Suhu / Jarak");

        return 0;
    }
    static int rumus_pythagoras() {

        System.out.println("Menghitung Rumus pythagoras");

        return 0;
    }
    static double menghitung_bunga() {

        System.out.println("Menghitung Bunga");

        return 0;
    }
    static double simulasi_cicilan() {

        System.out.println("Simulasi Cicilan");

        return 0;
    }
}