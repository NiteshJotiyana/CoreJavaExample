package com.java.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class OnlineViewer implements Observer {

	CricketBoard board;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Hello");
		board = (CricketBoard) arg;
		System.out.println(board);
	}

}
