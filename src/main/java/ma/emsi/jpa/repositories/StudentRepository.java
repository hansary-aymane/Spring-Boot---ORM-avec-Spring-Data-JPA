package ma.emsi.jpa.repositories;

import ma.emsi.jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    //List<Student> deleteByFullName(String fullName);

    //List<Student> findAllByFullNameAndStillActiveIsTrue(String fullName);
    //List<Student> findAllByRegistrationNumberIsLike(String registrationNumber);

    /*
        @Query("select S from EMSI_STUDENTS S  where S.STILL_ACTIVE like :x")
        List<Student> chercherStudent(@Param("x") boolean val);
     */
}