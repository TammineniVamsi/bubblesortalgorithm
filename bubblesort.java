public class bubblesort {
    public static void bubsort(int arr[]){
           int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
             
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
        System.out.println("no. of swaps" +swap);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubsort(arr);

    }
    
}
