package org.datpt.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.datpt.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


/**
 *
 * @author Dat Pham
 */
//hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
//0 ->1
//1 ->1
//mảng 2 chiièu, cột 0 là n, cột 1 là expected
//n    expected


public class MathUtilityAdvancedTest {
    public static Object [][] initTestData(){
        Object testData[][]={{0,1},{1,1},{2,2},{4,24},{5,120}}; 
        
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkcheckFactorialGivenRightArgumentReturnsWell(int n, long expected){
                                                                //cột 0      cột 1  
        assertEquals(expected,getFactorial(n));
    }
}

//bắt ngoại lệ , tức là hàm getF() trả về
//ngoại lệ khi đưa n cà chớn -1, -2 ,n>20
//junit đưa ra hàm mới AssertThrows()
//hàm này dùng lambda expresion
