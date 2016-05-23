package com.gxb.test;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector=new Vector<Observer>();

	@Override
	public void add(Observer ob) {
		vector.add(ob);
	}

	@Override
	public void delete(Observer ob) {
		vector.remove(ob);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo=vector.elements();
		while (enumo.hasMoreElements()) {
			 enumo.nextElement().update();
			
		}
	}



}
