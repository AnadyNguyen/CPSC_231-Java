public class fibonacci {
    public static int recFib (int biF) { //5
        if (biF <= 1) {
            return biF;
        } else {
            return recFib(biF - 1) + recFib(biF - 2);
        }
    }
}

// 0,1,1,2,3,5,8