public class BinarySearch {
  
    public static int BinarySearch(int arr[], int n, int x)
{
    int start=0, end=n-1;
    while(start <= end){
        int mid = (start + end)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if (x>arr[mid]){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return -1;

}
        public static void main(String[] args) {
            int[] input = {3,4,5,6,7,8,9};
            int x=4;
            System.out.print(BinarySearch(input, x, x)); 
        }
    }
