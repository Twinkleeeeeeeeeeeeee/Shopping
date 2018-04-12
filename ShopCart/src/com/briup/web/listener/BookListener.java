package com.briup.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.briup.service.GetBook;

/**
 * Application Lifecycle Listener implementation class BookListener
 *
 */
public class BookListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public BookListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	GetBook getBook = new GetBook();
    	
    	ServletContext servletContext = sce.getServletContext();
    	servletContext.setAttribute("list", getBook.books());
    	
    }
	
}
