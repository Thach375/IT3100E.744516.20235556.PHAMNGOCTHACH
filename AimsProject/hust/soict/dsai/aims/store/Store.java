package AimsProject.hust.soict.dsai.aims.store;

import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc itemsOnStore[] = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsOnStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("DVD " + disc.getTitle() + " has been add to the store.");
        }
        else {
            System.out.println("Store full can not add anymore.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i=0; i<qtyInStore; i++) {
            if (itemsOnStore[i] == disc) {
                found = true;
                for (int j = i; j<qtyInStore; j++) {
                    itemsOnStore[j] = itemsOnStore[j+1];
                }
                itemsOnStore[qtyInStore-1]= null;
                qtyInStore--;
                System.out.println("DVD " + disc.getTitle() + " has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Not found " + disc.getTitle() + "in store");
        }
    }
}
