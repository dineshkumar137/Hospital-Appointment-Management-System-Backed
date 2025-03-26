package com.hospital.appointment.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.appointment.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
