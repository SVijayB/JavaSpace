class HeapSort 
{ 
    public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = (n/2 - 1); i >= 0; i--)
        {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            heapify(arr, i, 0); 
        } 
    } 
  
    public static void heapify(int array[], int n, int i) 
    { 
        int largest = i;
        int left = (2 * i) + 1; 
        int right = (2 * i) + 2;  
  
        if (left < n && array[left] > array[largest])
        {
            largest = left;
        }
        if (right < n && array[right] > array[largest])
        {
            largest = right;
        }
        if (largest != i) 
        { 
            int temp = array[i]; 
            array[i] = array[largest]; 
            array[largest] = temp; 
            heapify(array, n, largest); 
        } 
    } 
  
    static void output(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = {20, 12, 22, 10, 1, 30, 32, 8, 37, 3}; 
        sort(arr);
        System.out.println("Sorted array is"); 
        output(arr); 
    } 
} 