package com.naver;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyHttpSessionListenerImpl
 *
 */

public class MyHttpSessionListenerImpl implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyHttpSessionListenerImpl() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // 세션이 생성되었을때
    	System.out.println("session 생성");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         //세션이 제거되었을때
    	System.out.println("session 제거");
    }
	
}
