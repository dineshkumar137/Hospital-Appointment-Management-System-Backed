package com.hospital.appointment.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.appointment.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}