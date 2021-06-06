package com.java.design.pattern.observer;

public class CricketMatchChannle {

	public static void main(String[] args) {
		CricketBoard board = new CricketBoard();
		board.setBatsManName1("Sachin");
		board.setBatsManName2("Virat");
		board.setBowlerName("KingKong");
		board.setEmpireName("Ricky");
		board.setOver(2.2);
		board.setScore(78);

		OnlineViewer viewer1 = new OnlineViewer();
		OnlineViewer viewer2 = new OnlineViewer();

		board.addObserver(viewer1);
		board.addObserver(viewer2);

		int count = 0;
		while (count < 10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			board.setScore(board.getScore() + 4);
			board.setOver(board.getOver() + 0.1);
			board.setChanged();
			board.notifyObservers(board);
			count++;
			board.clearChanged();
		}

	}
}
