import java.util.*;
class UsesOfLinkedHashMap {
    public static void main(String[] args) {
       LinkedHashMap<String,Integer> linkedhashmap = new LinkedHashMap<>();
       linkedhashmap.put("ravi",101);
       linkedhashmap.put("niku",201);
       linkedhashmap.put("khushbu",301);
      
       System.out.println(linkedhashmap);//it follow insertion order
       
       //check key contains in linkedHashMap ?
       
      System.out.println(linkedhashmap.containsKey("ravi"));
      System.out.println(linkedhashmap.containsValue(101));
      System.out.println(linkedhashmap.get("ravi"));
      System.out.println(linkedhashmap.get(101));
    }
}