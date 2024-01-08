import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Instantiem un obiect de fiecare tip
        Person person = new Person("John Doe", "john.doe@example.com");
        Student student = new Student("Alice Smith", "alice.smith@example.com", new int[]{90, 85, 78});
        Professor professor = new Professor("Dr. Johnson", "johnson@example.com", new String[]{"Math", "Physics"});

        // Afișăm informații despre fiecare obiect
        displayInfo(person);
        displayInfo(student);
        displayInfo(professor);
    }

    // Metodă pentru a afișa informațiile despre un obiect de tip Person
    private static void displayInfo(Person person) {
        System.out.println("\nInformații pentru: " + person.getClass().getSimpleName());
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());

        // Verificăm dacă obiectul este de tip Student sau Professor pentru a afișa informații specifice
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("Grades: " + Arrays.toString(student.getGrades()));
        } else if (person instanceof Professor) {
            Professor professor = (Professor) person;
            System.out.println("Courses: " + Arrays.toString(professor.getCourses()));
        }
    }
}
