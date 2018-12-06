package org.jamwiki.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.ReadableByteChannel;

import org.eclipse.jetty.util.resource.Resource;

public class ResourceImp extends Resource{

  @Override
  public boolean isContainedIn(Resource r) throws MalformedURLException {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void close() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean exists() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isDirectory() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public long lastModified() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public long length() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public URL getURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public File getFile() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReadableByteChannel getReadableByteChannel() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean delete() throws SecurityException {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean renameTo(Resource dest) throws SecurityException {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String[] list() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Resource addPath(String path) throws IOException, MalformedURLException {
    // TODO Auto-generated method stub
    return null;
  }

}
