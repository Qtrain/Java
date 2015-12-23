package Generics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by macbook on 11/26/15.
 */
public class Jukebox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        Jukebox3 jukebox = new Jukebox3();
        jukebox.go();
    }

     public void go(){
        getSongs();
        System.out.println(songList);
         System.out.println("the sort");
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs(){
        try{
            File file = new File("/Users/macbook/IdeaProjects/MyPlayground/src/Generics/songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     void addSong(String line) {
        String[] tokens = line.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2]);
        songList.add(nextSong);
    }
}
