/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayer;

/**
 *
 * @author amstephenson
 * @version 1.0
 * @Purpose: class to manage a song
 */
public class Song {
    private String artistName;
    private String songTitle;
    private int playBack;
    
    /**
     * Constructor: Builds a blank Song
     */
    public Song(){}
    
    /**
     * Constructor: Builds a Song with 
     * with required data - artistName, songTitle, playBack
     */
    public Song(String artistName, String songTitle, int playBack){
        this.artistName = artistName;
        this.songTitle =songTitle;
        this.playBack = playBack;    
    }
    
   
    /**
     * @method: get the artists name 
     * @return artistName 
     */
    public String getArtistName(){
      return this.artistName;  
    }
    
    /**
     * @method: set artist name
     * @param artistName 
     */
    public void setArtistName(String artistName){
        this.artistName=artistName;
    }
    
    
    
}    
    
