package ma.emsi.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity @Table(name="EMSI_Students") // Annotations JPA
@Data @AllArgsConstructor @NoArgsConstructor // Annotations Lombok
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="REGISTRATION_N", length = 40, unique = true)
    private String registrationNumber;

    @Column(name = "NAME", length = 30, nullable = false)
    private String fullName;

    @Temporal(TemporalType.DATE) //Date "que de l'heure" || Time "que de Temps" || TIMESTAMP "tout les deux"
    private Date birthday;

    private Boolean stillActive;

    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date lastConnection;
}