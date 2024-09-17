public class TransposeMatrix {
    
    public static void main(String[] args) {
        int arr[][] =
			{ { 1, 1, 1, 1 }, 
			{ 2, 2, 2, 2 }, 
			{ 3, 3, 3, 3 }, 
			{ 4, 4, 4, 4 } };					   

    	transpose(arr);

    		for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr[i].length; j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
    }


    static int n = 4;

	static void transpose(int mat[][])
	{
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[i][j] = mat[j][i];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];
	}
}
