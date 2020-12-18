package JAVAtest;

import java.util.Arrays;

public class Algo2 {
	
	public static int[] res;
	
	public int[] solution(int[] a, int[] b) {

        int[] result = new int[a.length];

        int n = getMax(a);
        int p = getMax(b);

        int[] cache = buildCache(n, p);

        for (int i = 0; i<a.length; i++) {
            result[i] = cache[a[i]] % (int) Math.pow(2, b[i]);
        }

        return result;
    }

    private static int getMax(int[] array) {
        int max = array[0];

        for (int i = 0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int[] buildCache(int n, int p) {
        int[] cache = new int[n+1];
        int previous  = 1;
        int current = 1;

        cache[0] = 1;
        cache[1] = 1;

        int index = 3;

        while (index <= n+1){
            int temp = current;
            current = (previous + current)  % (int) Math.pow(2, p);
            previous = temp;

            cache[index-1] = current;

            index++;
        }

        return cache;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algo2 A = new Algo2();
		int[] array1 = new int[] {4,4,5,5,1};
		int[] array2 = new int[] {3,2,4,3,1};
		 res = A.solution(array1,array2);
		 System.out.print("The result of example {4,4,5,5,1} and {3,2,4,3,1} is : "+Arrays.toString(res));
	}

}
