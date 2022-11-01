import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumEx48 {
    private String name;
    private String artist;
    //private ArrayList<Song> songs;
    private SongList songs;

    public AlbumEx48(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public static class SongList {
        private ArrayList<SongEx48> songs;

        private SongList (){
            songs = new ArrayList<>();
        }

        private boolean add(SongEx48 song){
            if((findSong(song.getTitle()) != null)){
                return false;
            }
            else{
                return songs.add(song);
            }
        }

        private SongEx48 findSong(String title){
            for (int i = 0; i<songs.size(); i++){
                if(songs.get(i).getTitle().equals(title)){
                    return songs.get(i);
                }
            }
            return null;
        }
        private SongEx48 findSong(int trackNumber){
            if(songs.get(trackNumber)!=null){
                return songs.get(trackNumber);
            }
            else{
                return null;
            }
        }
    }

    public boolean addSong(String title, double duration){
        SongEx48 song = new SongEx48(title, duration);
        return this.songs.add(song);
    }
    //@Override
    /*private Song findSong(String title){
        for (int i = 0; i<songs.songs.size(); i++){
            if(songs.songs.get(i).getTitle().equals(title)){
                return songs.songs.get(i);
            }
        }
        return null;
    }*/

    public boolean addToPlayList(int trackNumber, LinkedList<SongEx48> playlist){
        if(trackNumber <= 0 || songs.songs.size()<trackNumber){
            return false;
        }
        for (int i = 0; i<playlist.size(); i++){
            if(songs.findSong(playlist.get(i).getTitle()) == null){
                return false;
            }
            else{
                songs.add(playlist.get(i));
            }
        }
        //(songs.get(trackNumber).equals(playlist.get(trackNumber))){
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<SongEx48> playlist){
        if(songs.findSong(title) == null){
            return false;
        }
        for (int i = 0; i<playlist.size(); i++){
            if(songs.findSong(playlist.get(i).getTitle()) == null){
                return false;
            }
            else{
                songs.add(playlist.get(i));
            }
        }
        return true;
    }
}
