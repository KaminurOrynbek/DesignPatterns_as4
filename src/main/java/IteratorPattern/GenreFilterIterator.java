package IteratorPattern;

import java.util.List;

public class GenreFilterIterator implements Iterator {
    private List<Song> songs;
    private String genre;
    private int position = 0;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (position < songs.size()) {
            Song song = songs.get(position);
            if (song.getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
