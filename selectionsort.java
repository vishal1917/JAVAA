public class selectionsort {
    public static void selectionsort(int input[], int n) {
        for(int i=0; i<n-1; i++)
        {
            int min = input[i],minIndex=i;
            for(int j = i+1; j<n;j++){
                if(input[j]<min)
                {
                    min=input[j];
                    minIndex=j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int input[] = {2,4,9,5,8};
        selectionsort(input, 5);
        for(int i=0;i<5;i++)
        {
            System.out.print(input[i] + "");
        }
    }
}
