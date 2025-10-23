public class MilToKilometre {
    public static void main(String[] args) {
        // Mil değerleri
        int[] milValues = {1, 5, 10, 20, 50};
        double conversionRate = 1.609; // 1 mil = 1.609 km

        System.out.println("Mil\tKilometre");
        System.out.println("----------------");

        // Döngü ile tüm mil değerlerini kilometreye çevir
        for (int mil : milValues) {
            double km = mil * conversionRate;
            System.out.println(mil + "\t" + km);
        }
    }
}
