package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private final DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.print("Disc has been add");
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

	
}
