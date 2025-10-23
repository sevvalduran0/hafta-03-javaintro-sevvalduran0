public class BMIHesapla {
    public static void main(String[] args) {
        double kilo = 55;       // kg
        double boyCm = 157;     // cm
        double boy = boyCm / 100; // metreye çevirme

        double bmi = kilo / (boy * boy);

        System.out.printf("Vucut Kitle Indeksi (BMI): %.2f\n", bmi);
    }
}

