package JAVAtest;

import java.util.Arrays;

public class Algo1 {
	
	public static int[] res;
	
		  public int[] solution(int n, int[] A) {
		    int[] COUNT = new int[n];
		    for (int i = 0; i < n; i++) {
		    	COUNT[i] = 0;
		    }
		    int min = 0;
		    int max = 0;
		    int m = A.length;
		    for (int k = 0; k < m; k++) {
		      if (A[k] <= n) {
		        if (COUNT[A[k] - 1] < min + 1) {
		        	COUNT[A[k] - 1] = min + 1;
		        } else {
		        	COUNT[A[k] - 1]++;
		        }
		        if (COUNT[A[k] - 1] > max) {
		          max = COUNT[A[k] - 1];
		        }
		      } else {
		        min = max;
		      }
		    }
		    for (int i = 0; i < n; i++) {
		      if (COUNT[i] < min) {
		    	  COUNT[i] = min;
		      }
		    }
		    return COUNT;
		  }
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Algo1 A = new Algo1();
		 int[] array = new int[] {3,4,4,6,1,4,4};
		 res = A.solution(5,array);
		 System.out.print("The result of example {3,4,4,6,1,4,4} is : "+Arrays.toString(res));
	}

}
