//hashset - internal-working
import java.util.*;
class Employee{
    
    String ename;
    int eid;
    
    public Employee(String ename,int eid){
        this.ename = ename;
        this.eid = eid;
    }
}

public class Main{
    
    public static void main(String args[]){
       HashSet<Employee> hashset = new HashSet();   
       hashset.add(new Employee("ravi",1));
       hashset.add(new Employee("ravi",1));
     
       System.out.println(hashset.size());////equals and hashcode not ovrride thats reason size-2 and object class equals method is comparing ref.

    }
}