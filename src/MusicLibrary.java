public class MusicLibrary {
    private Album[] library;
    private int count = 0;
    public MusicLibrary(){
        library = new Album[10];
    }
    public void add(Album album){
        library[count] = album;
    }
    public void remove(int one){
        library[one-1]= null;
    }
    public void doubleSize(){
        Album[] keep = new Album[library.length*2];
        int n = 0;
        for(int s=0;s<library.length;s++){
            keep[s]=library[s];
        }
        library= new Album[library.length*2];
        for(Album num: keep){
            library[n]=num;
            n++;
        }
    }
    public String toString(){
        String result = "";
        for(Album each: library){
            if(each != null) {
                result += each;
            }
        }
        return result;
    }
}
