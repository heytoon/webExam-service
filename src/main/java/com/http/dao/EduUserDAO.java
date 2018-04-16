
package com.http.dao;

import java.util.List;

import com.http.model.EduUser;



public interface EduUserDAO {

	public Integer getRowCount(EduUser user);
	
	public List<EduUser> getById(EduUser user);
}