package com.bomilee.donation.persist.repository;

import com.bomilee.donation.persist.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
