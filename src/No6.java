public class No6 {
    public static void main(String[] args) {
        // Loop untuk mencetak tiga baris
        for (int i = 1; i <= 3; i++) { // i akan menjadi 1, 2, dan 3
            for (int j = 1; j <= 6; j++) { // Loop untuk mencetak 6 angka
                // Menggunakan percabangan untuk menentukan angka yang dicetak
                if (j == 1) {
                    System.out.print(i + " "); // Cetak angka i untuk kolom pertama
                } else {
                    System.out.print((i + j - 1) + " "); // Cetak angka selanjutnya
                }
            }
            System.out.println(); // Pindah ke baris baru setelah mencetak angka
        }
    }
}
