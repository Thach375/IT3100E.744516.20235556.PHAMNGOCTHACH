package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super(title, category, director, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public CompactDisc(String title, String category) {
		super(title, category);
	}

	public CompactDisc(String title) {
		super(title);
	}

    public boolean addTrack(Track track) {
    	if (tracks == null) {
            tracks = new ArrayList<>();
        }
		if (this.tracks.contains(track)) {
			System.out.println("The track " + track.getTitle() + " is already in the tracklist of " + this.getTitle());
			return false;
		} else {
			this.tracks.add(track);
			System.out.println("The track " + track.getTitle() + " has been added to the tracklist of " + this.getTitle());
			return true;
		}
	}

	public boolean removeTrack(Track track) {
		if (this.tracks.remove(track)) {
			System.out.println("The track " + track.getTitle() + " has been removed from the tracklist of " + this.getTitle());
			return true;
		} else {
			System.out.println("The track " + track.getTitle() + " is not in the tracklist of " + this.getTitle());
			return false;
		}
	}
@Override
    public int getLength(){
        if (tracks == null) {
            tracks = new ArrayList<>();
        }
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }
    
@Override
    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("CD Artist: " + getArtist());
        System.out.println("Track length: " + getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
@Override
    public String toString() {
        return "ID: " + getId() +", Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Artist: " + artist + ", Length: " + getLength();
    }
}

