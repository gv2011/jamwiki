package org.jamwiki.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;

public class ServletContextForwarder implements ServletContext{
  
  private final ServletContext delegate;
  
  public ServletContextForwarder(ServletContext delegate) {
    this.delegate = delegate;
  }

  public String getContextPath() {
    return delegate.getContextPath();
  }

  public ServletContext getContext(String uripath) {
    return delegate.getContext(uripath);
  }

  public int getMajorVersion() {
    return delegate.getMajorVersion();
  }

  public int getMinorVersion() {
    return delegate.getMinorVersion();
  }

  public int getEffectiveMajorVersion() {
    return delegate.getEffectiveMajorVersion();
  }

  public int getEffectiveMinorVersion() {
    return delegate.getEffectiveMinorVersion();
  }

  public String getMimeType(String file) {
    return delegate.getMimeType(file);
  }

  public Set<String> getResourcePaths(String path) {
    throw new UnsupportedOperationException();
  }

  public URL getResource(String path) throws MalformedURLException {
    return Objects.requireNonNull(ServletContextForwarder.class.getResource(path));
  }

  public InputStream getResourceAsStream(String path) {
    try {
      return getResource(path).openStream();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public RequestDispatcher getRequestDispatcher(String path) {
    return delegate.getRequestDispatcher(path);
  }

  public RequestDispatcher getNamedDispatcher(String name) {
    return delegate.getNamedDispatcher(name);
  }

  public Servlet getServlet(String name) throws ServletException {
    return delegate.getServlet(name);
  }

  public Enumeration<Servlet> getServlets() {
    return delegate.getServlets();
  }

  public Enumeration<String> getServletNames() {
    return delegate.getServletNames();
  }

  public void log(String msg) {
    delegate.log(msg);
  }

  public void log(Exception exception, String msg) {
    delegate.log(exception, msg);
  }

  public void log(String message, Throwable throwable) {
    delegate.log(message, throwable);
  }

  public String getRealPath(String path) {
    return delegate.getRealPath(path);
  }

  public String getServerInfo() {
    return delegate.getServerInfo();
  }

  public String getInitParameter(String name) {
    return delegate.getInitParameter(name);
  }

  public Enumeration<String> getInitParameterNames() {
    return delegate.getInitParameterNames();
  }

  public boolean setInitParameter(String name, String value) {
    return delegate.setInitParameter(name, value);
  }

  public Object getAttribute(String name) {
    return delegate.getAttribute(name);
  }

  public Enumeration<String> getAttributeNames() {
    return delegate.getAttributeNames();
  }

  public void setAttribute(String name, Object object) {
    delegate.setAttribute(name, object);
  }

  public void removeAttribute(String name) {
    delegate.removeAttribute(name);
  }

  public String getServletContextName() {
    return delegate.getServletContextName();
  }

  public Dynamic addServlet(String servletName, String className) {
    return delegate.addServlet(servletName, className);
  }

  public Dynamic addServlet(String servletName, Servlet servlet) {
    return delegate.addServlet(servletName, servlet);
  }

  public Dynamic addServlet(String servletName, Class<? extends Servlet> servletClass) {
    return delegate.addServlet(servletName, servletClass);
  }

  public <T extends Servlet> T createServlet(Class<T> clazz) throws ServletException {
    return delegate.createServlet(clazz);
  }

  public ServletRegistration getServletRegistration(String servletName) {
    return delegate.getServletRegistration(servletName);
  }

  public Map<String, ? extends ServletRegistration> getServletRegistrations() {
    return delegate.getServletRegistrations();
  }

  public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, String className) {
    return delegate.addFilter(filterName, className);
  }

  public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Filter filter) {
    return delegate.addFilter(filterName, filter);
  }

  public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Class<? extends Filter> filterClass) {
    return delegate.addFilter(filterName, filterClass);
  }

  public <T extends Filter> T createFilter(Class<T> clazz) throws ServletException {
    return delegate.createFilter(clazz);
  }

  public FilterRegistration getFilterRegistration(String filterName) {
    return delegate.getFilterRegistration(filterName);
  }

  public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
    return delegate.getFilterRegistrations();
  }

  public SessionCookieConfig getSessionCookieConfig() {
    return delegate.getSessionCookieConfig();
  }

  public void setSessionTrackingModes(Set<SessionTrackingMode> sessionTrackingModes) {
    delegate.setSessionTrackingModes(sessionTrackingModes);
  }

  public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
    return delegate.getDefaultSessionTrackingModes();
  }

  public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
    return delegate.getEffectiveSessionTrackingModes();
  }

  public void addListener(String className) {
    delegate.addListener(className);
  }

  public <T extends EventListener> void addListener(T t) {
    delegate.addListener(t);
  }

  public void addListener(Class<? extends EventListener> listenerClass) {
    delegate.addListener(listenerClass);
  }

  public <T extends EventListener> T createListener(Class<T> clazz) throws ServletException {
    return delegate.createListener(clazz);
  }

  public JspConfigDescriptor getJspConfigDescriptor() {
    return delegate.getJspConfigDescriptor();
  }

  public ClassLoader getClassLoader() {
    return delegate.getClassLoader();
  }

  public void declareRoles(String... roleNames) {
    delegate.declareRoles(roleNames);
  }

  public String getVirtualServerName() {
    return delegate.getVirtualServerName();
  }

}
