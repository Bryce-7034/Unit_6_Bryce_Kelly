public class MusicLibrary {
    private Album[] library;
    private int count = 0;
    boolean show = true;
    public MusicLibrary(){
        library = new Album[10];
    }
    public void add(Album album){
        if(library[count] != null){
            count++;
        }
        library[count] = album;
        count++;
    }
    public void add(Album album, int place){
        library[place] = album;
    }

    public void remove(int one){
        library[one-1]= null;
        //shifts all albums down when one gets removed
        for (int i= 0;i<library.length-one;i++){
            library[one+i-1] = library[one+i];
        }
        count--;
    }
    public void doubleSize(){
        Album[] keep = new Album[library.length];
        int n = 0;
        //fills keep with library's albums
        for(Album num: library){
            keep[n]=num;
            n++;
        }
        n=0;
        //doubles library's capacity
        library = new Album[library.length*2];
        //puts library's old albums back
        for(Album num: keep){
            library[n]=num;
            n++;
        }
    }
    public void hideEmpty(){
        show = false;
    }
    public void showEmpty(){
        show = true;
    }
    public Album getAlbum(int index){
        if(index<=library.length && index>=0){
            return library[index];
        }
        return null;
    }
    public int findTitle(String title){
        int count = 0;
        for (Album search: library){
            if(search!=null&&search.getTitle().equals(title)){
                return count;
            }
            count++;
        }
        return -1;
    }
    public int findArtist(String artist){
        int count = 0;
        for (Album search: library){
            if (search.getArtist().equals(artist)){
                return count;
            }
            count++;
        }
        return -1;
    }
    public int findTitleB(String title){
        sortTitle();
        int lengthTrue = 0;
        for(Album each:library){
            if(each!=null){
                lengthTrue++;
            }
        }
        int low = 0, high = lengthTrue-1, mid = (low+high)/2;
        try {
            while ((!library[mid].getTitle().equals(title)) && (low <= high)) {
                if (title.compareTo(library[mid].getTitle()) < 0) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
                mid = (low+high)/2;
            }

        if (library[mid].getTitle().equals(title))
            return mid;
        }catch(NullPointerException e){}
        return -1;
    }
    public int findArtistB(String artist){
        sortArtist();
        int lengthTrue = 0;
        for(Album each:library){
            if(each!=null){
                lengthTrue++;
            }
        }
        int low = 0, high = lengthTrue-1, mid = (low+high)/2;
        try {
            while ((!library[mid].getArtist().equals(artist)) && low <= high) {
                if (artist.compareTo(library[mid].getArtist()) < 0)
                    high = mid - 1;
                else
                    low = mid + 1;
                mid = (low + high) / 2;
            }
            if (library[mid].getArtist().equals(artist))
                return mid;
        }catch(NullPointerException e){}
        return -1;
    }
    public void sortTitle(){
        Album temp;
        int small;
        for(int i = 0;i<library.length-1;i++){
            small = i;
            for(int scan=i+1; scan<library.length; scan++){
                try{
                    if (library[scan].getTitle().compareTo(library[small].getTitle()) < 0) {
                        small = scan;
                    }
                }
                catch(NullPointerException e){}
            }
            temp = library[small];
            library[small] = library[i];
            library[i] = temp;
        }
    }
    public void sortArtist(){
        Album temp;
        int small;
        for(int i = 0;i<library.length-1;i++){
            small = i;
            try {
                for (int scan = i + 1; scan < library.length; scan++) {
                    if (library[scan].getArtist().compareTo(library[small].getArtist()) < 0) {
                        small = scan;
                    }
                }
            }catch(NullPointerException e){}
            temp = library[small];
            library[small] = library[i];
            library[i] = temp;
        }
    }
    public void sortTracks(){
        Album temp;
        int small;
        for(int i = 0;i<library.length-1;i++){
            small = i;
            for(int scan=i+1; scan<library.length; scan++){
                if(library[scan].getTracks()<library[small].getTracks()){
                    small = scan;
                }
            }
            temp = library[small];
            library[small] = library[i];
            library[i] = temp;
        }
    }
    public void sortTime(){
        Album temp;
        int small;
        for(int i = 0;i<library.length-1;i++){
            small = i;
            for(int scan=i+1; scan<library.length; scan++){
                if(library[scan].getTime()<library[small].getTime()){
                    small = scan;
                }
            }
            temp = library[small];
            library[small] = library[i];
            library[i] = temp;
        }
    }
    public void sortArtistL(){
        for(int i = 1; i< library.length; i++) {
            Album key = library[i];
            int place = i;
            try {
                while (place > 0 && library[place - 1].getArtist().compareTo(key.getArtist()) > 0) {
                    library[place] = library[place - 1];
                    place--;
                }
                library[place] = key;
            }
            catch(NullPointerException e){}
        }
    }
    public String toString(){
        String result = "";
        int empty = 0;
        //prints each Album and ignores empty spaces
        for(Album each: library){
            if(each != null) {
                result += each;
            }
            else if(each == null&&show){
                result+="empty at "+(empty+1)+"\n";
            }
            empty++;
        }
        return result;
    }
}
