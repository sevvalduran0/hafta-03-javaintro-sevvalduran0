public class DaireHesaplama {
    public static void main(String[] args) {
        double yaricap = 5.5;
        double alan = Math.PI * yaricap * yaricap;  // πr^2
        double cevre = 2 * Math.PI * yaricap;       // 2πr

        System.out.println("Yaricap: " + yaricap);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }
}
