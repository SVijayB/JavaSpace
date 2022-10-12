package Data_Structures;
import java.util.*;

/* Problem Statement - To find the kth Smallest and kth Largest element in an array.
   Note: Duplicates are considered.
 */

class KthMinAndMaxInArray{
    static int kthSmallestElement(int[] array, int k){              // using max-heap
        /* A max-heap is a complete binary tree in which the value in each internal node is greater
         than or equal to the values in the children of that node. Mapping the elements of a heap 
         into an array is trivial: if a node is stored an index k, then its left child is stored at
         index 2k + 1 and its right child at index 2k + 2. 
         Note: In max-heap root is the greatest element of the array */
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder()); // we use collections to convert min-heap to max-heap
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
        /* A Min-Heap is a complete binary tree in which the value in each internal node
         is smaller than or equal to the values in the children of that node. Mapping 
         the elements of a heap into an array is trivial: if a node is stored an index k,
         then its left child is stored at index 2k + 1 and its right child at index 2k + 2.
         Note: In min-heap root is the smallest element in the array */
        PriorityQueue<Integer> p = new PriorityQueue<>();   // a priority queue by default implements a min-heap in java
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