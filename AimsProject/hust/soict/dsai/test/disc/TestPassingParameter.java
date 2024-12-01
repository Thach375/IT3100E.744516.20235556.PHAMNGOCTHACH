package AimsProject.hust.soict.dsai.test.disc;

import AimsProject.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderelaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderelaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderelaDVD.getTitle());
		
		rightSwap(jungleDVD, cinderelaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderelaDVD.getTitle());

		changeTitle(jungleDVD, cinderelaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
		
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	// Write a swap() method that can correctly swap the two objects
	public static void rightSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle()); 
		dvd2.setTitle(tmp);
	}

}
