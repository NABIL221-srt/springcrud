package ma.emsi.hospitalapp;

import ma.emsi.hospitalapp.entities.Patient;
import ma.emsi.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }
    @Bean
public CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            Patient p1 = Patient.builder()
                    .nom("Ali")
                    .prenom("benjelloun")
                    .dateNaissance(new Date())
                    .build();

            Patient p2 = Patient.builder()
                    .nom("bachir")
                    .prenom("abdou")
                    .dateNaissance(new Date())
                    .build();

            Patient p3 = Patient.builder()
                    .nom("said")
                    .prenom("alami")
                    .dateNaissance(new Date())
                    .build();
            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

           List<Patient> patients= patientRepository.findAll();
           patients.forEach(p ->{
               System.out.println(p.toString());
           });
        };
}
}
