package com.hospital.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.appointment.model.BillingPayments;
import com.hospital.appointment.services.BillingService;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping
    public List<BillingPayments> getAllBillings() {
        return billingService.getAllBillings();
    }

    @GetMapping("/{id}")
    public BillingPayments getBillingById(@PathVariable Long id) {
        return billingService.getBillingById(id); 
    }

    @PostMapping
    public BillingPayments createBilling(@RequestBody BillingPayments billing) {
        return billingService.saveBilling(billing);
    }

    @DeleteMapping("/{id}")
    public void deleteBilling(@PathVariable Long id) {
        billingService.deleteBilling(id);
    }
}