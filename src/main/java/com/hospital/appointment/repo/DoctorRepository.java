package com.hospital.appointment.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.appointment.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}