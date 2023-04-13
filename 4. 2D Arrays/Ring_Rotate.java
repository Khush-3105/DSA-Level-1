/* 
You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. 

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
*/
import java.util.*;

public class Ring_Rotate {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i =0 ; i<n; i++){
			for(int j=0; j<m; j++){
				arr[i][j]=sc.nextInt();
			}
		}
        int s = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

        rotateshell(arr,s,r);
        display(arr);
    }

    public static int[] fill1d(int [][]arr, int s){
        int minr= s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int size= 2*(maxr-minr)+ 2*(maxc-minc); //lw+bw+rw+tp-corners = 2 lw + 2bw -4
        int [] a = new int[size];
        int index=0;
        //lw
        for(int i = minr, j=minc;i<=maxr;i++){
            a[index]=arr[i][j];
            index++;
        }

        //bw
        for(int i = maxr, j=minc+1;j<=maxc;j++){
            a[index]=arr[i][j];
            index++;
        }

        //rw
        for(int i = maxr-1, j=maxc;i>=minr;i--){
            a[index]=arr[i][j];
            index++;
        }

        //tw
        for(int i = minr, j=maxc-1;j>=minc+1;j--){
            a[index]=arr[i][j];
            index++;
        }

        return a;
    }
    public static void fillshell(int [][]arr,int s,int []a){
        int minr= s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        
        int index=0;
        //lw
        for(int i = minr, j=minc;i<=maxr;i++){
            arr[i][j]=a[index];
            index++;
        }

        //bw
        for(int i = maxr, j=minc+1;j<=maxc;j++){
            arr[i][j]=a[index];
            index++;
        }

        //rw
        for(int i = maxr-1, j=maxc;i>=minr;i--){
            arr[i][j]=a[index];
            index++;
        }

        //tw
        for(int i = minr, j=maxc-1;j>=minc+1;j--){
            arr[i][j]=a[index];
            index++;
        }

    }

    public static void rotateshell(int[][] arr, int s,int r){
        int[] a = fill1d(arr,s);
        rotate(a,r);
        fillshell(arr,s,a);
    }

    public static void rotate(int[] a,int r){
        int n=a.length;
        r=r%n;
        if(r<0){
            r=r+n;
        }
        reverse(a,n-r,n-1);
        reverse(a,0,n-r-1);
        reverse(a,0,n-1);
    }

    public static void reverse(int[] a,int i , int j ){
        while(i<j){
            int t= a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}