class MergeSort 
{ 
    public static void merge(int arr[], int l, int m, int r) 
    { 
        int len1 = m - l + 1; 
        int len2 = r - m; 
  
        int left[] = new int [len1]; 
        int right[] = new int [len2]; 
  
        for (int i=0; i<len1; ++i)
        {
            left[i] = arr[l + i];
        }
        for (int j=0; j<len2; ++j) 
        {
            right[j] = arr[m + 1+ j];
        }

        int i = 0, j = 0, k = l;
        while (i < len1 && j < len2) 
        { 
            if (left[i] <= right[j]) 
            { 
                arr[k] = left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < len1) 
        { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 

        while (j < len2) 
        { 
            arr[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 
  
    public static void sort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            int m = (left+right)/2; 

            sort(arr, left, m); 
            sort(arr , m+1, right); 
            merge(arr, left, m, right); 
        } 
    } 

    static void output(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String args[]) 
    { 
        int array[] = {14, 7, 3, 12, 9, 116, 2}; 

        System.out.println("Given Array"); 
        output(array); 

        sort(array, 0, array.length-1); 
  
        System.out.println("\nSorted array"); 
        output(array); 
    } 
}