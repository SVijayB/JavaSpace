package Data_Structures;
import java.util.*;

/* Problem Statement - To find the kth Smallest and kth Largest element in an array.
   Note: Duplicates are considered.
   
 */

class KthMinAndMaxInArray{
    static int kthSmallestElement(int[] array, int k){              // using max-heap
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k;i++){
            p.add(array[i]);
        }
        for(int i=k; i<array.length;i++){
            if(array[i]<p.peek()){
                p.poll();
                p.add(array[i]);
            }
        }
        return p.peek();
    }
    static int kthLargeestElement(int[] array, int k){              // using min-heap
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0; i<k;i++){
            p.add(array[i]);
        }
        for(int i=k; i<array.length;i++){
            if(array[i]>p.peek()){
                p.poll();
                p.add(array[i]);
            }
        }
        return p.peek();
    }
    public static void main(String[] args){
        int[] arr = {2,5,80,66,4,5,77,9,3,5,4,99,152,1563,549,2,6595,8963,29655};
        int k = 3;
        System.out.println("Given Array is: ");
        System.out.println("k is: "+k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+k+"rd Largest Element is: "+kthLargeestElement(arr,k));
        System.out.println(k+"rd Smallest Element is: "+kthSmallestElement(arr,k));
    }
}