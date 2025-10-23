public class SaniyeDonustur {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;          // 1 saat = 3600 saniye
        int dakika = (toplamSaniye % 3600) / 60; // Kalan saniyeden dakika hesaplama
        int saniye = toplamSaniye % 60;         // Kalan saniye

        // Saat:dakika:saniye formatında yazdırma
        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniye);
    }
}
