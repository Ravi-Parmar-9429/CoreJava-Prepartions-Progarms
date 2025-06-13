import java.util.*;
class FindNonRepeatingCharacter{

      public static Boolean findNonRepeatingCharcter(String str){
	LinkedHashMap<Character,Integer> linkedHashmap = new LinkedHashMap<Character,Integer>();
	for(int i=0;i<str.length();i++){
	   if(linkedHashmap.containsKey(str.charAt(i))){
		int value = linkedHashmap.get(str.charAt(i));
		linkedHashmap.put(str.charAt(i),value+1);
	   }else{
		linkedHashmap.put(str.charAt(i),1);
	   }
	}
        for(Map.Entry<Character,Integer> map:linkedHashmap.entrySet()){
		if(map.getValue()==1){
		return true;
		}
	}
        return false;
      }
     
      public static void main(String args[]){
	 String str = "rrrr";
         boolean result = findNonRepeatingCharcter(str);
	 System.out.println(result);
      }

}