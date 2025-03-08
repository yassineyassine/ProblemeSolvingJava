//https://medium.com/bubblespebbles/find-the-number-of-pairs-of-array-elements-that-have-a-difference-equal-to-the-target-value-coding-73d9e342c8ee
//https://medium.com/bubblespebbles/find-the-number-of-pairs-of-array-elements-that-have-a-difference-equal-to-the-target-value-coding-73d9e342c8ee
import java.util.HashMap;

class PairWithDifference{

    static int countPairsWithDifference(int [] arr,int k){

        int count=0;
        HashMap <Integer,Integer> numFrequency = new HashMap<>();
        for(int num:arr)
        {
            numFrequency.put(num,numFrequency.getOrDefault(num,0)+1);
        }

        for(int num:arr){

            int complement=num-k;
            if(numFrequency.containsKey(complement)){
                count++;
            }

        }

        System.out.println(numFrequency);

        return count;

    }


    public  static void main(String[] args) {

        /*
        int [] arr = {1,5,5,3,4,2};
        int k=2;
        int count=countPairsWithDifference(arr,k);

        System.out.print(count);*/

        //CountUnique cu=new CountUnique();
        //cu.main();

        String s="A";
        s.toLowerCase();
        System.out.println(s);

    }

}