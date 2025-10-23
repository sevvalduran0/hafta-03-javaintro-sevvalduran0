public class AsciiKare {
    public static void main(String[] args) {
        int boyut = 5; // Karenin boyutu (5x5)

        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
