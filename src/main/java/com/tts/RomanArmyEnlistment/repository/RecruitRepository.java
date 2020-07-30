package com.tts.RomanArmyEnlistment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.RomanArmyEnlistment.model.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository <Recruit, Long> {

}
