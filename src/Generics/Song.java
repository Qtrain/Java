package Generics;

/**
 * Created by macbook on 11/26/15.
 */
public class Song implements Comparable<Song> {

    String title;
    String album;
    String artist;

    public Song(String t, String a, String art){
        title=t;
        album=a;
        artist=art;
    }

   //compare method for
    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {

        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return title;
    }
}
