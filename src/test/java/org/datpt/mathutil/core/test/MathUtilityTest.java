/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.datpt.mathutil.core.test;

import org.datpt.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dat Pham
 */
public class MathUtilityTest {
   @Test
   public void checkFactorialGivenRightArgumentReturnsWell(){
       assertEquals(1,MathUtility.getFactorial(0));
       assertEquals(1,MathUtility.getFactorial(1));
       assertEquals(2,MathUtility.getFactorial(2));
       assertEquals(24,MathUtility.getFactorial(4));
       assertEquals(720,MathUtility.getFactorial(6));
       
       
}
    
}

//KIẾN THỨC MỚI : DDT
//                DDT: DATA DRIVEN TEST
//                KĨ THUẬT VIẾT CODE CỦA UNIT TEST
//                MÀ TÁCH PHẦN DATA RA KHỎI CÂU LỆNH assertE()

// test case hướng về việc tách data test ra riêng biệt

//KO NHẦM VỚI TDD:TEST DRIVEN DEVELOPMENT
//Kĩ thuật viết code làm app thì phải viết luôn cho các
//test case để đảm boả hmà chạy ngon

//TDD: viết code chính cà code test/test case đan xen để check hàm đúng sai
//DDT: trong khi viết code, tách data test ra 1 chỗ riêng để dễ đọc,bảo trì

//DDT NẰM TRONG TDD
