// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;



//
class BoundingRectangle {
    public static void main(String[] args) {

        List<List<Integer>> points = Arrays.asList(
            Arrays.asList(3, 4),
            Arrays.asList(1, 1),
            Arrays.asList(2, 2)
        );

        List<Integer> result = boundingRectangle(points);
  
  


    }

    public static List<Integer> boundingRectangle(List<List<Integer>> CordinatesPoint){  

        List<Integer> result=new ArrayList<>();
        
        int minx=Integer.MAX_VALUE;
        int miny=Integer.MAX_VALUE;
        int maxx=Integer.MAX_VALUE;
        int maxy=Integer.MAX_VALUE;

        for(List<Integer> point:CordinatesPoint){
            minx=Math.min(minx,point.get(0));
            miny=Math.min(miny,point.get(0));
            maxx=Math.max(maxy,point.get(0));
            maxy=Math.max(maxy,point.get(0));
            
        }

        result.add(minx);
        result.add(miny);
        result.add(maxx);
        result.add(maxy);

        return result;
        

       
    }
}
