package com.briup.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.briup.pojo.Book;
import com.briup.pojo.OrderForm;
import com.briup.pojo.OrderLine;

/**
 * Servlet implementation class ShopCart
 */
public class ShopCart extends HttpServlet {
	Map<Integer,OrderLine> map = new TreeMap<Integer,OrderLine>();
	private static final long serialVersionUID = 1L;
	private int num = 1;
	private double total;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int bookId = Integer.parseInt(request.getParameter("id"));//书ID
		String name = request.getParameter("name");//书名
		double price = Double.parseDouble(request.getParameter("price"));//书价格
		Book book = new Book(bookId, name, price);
		if(map.containsKey(bookId)) {
			num = map.get(bookId).getNum()+1;
		}
		book.setPrice(price*num);
		OrderLine orderLine = new OrderLine(bookId, num, book);
		map.put(bookId,orderLine);
		for(OrderLine bookprice:map.values()) {
			total+=bookprice.getBook().getPrice();
		}
		
		HttpSession session =request.getSession();
		session.setAttribute("books", map);
		session.setAttribute("total", total);
		
		response.sendRedirect("shopcart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
