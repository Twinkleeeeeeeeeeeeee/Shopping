package com.briup.mapper;

import java.util.List;

import com.briup.pojo.Book;
import com.briup.pojo.RegisterUser;
import com.briup.service.Register;

//ӳ��ӿ�
public interface BooksMapper {
	//ӳ�䷽�� xmlӳ���ļ��� sql������ǩ��insert delete update select����Ӧid����ֵ
	
	public List<Book> findAllBook();
}
