import java.util.*;

class UsesOfHashmap {
    public static void main(String[] args) {
       HashMap hashmap = new HashMap<>();
       hashmap.put(1,10);
       hashmap.put(10,"");//it can accept sametype  & diff type as well
       hashmap.put(null,1);//Null is allowed for k and v
       
       System.out.println(hashmap);
       
       //Example for dup key..
       
       HashMap<Integer,Integer> hashmap1  = new HashMap(); 
       
       //dup keys not allowed but values can be dup ex below
       hashmap1.put(1,1);
       hashmap1.put(1,2);
       
       System.out.println(hashmap1);
    }
}