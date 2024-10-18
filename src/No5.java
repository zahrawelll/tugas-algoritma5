public class No5 {
    public static void main(String[] args) {
        // Menentukan jumlah elemen deret yang akan dicetak
        int n = 9;
        
        // Membuat array untuk menyimpan deret
        int[] sequence = new int[n];
        
        // Mengisi elemen pertama deret
        sequence[0] = 1; // Elemen pertama
        sequence[1] = 1; // Elemen kedua
        
        // Menghitung sisa elemen
        for (int i = 2; i < n; i++) {
            // Setiap elemen adalah jumlah dari tiga elemen sebelumnya
            sequence[i] = sequence[i - 1] + sequence[i - 2] + (i > 2 ? sequence[i - 3] : 0);
        }
        
        // Mencetak deret
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
