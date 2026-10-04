class Solution {
    public int divide(int dividend, int divisor) {
        // Handle 32-bit integer overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } 

        // Determine sign of the result
        boolean inNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to absolute long values to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long quotient = 0;

        // Perform bitwise division using a and b
        while (a >= b) {
            long curdivisor = b;
            long curQuotient = 1;

            while (a >= (curdivisor << 1)) {
                curdivisor <<= 1;
                curQuotient <<= 1;
            }

            quotient += curQuotient;
            a -= curdivisor;
        }

        int result = (int) quotient;
        return inNegative ? -result : result;
    }
}