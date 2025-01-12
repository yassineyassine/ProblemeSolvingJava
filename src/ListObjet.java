// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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

        ArrayList<Audo> list = new ArrayList();
        list.add(new Audo(1,"4"));
        list.add(new Audo(1,"5"));
        list.add(new Audo(1,"4"));
double moyenne=list.stream().filter(a->a.id==1).mapToInt(a -> a.id).average().orElse(0);
        // Collections.sort(list);

        List<Audo> l2=list.stream().filter(a->a.id==1 && a.capacite=="4").collect(Collectors.toList());
        System.out.println(l2.get(0));
/*
        for(Audo str:list){
            System.out.println(str);

        }*/

    }
}
