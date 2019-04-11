import javax.persistence.*;

@Entity
@Table(name = "Osoba")
@SecondaryTable(name = "Adres")
public class Person {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private double salary;

    @Column(table = "Adres")
    private String locality;
    @Column(table = "Adres")
    private String street;
    @Column(table = "Adres")
    private String zipCode;
}
