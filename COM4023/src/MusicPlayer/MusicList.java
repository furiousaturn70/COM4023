/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayer;
import java.util.ArrayList;
/**
 *
 * @author amstephenson
 */
public class MusicList {
   
    private ArrayList<Song> musicList;
    
    
    /**
     * Constructor
     */
    public MusicList(){
        
    }
    
    public void addSong(Song song){
        this.musicList.add(song);
    }
      
    public int getMusicListSize(){
        return this.musicList.size();
    }
    
    public void clearMusicList(){
        this.musicList.clear();
    }
    
   public boolean removeSong(String songTitle){
        //needs working out here   
        return false;
    }
   
   public boolean setSongPlays(String songTitle, int songPlays){
       //needs working out here
       return false;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
