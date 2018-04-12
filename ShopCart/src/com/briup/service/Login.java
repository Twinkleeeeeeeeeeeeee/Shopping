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

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String userName = request.getParameter("userid");
		String password = request.getParameter("password");
		session = new MyBatisSqlSessionFactory().openSession();
		mapper = session.getMapper(RegisterMapper.class);
		List<RegisterUser> users = new ArrayList<RegisterUser>();
		users = mapper.findAllUser();
		for(RegisterUser user:users) {
			String dbName = user.getName();
			String dbPassword = user.getPassword();
			if(userName.equals(dbName)&&password.equals(dbPassword)) {
				response.sendRedirect("index.html");
			}else {
				try {
					throw new CustomerServiceException("”√ªß√˚√‹¬Î¥ÌŒÛ");
				} catch (CustomerServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
