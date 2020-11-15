 public int smallestDifference(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while(i<A.length && j<B.length)
        {
           min = Math.min(min,Math.abs(A[i]-B[j]));
           if(A[i]==B[j])
            break;
           if(A[i]<B[j])
              i++;
           else
              j++;
        }
        return min;
    }
