public class MusicLibrary {
    private Album[] library;
    private int count = 0;
    public MusicLibrary(){
        library = new Album[10];
    }
    public void add(Album album){
        library[count] = album;
        count++;
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
    public String toString(){
        String result = "";
        //prints each Album and ignores empty spaces
        for(Album each: library){
            if(each != null) {
                result += each;
            }
        }
        return result;
    }
}
