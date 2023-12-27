class kth_setOrnot{
    
    public static void main (String[] args) {
        int n = 5, k = 1; 
	    isKthBitSet(n, k); 
    } 

    static void isKthBitSet(int n, int k) { 
	    //using right shift
        if (((n >> (k - 1)) & 1) == 1) 
		    System.out.println("SET"); 
	    else
		    System.out.println("NOT SET"); 

    } 

    public static void isKthBitSet_using_left(int n, 
								int k) 
	{ 
		if ((n & (1 << (k - 1))) == 1) 
			System.out.print("SET"); 
		else
			System.out.print("NOT SET"); 
	} 

} 
