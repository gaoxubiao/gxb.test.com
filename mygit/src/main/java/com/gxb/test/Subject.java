package com.gxb.test;

public interface Subject {
  public void add(Observer ob);
  public void delete(Observer ob);
  public void notifyObservers();
  public void operation();
}
