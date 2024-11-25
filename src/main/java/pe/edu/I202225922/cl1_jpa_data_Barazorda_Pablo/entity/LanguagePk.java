package pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguagePk {

    private String countryCode;
    private String Language;

}
