
public class SearchAlgorithms {

	public static void main(String[] args) {
		int[]test1= {1,2,3,4,5,6,7,8,9,10};
		int[]test2= {0,4,5,6,12,15,17,23,29};
		System.out.println(binSearch(test1,3));//2
		System.out.println(linSearch(test1,3));
		
		System.out.println(binSearch(test2,23));//7
		System.out.println(linSearch(test2,23));
		
		System.out.println(binSearch(test2,25));//-1
		System.out.println(linSearch(test2,25));
		
		System.out.println(binSearch(test1,10));//9
		System.out.println(linSearch(test1,1));//0
		
		System.out.println(binSearch(test1,1));//0
		
		

	}
	
	public static int linSearch(int[]test,int target)
	{
		for(int x=0;x<test.length;x++)
		{if (test[x]==target)
		   {return x;}	
		}
		return -1;
	}
	
	public static int binSearch(int[]test,int target)
	{int L=0;
	 int R=test.length-1;
	 while(L<=R)
	  {int mid=L+((R-L)/2);
	   if (target==test[mid])
	   {return mid;}
	   if(target>test[mid])
	       {L=mid+1;}
	   if(target<test[mid])
	       {R=mid-1;}	 
	  }
		return -1;
	}


}
