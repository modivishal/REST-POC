package com.hk.web.listener;



import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jan 31, 2013
 * Time: 5:53:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HKStartupListener implements ServletContextListener  {


  public HKStartupListener() {
  }

  public void contextInitialized(ServletContextEvent event) {


    System.out.println("================  STARTING HK ADMIN  ==================");


  }


  public void contextDestroyed(ServletContextEvent sce) {

    System.out.println("================  SHUTTING DOWN  ==================");
    
  }
}
