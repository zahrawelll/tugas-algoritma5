 public class No1 {
        public static void main(String[] args) {
            // Loop untuk mencetak angka 1 sampai 6, tiga kali
            for (int i = 0; i < 3; i++) { // Mengulang sebanyak 3 kali
                for (int j = 1; j <= 6; j++) { // Mencetak angka 1 sampai 6
                    System.out.print(j + " "); // Mencetak angka di baris yang sama
                }
                System.out.println(); // Pindah ke baris baru setelah mencetak 1 sampai 6
            }
        }
    }
