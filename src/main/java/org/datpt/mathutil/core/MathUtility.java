/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.datpt.mathutil.core;

/**
 *
 * @author Dat Pham
 */
public class MathUtility {

    public static final double PI = 3.1415;
    //hàm này tính giai thừa của n
    //0!=1!=1
    //ko có âm giai thừa => -1! , -5! : nèm ngoại lệ
    //vì giai thừa tăng rất nhanh, 20! là vừa đủ cho long
    //long: 18 số 0
    //21! kiểu long chứa kh dc
    //chỉ cho phép n=0..20
    //n>20 => nèm exception

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 1 and 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n-1);
    }
    
    
}
