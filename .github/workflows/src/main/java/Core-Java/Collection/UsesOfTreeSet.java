import java.util.*;
/*
  TreeSet : 
   Underline data struture: balanced tree.
   Dup obj are not allowed.
   it can accept only same-type of object
  
*/
class UsesOfTreeSet {
    public static void main(String[] args) {
       TreeSet tset = new TreeSet();
        tset.add(40);
        tset.add(-1);
        tset.add(20);
        tset.add(25);
        tset.add(25);
        //tset.add("");//RE:ClassCastException
        //tset.add(null);//RE:NullPointerException
       
       System.out.println(tset);//sorted in Asec order
    }
}