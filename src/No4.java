public class No4 {
    public static void main(String[] args) {
        // Jumlah baris yang akan dicetak
        int rows = 6;

        // Loop untuk setiap baris
        for (int i = 0; i < rows; i++) {
            // Mencetak bintang
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("* "); // Cetak bintang
            }

            // Mencetak angka
            for (int k = rows - i - 1; k < rows; k++) {
                System.out.print(k + " "); // Cetak angka
            }

            System.out.println(); // Pindah ke baris baru setelah mencetak
        }
    }

}
