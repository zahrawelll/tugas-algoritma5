public class No3 {
    public static void main(String[] args) {
        // Jumlah baris yang akan dicetak
        int rows = 6;

        // Loop untuk setiap baris
        for (int i = rows; i >= 1; i--) {
            // Loop untuk mencetak angka 1 sebanyak i kali
            for (int j = 1; j <= i; j++) {
                System.out.print("1 "); // Cetak angka 1
            }
            System.out.println(); // Pindah ke baris baru setelah mencetak angka
        }
    }
}
