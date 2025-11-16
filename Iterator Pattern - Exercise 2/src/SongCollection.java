import java.util.ArrayList;
import java.util.List;

public class SongCollection implements IterableCollections {

    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator createIterator() {
        return new SongIterator(songs);
    }
}
