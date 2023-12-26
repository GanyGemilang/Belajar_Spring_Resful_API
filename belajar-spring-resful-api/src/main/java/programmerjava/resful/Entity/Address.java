package programmerjava.resful.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Addresses")
public class Address {

    @Id
    private String id;

    private  String street;

    private  String city;

    private  String province;

    private  String country;

    @Column(name = "postal_code")
    private  String postalCode;

    @ManyToOne
    @JoinColumn(name = "ContatcId", referencedColumnName = "id")
    private Contact contact;
}
