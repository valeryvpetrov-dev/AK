class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1; int j = num2.length() - 1;
        int extra = 0;
        while (i >= 0 || j >= 0 || extra > 0) {
            int num1i = 0;
            if (i >= 0) num1i = (int) (num1.charAt(i--) - '0');
            int num2j = 0;
            if (j >= 0) num2j = (int) (num2.charAt(j--) - '0');
            int sum = num1i + num2j + extra;
            if (sum / 10 > 0) {
                result.insert(0, sum % 10);
                extra = 1;
            } else {
                result.insert(0, sum);
                extra = 0;
            }
        }
        return result.toString();
    }
}