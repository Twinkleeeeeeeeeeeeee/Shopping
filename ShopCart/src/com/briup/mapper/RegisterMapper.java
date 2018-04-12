package com.briup.mapper;

import java.util.List;

import com.briup.pojo.RegisterUser;
import com.briup.service.Register;

//ӳ��ӿ�
public interface RegisterMapper {
	//ӳ�䷽�� xmlӳ���ļ��� sql������ǩ��insert delete update select����Ӧid����ֵ
	public void insertUser(RegisterUser registerUser);
	public RegisterUser findUser(int id);
	public String findUserByName(String name);
	public List<RegisterUser> findAllUser();
}
