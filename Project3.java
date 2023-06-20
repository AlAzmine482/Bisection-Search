import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//AL Azmine
//Project #2
public class Project3 {
	public static void main(String [] args) {
		int row;
		int col;
		int target;
		//int startrow = 0;
		//int startcol = 0;
		
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			row = sc.nextInt();
			col = sc.nextInt();
			target = sc.nextInt();
			System.out.println(row);
			System.out.println(col);
			System.out.println(target);
		
			int [][] arr = new int[row][col];
			
			for(int i = 0; i < row; i++) {
				for(int j =0; j< col; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < row; i++) {
				for(int j =0; j< col; j++) {
					System.out.print(arr[i][j]+ " ");
			
				
				}
				System.out.println(" ");
			}
			
			
			
			
			//int [][] checkarr = check(arr, row, col, target, startrow, startcol); 
			
			
			
			//System.out.println(arr[2][2]);
			// int [][] Bisearch = bisectionsearch(arr,row, col,target, startrow, startcol);
    int [][] Bisearch = bisectionsearch(arr,row, col,target);
	}
	 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("No file found");
		System.exit(1);
		e.printStackTrace();

	}	
	}
//public static int[][] bisectionsearch(int[][] arr, int row, int col, int target, int startrow, int startcol) {
	public static int[][] bisectionsearch(int[][] arr, int row, int col, int target) {
		int[][] subarray1 = new int[row][col];
		int [][] subarray2 = new int[row][col];
		int[][] subarray3 = new int[row][col];
		int rowupt = 0;
		int colupt = 0;
		int startrow = 0;
		int startcol = 0;
	
		ArrayList<Integer> subarrnum = new ArrayList<>();
		
		
		//int numrow = arr.length;
		//int numcol = arr[0].length;
		System.out.println("This is row: "+ row);
		System.out.println("this is col: " + col);

		
		
		//upt row = midx -> 2 - 1 / 2 = 0.5 = 0  third sub =  5 - 1 =4/2 = 2
		//upt col = midy + col2 4+2 =6/2 = 3 third sub = 2 + 
		
	
		int left = 1;
		int right = row;
		//(numrow - left)/2;
		int midx= ((row - left)+ startrow)/2;
		int col2 = col - 1;	
	    //midx = (row/3);
		//(col2 / 2)
		int midy = ((col2 + startcol)/ 2);
		
	//	System.out.println("This is midx: "+ midx);
	//	System.out.println("this is midy: " + midy);

//		int diff = arr[midx][midy] - target;
		
		//int[][] well =  check(arr, row, col, target, startrow, startcol,  midx, midy); 

		System.out.println("this is mid: " + arr[midx][midy]);
		System.out.println("First subarray: "); 
		//if (arr[midx][midy] > target) {
				if(startcol == 0) {
			for (int i = 0; i < midx; i++) {
				for (int j = 0; j < midy; j++) {
					
					
					subarray1[i][j] = arr[i][j];
					System.out.print(arr[i][j] + " ");
					//System.arraycopy(arr, 0, subarray1, 0, 4);
					
				}
				System.out.println(" ");
			}
			rowupt = midx;
			colupt = midy;
			
			int [][] checksubarr1 = check(subarray1, rowupt, colupt,target,startrow,startcol);
			}
			//bisectionsearch(subarray1, rowupt, colupt,target,startrow,startcol);
				
		 
			startcol = 0;
			startrow = 0;
			
			System.out.println("Second subarray: ");
			//System.arraycopy(arr[0][3], 0, subarray2, 0, 2);
			//subarrnum = Arrays.copyOf(arr, 2);
		//Arrays.copyOf(arr, 2);
			
//			for(int[] subarr2: arr) {
//				//System.arraycopy(arr, 0, subarray2,0,2);
//				Arrays.fill(subarray2, arr);
//			}
//			
			
			if(startcol == 0) {
			for (int i = 0; i <  midx; i++) {
				//for(int j = 0; j < col; j++) {
				//col for j loop prev
			//	System.arraycopy(arr[0][j], 0, subarray2, 0, 2);
				for (int j = midy; j < col; j++) {
					//System.arraycopy(arr, 0, subarray2, 0, 2);
					//System.arraycopy(arr[i][j], 0, subarray2, 0, 2);
					//System.arraycopy(arr[i][j],0, subarray2, 0, 2);
					System.out.print(arr[i][j] + " ");
					//subarrnum[i][j] = arr[i][j];
//					subarray2 = Arrays.stream(arr[i])
//							.map(ar -> Arrays.copyOf(ar, ar[i].length)).toArray(int [][]:: new);
//				
					
					//subarrnum.add(arr[i][j]);
				     subarray2[i][j] = arr[i][j];
					//subarray2[i] = arr[0].clone();
					//System.arraycopy(arr, 0, subarrnum, 0, 2);
					
		       
					//System.out.print(subarrnum[i][j]+ " ");
					//Arrays.fill(subarray2, arr[i][j]);
					//subarray2 = Arrays.copyOf(arr, 2);
					//subarray2 = Arrays.fill(arr[i][j], 2);
					//subarray2[i][j] = arr[i][j];
					//subarray2  = arr[i][j];
				
				}
				
			
				System.out.println(" ");
				
			}
			System.out.println(startcol);
			rowupt = midx;
			startcol = midy;
			System.out.println(startcol);
			int [][] checksubarr2 = check(subarray2,rowupt,col,target,startrow,startcol);
			//works 
			//bisectionsearch(subarray2,rowupt,col,target,startrow,startcol);
			}
			
			
		//	System.out.println(subarrnum);
			
//			
//			for(int i = 0; i < midx;i++) {
//				
//					
//				//subarray2[i] = Arrays.copyOf(subarrnum[i],subarrnum[i].length);
//				for(int j = midy; j< subarray2[0].length; j++) {
//					//subarray2[0][j] = subarrnum.get(j);
//					//subarray2[1][j] = subarrnum.get(j+3);
//					
//					
//				//System.arraycopy(arr, 0, subarray2, 0, 2);
//					//subarray2 = Arrays.copyOf(subarrnum, 2);
//					
//					//subarray2[i][j] = subarrnum.get(i);
//					
//					//subarray2[i][j] = subarrnum.get(i);
//				//	subarray2[0][j] = subarrnum.get(j);
//			     //
//					//System.out.print(subarrnum[i][j]+ " ");
//					
//					//subarray2[0][0] = new ArrayList();
//					//subarray2[0][0].add(subarrnum.get(i));
//					System.out.print(subarray2[i][j] +" ");
//				}
//				System.out.println(" ");
//			}
//			
			startcol = 0;
			startrow = 0;
			
			System.out.println("Third subarray: ");
			//row for i loop prev
			if(startcol == 0) {
			for (int i = midx; i <  row; i++) {
				for (int j = 0; j < midy; j++) {
					System.out.print(arr[i][j] + " ");
					subarray3[i][j] = arr[i][j];

				}
				System.out.println(" ");
			}
			 
			startrow = midx;
			col = midy;
			System.out.println(startcol);
			
			int [][] checksubarr3 = check(subarray3,row,col,target,startrow,startcol);
			//bisectionsearch(subarray3,row,col,target,startrow,startcol);
			}
			
			//bisectionsearch(subarray3,row,col,target,startrow,startcol);
				//int [][] help = check(subarray3,row,col,target,startrow,startcol);
				//(int[][] arr, int row, int col, int target, int startrow, int startcol, int midx, int midy) {
			
		//int [][]  help = subarray1(subarray1,row,col,target,midx,midy);
			//row = midx;
			//row = midy;
	      // bisectionsearch(help, midx,midy,target);
	      
	    //bisectionsearch(subarray2,subarray2.length,subarray2[0].length,target);
			//bisectionsearch(subarray1,row,col, diff);
			//bisectionsearch(subarray2, numrow, numcol, diff);
			//bisectionsearch(subarray3,row,col, diff);


//		}
//		else if(arr[midx][midy] < target) {
//			System.out.println("target is bigger: ");
//			for(int i  = 0; i < midx; i++) {
//				for(int j = 0; j < midy; j++) {
//					System.out.println(arr[i][j]);
//				}
//			}
//		}
//		else if(arr[midx][midy] == target) {
//			System.out.println("correct");
//			System.out.println("arr mid: " + arr[midx][midy] + " Index: ("+ (midx + 1) +"," + (midy+1) +")");
//			
//		}
		
		
		
		
//		while (((row % 2) != 0) || ((col % 2) != 0)) {
//			if (((row % 2) != 0)) {
//				midx = (row + 1) / 2;
//
//			}
//
//			if ((col % 2) != 0) {
//				midy = (col + 1) / 2;
//			}
//		}

		return arr;

	}
	public static int[][] subarray1(int[][] arr, int row, int col, int target, int midx, int midy) {
		int [][] subarray = new int[row][col];
	
		
		//System.out.println(row);
	System.out.println("subarr1 method");
		
//		if (arr[midx][midy] > target) {
			for (int i = 0; i < midx; i++) {
				for (int j = 0; j < midy; j++) {
					subarray[i][j] = arr[i][j];
					System.out.print(arr[i][j] + " ");
					
				}
				System.out.println(" ");
			}
			
			row = midx;
			col = midy;
			
			System.out.println(row);
			System.out.println(col);
			
			
		return subarray;
	
	}
	
	public static int[][] check(int[][] arr, int row, int col, int target, int startrow, int startcol) {

		int left = 1;
		int right = row;
		//(numrow - left)/2;
		int midx= ((row - left)+ startrow)/2;
		int col2 = col - 1;	
	    //midx = (row/3);
		//(col2 / 2)
		int midy = ((col2 + startcol)/ 2);
		
		if (arr[midx][midy] > target) {
			System.out.println("Not Found");
			System.out.println("This is midx: "+ midx);
			System.out.println("this is midy: " + midy);
			System.out.println("this is mid: " + arr[midx][midy]);
			


			

			//bisectionsearch(arr, row, col,target, startrow, startcol);
		}
		else if(arr[midx][midy] < target) {
			System.out.println("Not Found: ");
			System.out.println("Target");
			System.out.println("This is midx: "+ midx);
			System.out.println("this is midy: " + midy);
			System.out.println("this is mid: " + arr[midx][midy]);


			//bisectionsearch(arr, row, col,target, startrow, startcol);
			
		}
		else if(arr[midx][midy] == target) {
			System.out.println("correct");
			System.out.println("arr mid: " + arr[midx][midy] + " Index: ("+ (midx + 1) +"," + (midy+1) +")");
			
		}
		
		//bisectionsearch(arr, row, col,target, startrow, startcol);
		return arr;
	}
	
	


}