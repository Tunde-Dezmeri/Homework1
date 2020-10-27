package package_1;

import package_2.ArtAlbums;
import package_2.Novels;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private String name;
    private int numberOfPages;

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void add(){

    }
    public void delete() {
    }

    public static void main(String[] args) {
        Novels trainDreams = new Novels();
        Novels flamethrowers = new Novels();
        ArtAlbums firstArtAlbum = new ArtAlbums();
        ArtAlbums secondArtAlbum = new ArtAlbums();

        List<Books> books = new ArrayList<Books>();
        books.add(trainDreams);
        books.add(flamethrowers);
        books.add(firstArtAlbum);
        books.add(secondArtAlbum);
    }
    }
