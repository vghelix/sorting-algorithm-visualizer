import java.util.*;
public class selectionsort{
    public static void selectionSort(int[]array){
        n=array.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=0;j<n;j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }
            }
             int temp=array[minIndex];
             array[minindex]=array[i];
             array[i]=temp;
        }  
             
    }

}
