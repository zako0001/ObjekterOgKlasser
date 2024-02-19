public class HoldDemo {
    public static void main(String[] args) {

        Hold datamatikerHold = new Hold(40);

        datamatikerHold.addStudent(new Student("Peter"));
        datamatikerHold.addStudent(new Student("Bente"));
        datamatikerHold.addStudent(new Student("Thor"));
        datamatikerHold.addStudent(new Student("Inge"));

        System.out.println("\nBente går på holdet: " +
            datamatikerHold.searchForStudentByName("Bente")
        );

        System.out.println("Jesper går på holdet: " +
            datamatikerHold.searchForStudentByName("Jesper")
        );
    }
}