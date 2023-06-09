/* 
Solve a sudoku
*/
public class Sudoku{

	public static void print(int [][]grid){
		for (int i=0;i<9;i++){
			for (int j=0;j<9;j++){
				int a = grid[i][j];
				String s=Integer.toString(a);
				if(s.equals("0")){
					s=".";}
				if(j==2 || j==5)
					System.out.print(s+" | ");
				else
					System.out.print(s+" ");
				if((i==2 || i==5) && j==8){
					System.out.println();
					for (int k=0;k<11;k++)
						System.out.print("- ");
				}	
			}
			System.out.println("");
		}
	}

	public static boolean check(int [][] grid, int row,int col,int num){

		for (int x=0;x<9;x++)
			if (grid[row][x] == num)
				return false;
  
    
		for (int x=0;x<9;x++)
			if (grid[x][col] == num)
				return false;
		
		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				if (grid[i + startRow][j + startCol] == num)
					return false;

		return true;

	}

	public static boolean solve(int[][] grid,int row,int col){
		if (row == 8 && col == 9)
            return true;
  
        if (col == 9) {
            row++;
            col = 0;
        }

        if (grid[row][col] != 0)
            return solve(grid, row, col + 1);

        for (int num = 1; num < 10; num++) {
            if (check(grid, row, col, num)) {
                grid[row][col] = num;
				
                if (solve(grid, row, col + 1))
                    return true;
            }
            grid[row][col] = 0;
        }
        return false;
	}
	public static void main(String[] args) {
	    int[][] grid = {  	{7, 0, 0,   0, 0, 0,   2, 0, 0},   
							{4, 0, 2,   0, 0, 0,   0, 0, 3},   
							{0, 0, 0,   2, 0, 1,   0, 0, 0}, 

							{3, 0, 0,   1, 8, 0,   0, 9, 7},   
							{0, 0, 9,   0, 7, 0,   6, 0, 0},   
							{6, 5, 0,   0, 3, 2,   0, 0, 1}, 

							{0, 0, 0,   4, 0, 9,   0, 0, 0},   
							{5, 0, 0,   0, 0, 0,   1, 0, 6},   
							{0, 0, 6,   0, 0, 0,   0, 0, 8}   
						}  ;
		System.out.println("Before solving:");
		print(grid);
		solve(grid,0,0);
		System.out.println("After solving:");
		print(grid);
	}
}