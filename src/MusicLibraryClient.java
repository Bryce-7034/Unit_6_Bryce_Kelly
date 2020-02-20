public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a", "g", 0, 45);
        Album a5 = new Album("b", "h", 1, 46);
        Album a6 = new Album("c", "i", 2, 47);
        Album a7 = new Album("d", "j", 3, 48);
        Album a8 = new Album("e", "k", 4, 49);
        Album a9 = new Album("f", "l", 5, 50);

        myLibrary.add(a1);
        myLibrary.add(a2);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //myLibrary.remove(1);
        myLibrary.add(a3);
        myLibrary.add(a5);
        myLibrary.add(a9);
        myLibrary.add(a7);
        myLibrary.add(a4);
        myLibrary.add(a8);
        myLibrary.add(a6);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("Selection Sort");

        myLibrary.sortTitle();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("Insertion Sort");

        //myLibrary.sortArtistL();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //int loc = myLibrary.findTitle("First");

        //System.out.println(myLibrary.getAlbum(loc));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");



        myLibrary.sortTitle();

        int loc = myLibrary.findTitleB("Play");

        myLibrary.sortArtist();
        System.out.println(myLibrary);
        int loc2 = myLibrary.findArtistB("j");

        System.out.println(loc);
        System.out.println(loc2);

        System.out.println(myLibrary.getAlbum(loc));
        System.out.println("***************************************");
        System.out.println(myLibrary.getAlbum(loc2));
    }
}