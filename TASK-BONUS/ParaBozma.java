public class ParaBozma {
    public static void main(String[] args) {
        int tutar = 278;

        int yuzluk = tutar / 100;
        tutar = tutar % 100;

        int ellilik = tutar / 50;
        tutar = tutar % 50;

        int yirmilik = tutar / 20;
        tutar = tutar % 20;

        int beslik = tutar / 5;
        tutar = tutar % 5;

        int ikilik = tutar / 2;
        tutar = tutar % 2;

        int birlik = tutar;

        System.out.println("100 TL: " + yuzluk);
        System.out.println("50 TL: " + ellilik);
        System.out.println("20 TL: " + yirmilik);
        System.out.println("5 TL: " + beslik);
        System.out.println("2 TL: " + ikilik);
        System.out.println("1 TL: " + birlik);
    }
}
