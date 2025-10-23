public class Heron {
    public static void main(String[] args) {
        // Kenar uzunlukları
        double a = 3, b = 4, c = 5;

        // Yarı çevre (s)
        double s = (a + b + c) / 2;

        // Alan (Heron formülü)
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonucu yazdır
        System.out.println("Ucgenin alanı: " + A);
    }
}
