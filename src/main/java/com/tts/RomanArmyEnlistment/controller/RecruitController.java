package com.tts.RomanArmyEnlistment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.RomanArmyEnlistment.model.Recruit;
import com.tts.RomanArmyEnlistment.service.RecruitService;
import com.tts.RomanArmyEnlistment.repository.RecruitRepository;



@Controller
public class RecruitController {
	@Autowired
	private RecruitService recruitService;
	
	private static List<Recruit> recruits = new ArrayList<>();
	
	@GetMapping("/recruits")
	public String displayRecruits(Model model) {
		List<Recruit> recruits = recruitService.findAll();
        model.addAttribute("recruits", recruits);
        model.addAttribute("enlist", recruits);
        return "recruits";
	}
	
	@GetMapping(value = "/enlist")
    public String newRecruit (Recruit recruit) {
        return "enlist";
		
    }
	
	private RecruitRepository recruitRepository;
	
    @PostMapping(value = "/enlist")
    public String create(Recruit recruit, Model model) {
    	recruitService.saveNewRecruit(recruit);
    	// recruitRepository.save(new Recruit(recruit.getId(), recruit.getName(), recruit.getCity()));
		recruits.add(recruit);
		model.addAttribute("id", recruit.getId());
		model.addAttribute("name", recruit.getName());
		model.addAttribute("city", recruit.getCity());
		return "result";
    }
	
}
