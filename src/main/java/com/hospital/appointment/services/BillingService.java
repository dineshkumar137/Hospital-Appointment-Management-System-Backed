package com.hospital.appointment.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.appointment.model.BillingPayments;
import com.hospital.appointment.repo.BillingRepository;

@Service
public class BillingService {
	 
	 private final BillingRepository billingRepository;

	    @Autowired
	    public BillingService(BillingRepository billingRepository) {
	        this.billingRepository = billingRepository;
	    }

	    public List<BillingPayments> getAllBillings() {
	        return billingRepository.findAll();
	    }

//	    public Optional<BillingPayments> getBillingById(Long id) {
//	        return billingRepository.findById(id);
//	    }

	    public BillingPayments saveBilling(BillingPayments billing) {
	        return billingRepository.save(billing);
	    }

	    public void deleteBilling(Long id) {
	        billingRepository.deleteById(id);
	    }
	    public BillingPayments getBillingById(Long id) {
	        return billingRepository.findById(id).orElse(null);
	    }
}
