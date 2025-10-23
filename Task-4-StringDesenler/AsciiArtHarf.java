public class AsciiS {
    public static void main(String[] args) {
        int n = 7; // Harfin yüksekliği

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Üst, orta, alt yatay çizgiler
                if (i == 0 || i == n / 2 || i == n - 1)
                    System.out.print("*");
                // Üst yarıda sol dikey çizgi
                else if (i < n / 2 && j == 0)
                    System.out.print("*");
                // Alt yarıda sağ dikey çizgi
                else if (i > n / 2 && j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
