package com.wantedPreOnBoarding.wantedPreOnBoarding.recruit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {

}
