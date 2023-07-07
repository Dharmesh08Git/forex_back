package com.sprint.forex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.forex.entity.AdminVerification;


@Repository
public interface AdminVerificationRepository extends JpaRepository<AdminVerification,Integer> {

	public Optional<AdminVerification> findByAdminEmail(String adminEmail);

	

}
