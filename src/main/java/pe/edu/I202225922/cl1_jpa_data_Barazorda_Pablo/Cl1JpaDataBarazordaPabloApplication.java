package pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity.Country;
import pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity.Countrylanguage;
import pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.entity.LanguagePk;
import pe.edu.I202225922.cl1_jpa_data_Barazorda_Pablo.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataBarazordaPabloApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataBarazordaPabloApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		/**
		 * testeo
		 **/

		// País
		// Country country = new Country("PER","Peru","South America","Western South America", 1285216.0, 1821, 32971854.0, 76.7,202500.0,195000.0,"Perú","Republic","Pedro Castillo", 7.0, "PE", null);

		// Lenguajes
		// Countrylanguage countrylanguage01 = new Countrylanguage(new LanguagePk("PER","Spanish"), "T", 70.0, country);

		// Countrylanguage countrylanguage02 = new Countrylanguage(new LanguagePk("PER","English"), "T", 20.0, country);

		// Countrylanguage countrylanguage03 = new Countrylanguage(new LanguagePk("PER","Aymara"), "T", 10.0, country);

	    //  Agregamos lenguajes

		// country.setCountrylanguage(List.of(countrylanguage01, countrylanguage02, countrylanguage03));

		// Save

		// countryRepository.save(country);

		/**
		 * findById
		 * **/


		// Optional<Country> optionalArg = countryRepository.findById("ARG");

		// optionalArg.ifPresentOrElse(
		//		(country) -> {
		//			System.out.println("Languages spoken in Argentina:");
		//			country.getCountrylanguage().forEach(language -> System.out.println(language.getLenguagePk()));
		//		},
		//		() -> {
					// Si no se encuentra Argentina, buscar Perú
		//			Optional<Country> optionalPeru = countryRepository.findById("PER");
		//			optionalPeru.ifPresentOrElse(
		//					(country) -> {
		//						System.out.println("Languages spoken in Peru:");
		//						country.getCountrylanguage().forEach(language -> System.out.println(language.getLenguagePk()));
		//					},
		//					() -> {
		//						System.out.println("No country found");
		//					}
		//			);
		//		}
	//	);


		/**
		 * delete
		 * **/

		// Eliminar

		// countryRepository.deleteById("COL");
		// countryRepository.deleteById("ARG");

		// Notificacion

		// System.out.println("Países 'COL' y 'ARG' eliminados junto con sus ciudades y lenguajes correspondientes.");

		// Consultar lenguajes usados en "ARG" y "PER"
		Optional<Country> optionalArg = countryRepository.findById("ARG");

		optionalArg.ifPresentOrElse(
				(country) -> {
					System.out.println("Lenguajes usados en Argentina:");
					country.getCountrylanguage().forEach(language -> System.out.println(language.getLenguagePk()));
				},
				() -> {
					// Si no se encuentra Argentina, buscar Perú
					Optional<Country> optionalPeru = countryRepository.findById("PER");
					optionalPeru.ifPresentOrElse(
							(country) -> {
								System.out.println("Lenguajes usados en Peru:");
								country.getCountrylanguage().forEach(language -> System.out.println(language.getLenguagePk()));
							},
							() -> {
								System.out.println("No se encontró país");
							}
					);
				}

		);
	}
}
