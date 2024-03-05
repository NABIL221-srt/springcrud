package ma.emsi.hospitalapp.repository;

import ma.emsi.hospitalapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
