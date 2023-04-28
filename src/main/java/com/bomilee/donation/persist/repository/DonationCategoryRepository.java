package com.bomilee.donation.persist.repository;

import com.bomilee.donation.persist.DonationCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationCategoryRepository extends JpaRepository<DonationCategory, Long> {

}
