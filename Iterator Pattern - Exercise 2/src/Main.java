public class Main {
    public static void main(String[] args) {

        SongCollection songs = new SongCollection();

        songs.addSong(new Song("Song 1","Mo Ashraf",3));
        songs.addSong(new Song("Song 2","Mo Ashraf",2));
        songs.addSong(new Song("Song 3","Moamen",5));
        songs.addSong(new Song("Song 4","Fahd",3));
        songs.addSong(new Song("Song 5","Mo Ashraf",1));

        Iterator iterator = songs.createIterator();

        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.println("Artist: " + song.getArtist() + " -> " + "Title: " + song.getTitle() + " -> " + "Duration: " + song.getDuration());
        }
    }
}