package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public boolean addMedia(Media media) {
		itemsOrdered.add(media);
		System.out.println("Added " + media.getTitle() + " to cart");
		return true;
	}

	public boolean removeMedia (Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Removed " + media.getTitle() + " from cart");
		} else {
			System.out.println("Item not found in cart");
		}
		return true;
	}

	public float TotalCost() {
		float sum = 0;
		for (Media media : itemsOrdered) {
			sum += media.getCost();
		}
		return sum;
	}

    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i=0; i<itemsOrdered.size(); i++) {
    		System.out.println((i+1) + "." + itemsOrdered.get(i).toString());
    	}
        System.out.println("Total cost: " + TotalCost() + "$");
    	System.out.println("***************************************************");
    }
	
    public void searchByID(int id) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
    }
    
    public void searchByTitle(String title) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
    }

	public int getSize() {
		return this.itemsOrdered.size();
	}

	public Media searchMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}
