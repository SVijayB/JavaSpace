package Miscellaneous;

import java.util.HashMap; 
import java.util.HashSet;
import java.util.Iterator; 

class LRUPageReplacement
{ 
 	static int pageFaults(int pages[], int n, int max) 
 	{ 
 	 	HashSet<Integer> s = new HashSet<>(max);  	 	
        HashMap<Integer, Integer> indexes = new HashMap<>(); 
 	 	int result = 0;  	 	
        for (int i=0; i<n; i++) 
 	 	{ 
 	 	 	if (s.size() < max) 
 	 	 	{ 
 	 	 	 	if (!s.contains(pages[i])) 
 	 	 	 	{ 
 	 	 	 	 	s.add(pages[i]);  	 	 	 	 	
                    result++; 
 	 	 	 	} 
 	 	 	 	indexes.put(pages[i], i); 
 	 	 	} 
 	 	 	else 
 	 	 	{ 
 	 	 	 	if (!s.contains(pages[i])) 
 	 	 	 	{ 
 	 	 	 	 	int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;  	 	 	 	 	
                    Iterator<Integer> itr = s.iterator(); 
 	 	 	 	 	while (itr.hasNext()) {  	 	 	 	 	 	
                        int temp = itr.next();  	 	 	 	 	 	
                        if (indexes.get(temp) < lru) 
 	 	 	 	 	 	{ 
 	 	 	 	 	 	 	lru = indexes.get(temp); 
 	 	 	 	 	 	 	val = temp; 
 	 	 	 	 	 	} 
 	 	 	 	 	} 
 	 	 	 	 	s.remove(val); 
 	 	 	 	    indexes.remove(val); 
 	 	 	 	 	s.add(pages[i]);  	 	 	 	 	
                    result++; 
 	 	 	 	} 
 	 	 	 	indexes.put(pages[i], i); 
 	 	 	} 
 	 	} 
 	 	return result; 
 	}
 	public static void main(String args[]) 
 	{ 
 	 	int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2}; 
 	 	int max = 4; 
 	 	System.out.println(pageFaults(pages, pages.length, max)); 
 	} 
}