package com.briup.mapper;

import java.util.List;

import com.briup.pojo.RegisterUser;
import com.briup.service.Register;

//映射接口
public interface RegisterMapper {
	//映射方法 xml映射文件中 sql操作标签【insert delete update select】对应id属性值
	public void insertUser(RegisterUser registerUser);
	public RegisterUser findUser(int id);
	public String findUserByName(String name);
	public List<RegisterUser> findAllUser();
}
