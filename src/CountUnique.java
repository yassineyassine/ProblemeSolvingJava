import java.util.HashMap;

public class CountUnique {


    private boolean hasUniqueChar(String str){

        HashMap <Character,Integer> listChar=new HashMap();
    for(int i=0;i<str.length();i++){

        listChar.put(str.charAt(i),listChar.getOrDefault(str.charAt(i),0));

    }

    System.out.println(listChar);

    return false;

    }
    public void main(){

        String str="yassine";

        boolean is_unique=hasUniqueChar(str);

        System.out.print(is_unique);
    }


}
