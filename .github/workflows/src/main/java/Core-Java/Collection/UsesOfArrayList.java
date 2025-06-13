import java.util.*;
class UsesOfArrayList {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add("hello");
        arraylist.add(10);
        arraylist.add(null);
        
        System.out.println(arraylist);
        
        //arraylist.add(19,0);//RE
        //arraylist.remove(10);//RE
        arraylist.remove(Integer.valueOf(10));
        System.out.println(arraylist);
        
        //checking size of arraylist
        System.out.println(arraylist.size());
        
        //checking arraylist is empty ?
        System.out.println(arraylist.isEmpty());
    }
}