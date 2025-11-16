import java.util.List;

public class SongIterator implements Iterator {

    private List<Song> songs;
    private int index = 0;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Object next() {
        return songs.get(index++);
    }
}
