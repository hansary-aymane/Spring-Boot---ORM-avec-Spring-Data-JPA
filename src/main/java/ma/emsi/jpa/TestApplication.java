package ma.emsi.jpa;

import ma.emsi.jpa.entities.Student;
import ma.emsi.jpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add students
        System.out.printf("******************* Insertion *******************");
        /**/
            for (int i = 0; i < 100; i++) {
            studentRepository.save(
                    new Student(null, "A"+(i+1), "Anonymous", new Date(), true, null));
            }


        // Find all students
        System.out.printf("\n******************* All students *******************");
        /*
            List<Student> students = studentRepository.findAll();
            students.forEach(s -> {
            System.out.printf(s.toString() + "\n");
        });
        */

        // Find student by id
        System.out.printf("\n******************* Student By Id *******************");
        /*
            Scanner scanner = new Scanner(System.in);
            System.out.printf("\nEnter an id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student student = studentRepository.findById(id).orElse(null);
            if(student != null){
                System.out.printf(student.toString());
            }
        */

        // Update student
        System.out.printf("\n******************* Update Student *******************");
        /*
            student.setStillActive(false);
            studentRepository.save(student);
        */

        // Delete student
        System.out.printf("\n******************* Delete Student *******************");
        /*
            studentRepository.deleteById(6);
        */
    }
}