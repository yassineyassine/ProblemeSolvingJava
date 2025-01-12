class Solution {
    public static double calculateTax(int[][] brackets, int income) {
        int ans = 0, prev = 0;
        for (var e : brackets) {
            int upper = e[0], percent = e[1];
            ans += Math.max(0, Math.min(income, upper) - prev) * percent;
            prev = upper;
        }
        return ans / 100.0;
    }

    public static void main(String[] args) {

        int [][] listIncome={{3,50},{7,10},{12,25}};


        double tax=calculateTax(listIncome,10);

        System.out.print(tax);


    }
}