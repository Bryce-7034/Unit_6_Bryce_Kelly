public class Album {
    String title;
    String artist;
    int tracks;
    double time;
    public Album(String title,String artist,int tracks,double time){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        this.time = time;
    }
    public String toString(){
        String result;
        result=title+ " ";
        result+=artist+ " ";
        result+=tracks+ " ";
        result+=time+ "\n";
        return result;
    }
}
