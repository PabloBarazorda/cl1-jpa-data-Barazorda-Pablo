package pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countrylanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countrylanguage {

    @EmbeddedId
    private LanguagePk LenguagePk;
    private String IsOfficial;
    private Double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    @MapsId("countryCode")
    private Country country;
}
