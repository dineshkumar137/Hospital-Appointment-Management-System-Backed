package com.hospital.appointment.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.appointment.model.BillingPayments;


@Repository
public interface BillingRepository extends JpaRepository<BillingPayments, Long> {

	List<BillingPayments> findAll();

	Optional<BillingPayments> findById(Long id);

	void deleteById(Long id);

	BillingPayments save(BillingPayments billing);

}