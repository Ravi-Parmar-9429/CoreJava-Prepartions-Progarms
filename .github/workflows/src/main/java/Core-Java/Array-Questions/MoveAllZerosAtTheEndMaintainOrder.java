class MoveAllZerosAtTheEndMaintainOrder{

     public static void movingAllZerosAtTheEndWithoutOrderChanging(int arr[]){
	for(int i=0;i<arr.length;i++){
	   if(arr[i]==0){
	   for(int j=0;j<arr.length-1;j++) {
	       if(arr[j]==0){
                 int temp = arr[j];
	         arr[j]=arr[j+1];
 	         arr[j+1]=temp;
	      }
	   }
	}	
     }
     }

     public static void main(String args[]){
	int arr[] = {0,0,-1,0,1, 2, 0, 4, 3, 0, 5, 0}; 
	movingAllZerosAtTheEndWithoutOrderChanging(arr);
	for(int i:arr){
	    System.out.print(i+" ");
	}
     }

}