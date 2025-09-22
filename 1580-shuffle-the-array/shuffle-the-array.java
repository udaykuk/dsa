class Solution {
    public int[] shuffle(int[] nums, int n) {
      int x=0,i=0;
      int y=n;
      int arr[]= new int[2*n];
      while(i<2*n)  {
        if(i%2==0){
            arr[i]=nums[x];
            x++;
            i++;}
        else{
            arr[i]=nums[y];
            y++;
            i++;
        
       } } return arr;
    
}}