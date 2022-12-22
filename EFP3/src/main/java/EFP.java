public class EFP {
    public static void main(String[] args) {

        Odd ref1;

        ref1 = (d) -> {

            if (d%2==0) return true;
            else return false;
        };

        SumArray obj1 = new SumArray();

        int[] A = { 5, 3, 8, 10, 2, 1, 2, 3 };

        int sum = obj1.Sum(A, ref1);
        System.out.println("sum = " + sum);

        sum = obj1.Sum(A,
                (Odd)((d) -> {
                    if (d%2!=0) return true;
                    else return false;
                }));
        System.out.println("sum = " + sum);
    }
}
