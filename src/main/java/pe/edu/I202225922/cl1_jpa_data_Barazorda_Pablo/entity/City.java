package pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "city")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private Double ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Double Population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    @MapsId("countryCode")
    private Country country;
}
