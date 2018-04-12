package com.briup.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.briup.dao.MyBatisSqlSessionFactory;
import com.briup.exception.CustomerServiceException;
import com.briup.mapper.RegisterMapper;
import com.briup.pojo.RegisterUser;

import oracle.jdbc.util.Login;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SqlSession session = null;
		RegisterMapper mapper=null;
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("userid");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String country = request.getParameter("country");
		String province =request.getParameter("province");
		String city = request.getParameter("city");
		String street1 = request.getParameter("street1");
		String street2 = request.getParameter("street2");
		String address = province+city+street1;
		int zip = Integer.parseInt(request.getParameter("zip"));
		int telephone =Integer.parseInt(request.getParameter("cellphone"));
		String email = request.getParameter("email");
		RegisterUser user = new RegisterUser(name, password, address, zip, telephone, email);
		List<RegisterUser> users = new ArrayList<RegisterUser>();
		session = new MyBatisSqlSessionFactory().openSession();
		mapper = session.getMapper(RegisterMapper.class);
		users = mapper.findAllUser();
		
		for(RegisterUser user2: users) {
			if(user2.getName().equals(name)) {
				try {
					throw new CustomerServiceException("用户名存在");
				} catch (CustomerServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				mapper.insertUser(user);
			}
		}
		//遍历另一种写法
		/*for(int i=0;i<users.size();i++) {
			if(users.get(i).getName().equals(name)) {
				try {
					throw new CustomerServiceException("用户名存在");
				} catch (CustomerServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				mapper.insertUser(user);
			}
		}*/
			
		session.commit();
		session.close();
		response.sendRedirect("login.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
