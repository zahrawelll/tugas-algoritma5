public class No2 {
    public static void main(String[] args) {
        // Mengatur jumlah baris yang akan dicetak
        int rows = 3;

        // Loop untuk setiap baris
        for (int i = 1; i <= rows; i++) {
            // Loop untuk setiap kolom
            for (int j = 1; j <= 5; j++) {
                // Menggunakan percabangan untuk menentukan karakter yang dicetak
                if (i % 2 == 1) { // Baris ganjil (1 dan 3)
                    if (j % 2 == 1) { // Kolom ganjil
                        System.out.print("S "); // Cetak "S"
                    } else { // Kolom genap
                        System.out.print("0 "); // Cetak "0"
                    }
                } else { // Baris genap (2)
                    if (j % 2 == 1) { // Kolom ganjil
                        System.out.print("0 "); // Cetak "0"
                    } else { // Kolom genap
                        System.out.print("S "); // Cetak "S"
                    }
                }
            }
            System.out.println(); // Pindah ke baris baru setelah mencetak
        }
    }
}
