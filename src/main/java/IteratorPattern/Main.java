package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran", "Pop"));
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen", "Rock"));
        playlist.addSong(new Song("Lose Yourself", "Eminem", "Hip-Hop"));
        playlist.addSong(new Song("Smells Like Teen Spirit", "Nirvana", "Rock"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", "Pop"));

        System.out.println("Sequential Playlist:");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println("\nShuffled Playlist:");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\nFiltered Playlist (Genre: Rock):");
        Iterator genreIterator = playlist.getGenreFilterIterator("Rock");
        while (genreIterator.hasNext()) {
            System.out.println(genreIterator.next());
        }
    }
}
