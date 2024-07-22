public class Main
{
	public static void main(String[] args) {
	    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
	    int minrow=0,mincol=0;
	    int maxrow=2,maxcol=2,k=1;
	    
	    while(k<=9)
	    {
	    for(int i=mincol;i<=maxcol;i++)
	    {
	        System.out.print(arr[minrow][i]+" ");
	        k++;
	    }
	    for(int i=minrow+1;i<=maxrow;i++)
	    {
	        System.out.print(arr[i][maxcol]+" ");
	        k++;
	    }
	    for(int i=maxcol-1;i>=mincol;i--)
	    {
	        System.out.print(arr[maxrow][i]+" ");
	        k++;
	    }
	    for(int i=maxrow-1;i>minrow;i--)
	    {
	        System.out.print(arr[i][mincol]+" ");
	        k++;
	    }
	    minrow++;
	    mincol++;
	    maxcol--;
	    maxrow--;
	    }
	}
}