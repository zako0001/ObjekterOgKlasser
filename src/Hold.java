public class Hold {

    // Attributes
    private Student[] listOfStudents;
    private int cursor; // The lowest index number with a null element in the listOfStudents.

    // Constructor
    public Hold(int maxNumberOfStudents) {
        // Condition: Parameter maxNumberOfStudents has to be a positive number.
        listOfStudents = new Student[maxNumberOfStudents];
        cursor = 0;
    }

    // Methods
    public boolean addStudent(Student newStudent) {
        if (cursor < listOfStudents.length) {
            listOfStudents[cursor] = newStudent;
            cursor++;
            return true; // Success: Student added.
        }
        return false; // Failed: Student not added, because this "hold" is already full.
    }
    public boolean searchForStudentByName(String fullName) {
        for (int i = 0; i < cursor; i++) {
            if (listOfStudents[i].getFullName().equals(fullName)) {
                return true; // Success: Student found.
            }
        }
        return false; // Failed: Student not found.
    }
}