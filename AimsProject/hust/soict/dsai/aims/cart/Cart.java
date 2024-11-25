package AimsProject.hust.soict.dsai.aims.cart;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private final DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Disc has been add");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i] == disc) {
				found = true;
				
				for (int j=i; j < qtyOrdered; j++) {
					itemOrdered[j] = itemOrdered[j+1];
				}
				itemOrdered[qtyOrdered-1] = null;
				qtyOrdered--;
				System.out.println("disc " + disc.getTitle() + " has been removered");
				break;
			}
		}
		if (!found) {
			System.out.println("Cannot found disc");
		}
	}
	
	public float totalCost() {
		float sum = 0.0f;
		for (int i=0; i < qtyOrdered; i++) {
			sum += itemOrdered[i].getCost();
		}
		return sum;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		for (DigitalVideoDisc t : dvdList) {
			addDigitalVideoDisc(t);
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public float TotalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemOrdered[i].getCost();
		}
		return sum;
	}

	public void printCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i=0; i<qtyOrdered; i++) {
			System.out.println((i+1) + ". " + itemOrdered[i].toString());
		}
		System.out.println("Total cost " + TotalCost());
		System.out.println("***************************************************");
	}
	
	public void searchByTitle(String title) {
		boolean found = false;
			for (int i=0; i < qtyOrdered; i++) {
				if (itemOrdered[i].isMatch(title)) {
					System.out.println("Found " + itemOrdered[i].toString());
					found = true;
				}
			if (!found) {
				System.out.println("No DVD found with title " + title);
			}
		}
	}
}
