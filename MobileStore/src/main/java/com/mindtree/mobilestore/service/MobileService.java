package com.mindtree.mobilestore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.mobilestore.dto.MobileDto;

@Service
public interface MobileService {
	List<MobileDto> getMobilesFromDB();

}
