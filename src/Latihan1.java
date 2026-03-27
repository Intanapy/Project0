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
        System.out.println("3. Konvesi Suhu");
        System.out.println("4. Menghitung Bunga");
        System.out.println("5. Simulasi Cicilan");
        System.out.println();

        System.out.print("Nomor berapa yang ingin anda lakukan?(1-5) : ");
        pilihan_user = scanner.nextInt();
        scanner.nextLine();

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
        int angka1;
        int angka2;
        char operator;

        System.out.println("Perhitungan Sederhana");
        System.out.print("Input angka ke-1: ");
        angka1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input operator (+, -, /, *, %): ");
        operator = scanner.nextLine().charAt(0);

        System.out.print("Input angka ke-2: ");
        angka2 = scanner.nextInt();

        switch (operator) {
            case '+' -> System.out.println("Hasil: " + (angka1 + angka2));
            case '-' -> System.out.println("Hasil: " + (angka1 - angka2));
            case '/' -> System.out.println("Hasil: " + (angka1 / angka2));
            case '*' -> System.out.println("Hasil: " + (angka1 * angka2));
            case '%' -> System.out.println("Hasil: " + (angka1 % angka2));
            default -> System.out.println("MASUKAN OPERATOR YANG BENAR!");
        };

        return 0;
    }
    static double rumus_pythagoras() {
        String sisi;
        double alas;
        double tinggi;
        double miring;

        System.out.println("Menghitung Rumus pythagoras");

        System.out.print("Input sisi yang ingin anda cari (miring, tegak, alas): Sisi ");
        sisi = scanner.nextLine().toLowerCase();

        if (sisi.equals("miring")) {
            System.out.print("Input alas: ");
            alas = scanner.nextDouble();
            System.out.print("Input tinggi: ");
            tinggi = scanner.nextDouble();

            miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
            System.out.printf("Sisi miring: %.2f\n", miring);
        }
        else if (sisi.equals("tegak")) {
            System.out.print("Input sisi miring: ");
            miring = scanner.nextDouble();
            System.out.print("Input alas: ");
            alas = scanner.nextDouble();

            tinggi = Math.sqrt(Math.pow(miring, 2) - Math.pow(alas, 2));
            System.out.printf("Sisi tegak: %.2f\n", tinggi);
        }
        else if (sisi.equals("alas")) {
            System.out.print("Input sisi miring: ");
            miring = scanner.nextDouble();
            System.out.print("Input tinggi: ");
            tinggi = scanner.nextDouble();

            alas = Math.sqrt(Math.pow(miring, 2) - Math.pow(tinggi, 2));
            System.out.printf("Alas: %.2f\n", alas);
        }
        else {
            System.out.println("MOHON MASUKAN SISI YANG SESUAI!");
        }

        return 0;
    }
    static double konversi_suhu() {
        int satuan;
        double suhu;

        System.out.println("KONVERSI SUHU");

        System.out.println("1. Celcius -> Fahrenheit");
        System.out.println("2. Celcius -> Reamur");
        System.out.println("3. Celcius -> Kelvin");
        System.out.println("4. Fahrenheit -> Celcius");
        System.out.println("5. Fahrenheit -> Reamur");
        System.out.println("6. Fahrenheit -> Kelvin");
        System.out.println("7. Reamur -> Fahrenheit");
        System.out.println("8. Reamur -> Kelvin");
        System.out.println("9. Reamur -> Celcius");
        System.out.println("10. Kelvin -> Fahrenheit");
        System.out.println("11. Kelvin -> Celcius");
        System.out.println("12. Kelvin -> Reamur");

        System.out.print("Pilih Konversi Satuan: ");
        satuan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input Suhu: ");
        suhu = scanner.nextDouble();

        switch (satuan) {
            case 1 -> System.out.println(suhu + "C = " + ((9.0/5 * suhu) + 32) + "F");
            case 2 -> System.out.println(suhu + "C = " + (4.0/5 * suhu) + "R");
            case 3 -> System.out.println(suhu + "C = " + (suhu + 273) + "K");
            case 4 -> System.out.println(suhu + "F = " + (5.0/9 * (suhu - 32)) + "C");
            case 5 -> System.out.println(suhu + "F = " + (4.0/9 * (suhu - 32)) + "R");
            case 6 -> System.out.println(suhu + "F = " + (5.0/9 * (suhu - 32) + 273) + "K");
            case 7 -> System.out.println(suhu + "R = " + ((9.0/4 * suhu) + 32) + "R");
            case 8 -> System.out.println(suhu + "R = " + (5.0/4 * suhu + 273) + "K");
            case 9 -> System.out.println(suhu + "R = " + (5.0/4 * suhu) + "C");
            case 10 -> System.out.println(suhu + "K = " + ((9.0/5 * (suhu - 273)) + 32) + "F");
            case 11 -> System.out.println(suhu + "K = " + (suhu - 273) + "C");
            case 12 -> System.out.println(suhu + "K = " + (4.0/5 * (suhu - 273)) + "R");
            default -> System.out.println("MASUKAN SATUAN YANG SESUAI!");
        };

        return 0;
    }
    static double menghitung_bunga() {
        double setoran_awal;
        double persentase_bunga;
        double bunga;
        int durasi;
        double total;
        double hasil_akhir = 0;

        System.out.println("Menghitung Bunga");

        System.out.print("Input setoran awal anda: ");
        setoran_awal = scanner.nextInt();

        System.out.print("Input persentase bunga tahunan: ");
        persentase_bunga =scanner.nextDouble() / 100;

        System.out.print("Input durasi anda menyimpan uang: ");
        durasi = scanner.nextInt();

        hasil_akhir = setoran_awal;

        for (int i = 1; i <= durasi; i++){
            hasil_akhir = hasil_akhir + (hasil_akhir * persentase_bunga);
        }

        System.out.println("Hasil tabungan anda selama " + durasi + " tahun adalah: " + hasil_akhir);

        return 0;
    }
    static double simulasi_cicilan() {
        int pinjaman;
        double bunga;
        double persentase;
        int durasi;
        double total;
        double cicilan;

        System.out.println("Simulasi Cicilan");

        System.out.print("Input jumlah pinjaman: ");
        pinjaman = scanner.nextInt();

        System.out.print("Input durasi pinjaman (bulan): ");
        durasi = scanner.nextInt();

        System.out.print("Input persentase bunga pertahun: ");
        persentase = scanner.nextDouble() / 100;

        bunga = pinjaman * persentase;
        total = pinjaman + bunga;
        cicilan = total / durasi;

        System.out.println("Jumlah pinjaman: " + pinjaman);
        System.out.printf("Persentase bunga: %.0f\n", bunga);
        System.out.printf("Total pinjaman: %.0f\n", total);
        System.out.printf("Cicilan perbulan: %.0f\n", cicilan);

        return 0;
    }
}