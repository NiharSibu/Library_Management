package com.mindtree.mobilestore.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mobilestore.dto.MobileDto;
import com.mindtree.mobilestore.entity.Mobile;
import com.mindtree.mobilestore.repository.MobileRepository;
import com.mindtree.mobilestore.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileRepository mobileRepository;
	static ModelMapper modelMapper=new ModelMapper();
	@Override
	
	
	public List<MobileDto> getMobilesFromDB() {
	List<Mobile> mobiles = mobileRepository.findAll();
	List<MobileDto> result = new ArrayList<>();
	for (Mobile mobile : mobiles) {
		MobileDto mobileDto =modelMapper.map(mobile, MobileDto.class);
		result.add(mobileDto);
	}
		return result;
	}

}
