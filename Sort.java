
public class Sort {
//    static int[] rearrange(int[] new_arra, int n)
//   {
//       int temp[] = new int[n];
//    
//        int small_num = 0, large_num = n-1;
//        boolean flag = true;
//    
//       for (int i=0; i < n; i++)
//       {
//           if (flag)
//               temp[i] = new_arra[large_num--];
//           else
//               temp[i] = new_arra[small_num++];
//    
//           flag = !flag;
//       }
//    
//       return temp;
//   }
	public static int[] sort(int[] a,
            int fromIndex,
            int toIndex) {
		 int temp[] = new int[fromIndex];
		    
	        int small_num = 0, large_num = fromIndex-1;
	        boolean flag = true;
	    
	       for (int i=0; i < fromIndex; i++)
	       {
	           if (flag)
	               temp[i] = a[large_num--];
	           else
	               temp[i] = a[small_num++];
	    
	           flag = !flag;
	       }
	       return temp;
		
	}
	public static void main(String[]args) {
		{
	        int num[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        int result[];
	        result = sort(num,num.length,num.length);

		       for (int i=0; i < result.length; i++)
		       {
	        System.out.println(result[i]);
	}
	}
}
}
