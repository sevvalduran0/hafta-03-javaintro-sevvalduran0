public class AlisverisListesi {
    public static void main(String[] args) {
        // UrUn bilgileri: urun adı, miktar, fiyat
        String[] urunler = {"Elma", "Ekmek", "Sut", "Yumurta", "Peynir"};
        int[] miktarlar = {2, 1, 3, 10, 1};
        double[] fiyatlar = {15.50, 10.00, 12.75, 2.50, 45.00};

        // Tablo başlığı
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Urun", "Miktar", "Fiyat", "Toplam");

        System.out.println("------------------------------------------------");

        double genelToplam = 0;

        // Her urun için tablo satırı yazdır
        for (int i = 0; i < urunler.length; i++) {
            double toplam = miktarlar[i] * fiyatlar[i];
            genelToplam += toplam;
            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urunler[i], miktarlar[i], fiyatlar[i], toplam);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10.2f%n", "", "", "Genel Toplam:", genelToplam);
    }
}
