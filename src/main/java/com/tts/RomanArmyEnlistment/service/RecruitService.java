package com.tts.RomanArmyEnlistment.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.RomanArmyEnlistment.model.Recruit;
import com.tts.RomanArmyEnlistment.repository.RecruitRepository;

@Service
public class RecruitService {
	private RecruitRepository recruitRepository;

	@Autowired
	public RecruitService(RecruitRepository recruitRepository) {
	    this.recruitRepository = recruitRepository;
	}

	public List<Recruit> findAll(){
        return (List<Recruit>) recruitRepository.findAll();
    }
        
    public void save(Recruit recruit) {
        recruitRepository.save(recruit);
    }
    
    public Recruit saveNewRecruit(Recruit recruit) {

        return recruitRepository.save(recruit);
    }
}
