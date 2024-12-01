package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 1;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public Media(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbMedia;
        nbMedia++;
    }

    public Media(String title, String category) {
        super();
        this.title = title;
        this.category = category;
        this.id = nbMedia;
        nbMedia++;
    }

    public Media(String title) {
        super();
        this.title = title;
        this.id = nbMedia;
        nbMedia++;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            Media media = (Media) obj;
            return this.id == media.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Category: " + category + ", Cost: " + cost;
    }
}
