package com.mindtree.mobilestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.mobilestore.dto.MobileDto;
import com.mindtree.mobilestore.service.MobileService;

@CrossOrigin(origins = "*")
@RestController
public class MobileController {
	
	@Autowired
	MobileService mobileservice;
	
	@GetMapping("/mobiles")
	List<MobileDto> getMobileFromService(){
		List<MobileDto> mobiles = mobileservice.getMobilesFromDB();
		return mobiles;
	}
	
}
