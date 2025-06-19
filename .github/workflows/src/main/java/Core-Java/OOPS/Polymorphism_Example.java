package com.practice.corejava.oops;

class News {
	public void showingNews() {
		System.out.println("Showing General-News");
	}
}

class GoodNews extends News {
	public void showingNews() {
		System.out.println("Showing Good-news");
	}
}

class BedNews extends News {
	public void showingNews() {
		System.out.println("Showing Bed-News");
	}
}

public class Polymorphism_Example {

	public static void main(String args[]) {
		News news1 = new BedNews();
		news1.showingNews();
		
		News news2 = new News();
		news2.showingNews();
		
		News news3 = new GoodNews();
		news3.showingNews();
	}

}
