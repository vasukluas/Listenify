package Song_application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String AlbumName;
    private String ArtistName;
    private List<Song> songList;

    public Album(String albumName, String artistName) {
        AlbumName = albumName;
        ArtistName = artistName;
        this.songList = new ArrayList<>();
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public void setAlbumName(String albumName) {
        AlbumName = albumName;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }
    public boolean findbytitle(String title){
        for(Song song:songList){
            if(song.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public String AddsongtoAlbum(String title,double duration){
        if(findbytitle(title)){
            return "Song had already present";
        }
        Song song=new Song(title,duration);
        this.songList.add(song);
        return "your song has been sucessfully added";
    }
    public String AddSongByIndexInPlayList(int songNo, ArrayList<Song> playList){
        int index=songNo-1;
        if(index >=0 && index < songList.size()){
            Song song=songList.get(index);
            playList.add(song);
            return "your song is successfully added to playList";
        }
        else{
            return "your are entered out of the range";
        }
    }
    public String AddSongByTitleInPlayList(String title,ArrayList<Song> playList){
        for(Song song:songList){
            if(song.getTitle().equals(title)){
                playList.add(song);
                return "your song is successfully added by title in playlist";
            }
        }
        return "you entered wrong title to add";
    }
}
