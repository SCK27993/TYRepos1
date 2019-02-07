package assgn;

public class OddIndex {
	public static void reverse(int []a, int n) 
    { 
        for (int i = 0; i < n / 2; i++) 
        { 
        	if(i%2==1) {
            int tempswap = a[i];  
                a[i] = a[n - i - 1];  
                a[n - i - 1] = tempswap;              
        }  
     }
    } 

	public static void main(String[] args) {
		{ 
	        int []a = {1, 2, 3, 4, 5, 6}; 
	        int n = a.length;
	        reverse(a, n); 
	        for (int i = 0; i < n; ++i) 
	        	if(i%2==1) {
	            System.out.print(a[i] + " "); 
	        	}
	    }

	}

}
