public class BigOExample {
    public static void main(String[] args)
    {
//        int a = 0, b = 0;
//        int N = 4, M = 4;
//
//        // This loop runs for N time
//        long firsttime = System.currentTimeMillis();
//        System.out.println(firsttime);
//        for (int i = 0; i < N; i++)
//        {
//            a = a + 10;
//        }
//
//        // This loop runs for M time
//        for (int i = 0; i < M; i++)
//        {
//            b = b + 40;
//        }
//        long lasttime = System.currentTimeMillis();
//        System.out.println(lasttime);
//        System.out.print(a + " " + b+ "\n");
//        System.out.printf("time: %d",lasttime - firsttime);
//
//        //O(M + N + 1) = O(M + N);
        {
            int a = 0, b = 0;
            int N = 1000, M = 1000;

            // Nested loops
            long firsttime = System.currentTimeMillis();
            System.out.println(firsttime);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    a = a + j;

                    // Print the current
                    // value of a

                    System.out.print(a + " | ");
                }

            }
            System.out.println();
            long lasttime = System.currentTimeMillis();
        System.out.println(lasttime);
            System.out.printf("Time: %d",lasttime - firsttime);
//            return 0;

//        O(M*N);
        }
    }
}
