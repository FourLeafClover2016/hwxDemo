package com.hwx.algorithm.leetcode.String;

/**
 * 两个大数相加
 */
public class BigNumberAdd {
    public static String add(String s1, String s2) {
        if (s1 == null) {
            return s2;
        }
        if (s2 == null) {
            return s1;
        }
        s1 = new StringBuffer(s1).reverse().toString();
        s2 = new StringBuffer(s2).reverse().toString();
        int len1 = s1.length();
        int len2 = s2.length();
        int len = len1 < len2 ? len1 : len2;
        int flag = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int temp = Integer.parseInt(String.valueOf(s1.charAt(i))) +Integer.parseInt(String.valueOf(s2.charAt(i))) + flag;
            flag = temp / 10;
            temp = temp % 10;
            result.append(temp);
        }

        if (len1 != len2) {
            String s = null;
            int maxLen = 0;
            if (len1 > len2) {
                s = s1;
                maxLen = len1;
            } else {
                s = s2;
                maxLen = len2;
            }

            for (int i = len; i < maxLen; i++) {
                int temp = Integer.parseInt(String.valueOf(s.charAt(i))) + flag;
                flag = temp / 10;
                temp = temp % 10;
                result.append(temp);
            }
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {

        String add = add("123456789", "55555555");
        System.out.println(add);
    }
}
