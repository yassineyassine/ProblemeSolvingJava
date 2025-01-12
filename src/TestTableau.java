// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

class Audo{

    public int id;
    public String capacite;

    public Audo(int idin,String cap){
        this.id=idin;
        this.capacite=cap;
    }
}

class TestClass {
    public static void main(String[] args) {

    
        //Tableau unique dimension
        int [] montTab = {1,6,2};
       
       Arrays.sort(montTab);

       for(int elem:montTab){
            System.out.println(elem);
       }

       //Tableau 2 dimensions
       int [][] montTab2={{1,2,3},{4,5,6}};
         for(int i=0;i<montTab2.length;i++){
              for(int j=0;j<montTab2[i].length;j++){
                System.out.println(montTab2[i][j]);
              }
         }

    }
}
