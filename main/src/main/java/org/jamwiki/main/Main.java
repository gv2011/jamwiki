package org.jamwiki.main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Main {

  public static void main(String[] args) throws Exception {
    new ContextLoaderListener();
    
    Server server = new Server(1080);
    
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");
    context.setResourceBase(System.getProperty("java.io.tmpdir"));
    server.setHandler(context);

    XmlWebApplicationContext wac = new XmlWebApplicationContext();
    wac.setServletContext(context.getServletContext());
    wac.refresh();
    context.addServlet(new ServletHolder("jamwiki", new DispatcherServlet(wac)), "/*");

    server.start();
    server.dumpStdErr();
    server.join();
  }
}
