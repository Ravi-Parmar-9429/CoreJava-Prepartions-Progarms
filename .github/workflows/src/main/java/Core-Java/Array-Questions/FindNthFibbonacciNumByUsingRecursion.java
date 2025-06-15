public class FindNthFibbonacciNumByUsingRecursion {

	//find nth fibbonacii by using recursion.
	//0 1 1 2 3 5 8 13 21
	//sum of prev 2 no and add them and get the next num...
	
	
	public static int findNthFibbonacciNumByUsingRecursion(int n) {
		//Base-Case
		 if(n==1) {
			 return 0;
		 }
		 if(n==2) {
			 return 1;
		 }
		//Recursive Relation
		 return findNthFibbonacciNumByUsingRecursion(n-1)+findNthFibbonacciNumByUsingRecursion(n-2);
	}
	
	public static void main(String args[]) {
		int ans = findNthFibbonacciNumByUsingRecursion(7);
		System.out.println(ans);
	}
	
}
