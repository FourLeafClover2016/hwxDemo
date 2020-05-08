package com.hwx.algorithm;

/**
 * 最大公约数
 */
public class Gcd {

    public static int getGcd(int a, int b) {
        if (a == b) {
            return a;
        }
        int aFlag = a & 1;
        int bFlag = b & 1;
        // a b 均为偶数
        if (aFlag == 0 && bFlag == 0) {
            return 2 * getGcd(a >> 1, b >> 1);
        }
        // a为偶数，b为奇数
        else if (aFlag == 0 && bFlag != 0) {
            return getGcd(a >> 1, b);
        }
        // a 为奇数 ， b为偶数
        else if (aFlag != 0 && bFlag == 0) {
            return getGcd(a, b >> 1);
        }
        // a,b 均为奇数；
        else {
            int big = a > b ? a:b;
            int small = a < b ? a:b;
            return getGcd(small, big-small);
        }
    }
}
