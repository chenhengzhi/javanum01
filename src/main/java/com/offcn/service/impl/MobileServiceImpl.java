package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.MobileDao;
import com.offcn.po.Mobile;
import com.offcn.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	@Autowired
	private MobileDao mobileDao;

	@Override
	public Mobile getArea(String mobileNumber) {
		return mobileDao.getArea(mobileNumber);
		
	}

}
