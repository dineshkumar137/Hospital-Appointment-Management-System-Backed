package com.hospital.appointment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.appointment.model.Patient;
import com.hospital.appointment.repo.PatientRepository;


@Service
public class PatientService {
	 @Autowired
	    private PatientRepository patientRepository;

	    public List<Patient> getAllPatients() {
	        return patientRepository.findAll();
	    }

	    public Patient getPatientById(Long id) {
	        return patientRepository.findById(id).orElse(null);
	    }

	    public Patient savePatient(Patient patient) {
	        return patientRepository.save(patient);
	    }

	    public void deletePatient(Long id) {
	        patientRepository.deleteById(id);
	    }
	    
	    //comment to check push
}
