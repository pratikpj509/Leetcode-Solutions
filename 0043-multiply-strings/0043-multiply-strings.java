class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int[] arr = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;

                int sum = mul + arr[i + j + 1];

                arr[i + j + 1] = sum % 10;     // store unit digit
                arr[i + j] += sum / 10;        // carry
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}