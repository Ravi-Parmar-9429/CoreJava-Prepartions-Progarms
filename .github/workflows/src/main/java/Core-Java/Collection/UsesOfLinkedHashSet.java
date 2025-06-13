import java.util.*;
class UsesOfLinkedHashSet {
    public static void main(String[] args) {
       LinkedHashSet lnkhset = new LinkedHashSet(); 
        lnkhset.add(100);
        lnkhset.add(10);
        lnkhset.add(0);
        lnkhset.add(1500);
        lnkhset.add(10);
        lnkhset.add("Ravi");
       
        System.out.println(lnkhset);//Insertion order -Prserved
    }
}