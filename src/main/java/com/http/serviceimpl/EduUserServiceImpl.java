package com.http.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.http.dao.EduUserDAO;
import com.http.model.EduUser;
import com.http.service.EduUserService;



@Service
public class EduUserServiceImpl implements EduUserService {

	@Autowired
	private EduUserDAO eduuserDao;
	
	public List<EduUser> queryUser(EduUser user) {
		//页面总条数
		return eduuserDao.getById(user);
	}

}
