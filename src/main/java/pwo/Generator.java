/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;
import java.math.BigDecimal;

/**
 *
 * @author student
 */
public abstract class Generator {
    public abstract BigDecimal getTerm(int i);
    int lastIndex = 0;
    BigDecimal current;

    BigDecimal f_1, f_2;
    Generator( BigDecimal c, BigDecimal f1, BigDecimal f2){
        current = c;
        f_1 = f1;
        f_2 = f2;
    }
}
