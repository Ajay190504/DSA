class LinearSearching {
    
    public static int linearSearch(int[] arr, int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
               return i;
            }
         }
         return -1;
    }

    public static void main(String[] args){
      int arr[]={4,5,6,7,45,34,534};
      int target=43;
      int ans=linearSearch(arr,target);
      if(ans==-1){
        System.out.println("Element not found in the array");
      }
      else{
        System.out.println("Element found at index: "+ans);
      }
    }
    
}
   