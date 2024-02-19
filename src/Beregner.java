public class Beregner {
    public static void main(String[] args) {
        // Første opgave
        int x = 4;
        int y = 6;
        int sum = x + y;
        System.out.println(sum);
        int produkt = x * y;
        System.out.println(produkt);
        // Anden opgave
        Regnemaskine rm = new Regnemaskine(4, 6);
        System.out.println(rm.addition());
        System.out.println(rm.multiplikation());
        rm.x = 3;
        rm.y = 5;
        System.out.println(rm.addition());
        System.out.println(rm.multiplikation());
    }
}