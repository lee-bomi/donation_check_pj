package com.bomilee.donation.persist.repository;

import com.bomilee.donation.persist.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

}
