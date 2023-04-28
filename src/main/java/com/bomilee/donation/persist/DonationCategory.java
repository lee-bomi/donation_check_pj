package com.bomilee.donation.persist;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class DonationCategory {	//기부금 세부 분류

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String category;
	private int amount;	//필요금액
	private int donatedAmount;	//기부완료된 금액

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donationDetails_id")
	private Campaign campaign;
}
