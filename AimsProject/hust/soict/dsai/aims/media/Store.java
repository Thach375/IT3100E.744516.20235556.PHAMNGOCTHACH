package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public boolean addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println("Added " + media.getTitle() + " to store");
		return true;
	}

	public boolean removeMedia (Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Removed " + media.getTitle() + " from store");
		} 
        else {
			System.out.println("Item not found in store");
		}
		return true;
	}

    public void listItems() {
        System.out.println("Items in store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i+1) + ". " + itemsInStore.get(i).getTitle());
        }
    }

	public Media searchMedia(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
				return media;
			}
		}
		return null;
	}

	public ArrayList<Media> getItemsInStore() {
		return (ArrayList<Media>) this.itemsInStore;
	}

}
