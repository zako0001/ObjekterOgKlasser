public class Hilsen {
    private String navn;
    public Hilsen(String name) {
    navn = name;
    }
    /*
    public static String hej(String name) {
        return "Hej " + name + "!";
    }
    */
    public void hej() {
        System.out.println("Hej, jeg hedder " + navn);
    }
    public static void main(String[] args) {
        /*
        hej("Poul");
        String navn = "Anne";
        hej(navn);
        */
        /*
        String udskriv = hej("Signe");
        System.out.println(udskriv);
        */
        Hilsen h = new Hilsen("Zacharias");
        h.hej();
    }
}