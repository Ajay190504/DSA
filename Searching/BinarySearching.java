class BinarySearching{

   public static int binarySearch(int arr[], int target){
      int left=0;
      int right = arr.length-1;

      while(left<right){
         int mid = left+(right-left)/2;

         if(arr[mid]==target){
            return mid;
         }
         else if(arr[mid]>target){
            right = mid-1;
         }
         else{
            left=mid+1;
         }
         }
         return -1;
      }

      public static void main(String[] args) {
         int arr[]={4,5,6,7,45,534};
         int target=45;
         int ans=binarySearch(arr,target);
         if(ans==-1){
            System.out.println("Element not found in the array");
         }
         else{
            System.out.println("Element found at index: "+ans);
         }
      }
   }
