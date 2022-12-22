class SumArray {

        public int Sum(int[] A, Odd refLambda) {
            int sum=0;
            for (int i=0; i<A.length; i++)
                if (refLambda.IsOdd(A[i]))
                    sum+=A[i];
            return sum;
        }
    }

