public class Powers {
    public static void main(String[] args) {
        // a değerleri 1'den 5'e kadar
        for (int a = 1; a <= 5; a++) {
            int aSquared = a * a;   // a^2
            int aCubed = a * a * a; // a^3
            
            System.out.println("a = " + a + ", a^2 = " + aSquared + ", a^3 = " + aCubed);
        }
    }
}
