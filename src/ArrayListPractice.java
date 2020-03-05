import java.util.ArrayList;

public class ArrayListPractice {
    public void removeZeros(ArrayList list){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)){
                list.remove(i);
                i--;
            }
        }
    }

    public int countLetters(ArrayList<String> list){
        int count = 0;
        for(int i = 0; i<list.size();i++){
            count+= list.get(i).length();
        }
        return count;
    }
    public int findPosition(int keyValue, ArrayList list){
        for(int i = 0; i< list.size();i++){
            if(list.get(i).equals(keyValue)){
                return i;
            }
        }
        return -1;
    }
    public ArrayList<String> parseIntoArrayList(String egg){
        ArrayList<String> weg = new ArrayList<String>();
        for(int i = 1; i<egg.length()-1; i++){
            weg.add(egg.substring(i-1, i));
        }
        return weg;
    }

}
