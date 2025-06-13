import java.util.*;
class UsesOfCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(-1);
        list.add(16);
        list.add(20);
        list.add(15);
        
        Collections.sort(list);
        System.out.println(list);
        
        int max =   Collections.max(list);
        System.out.println(max);
        
        int min = Collections.min(list);
        System.out.println(min);
        
        Collections.reverse(list);
        System.out.println(list);
        
        Collections.shuffle(list);
        System.out.println(list);
        
    }
}