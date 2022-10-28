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
public class LucasGenerator extends Generator {

    LucasGenerator(){
        super(new BigDecimal(0), new BigDecimal(2), new BigDecimal(1));
    }
    
    public void reset() {   
        lastIndex = 0;
        current = new BigDecimal(0);
        f_1 = new BigDecimal(2);
        f_2 = new BigDecimal(1);
    }
    
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_1 = f_2;
            f_2 = current;
        } else if (lastIndex == 1) {
            current = f_2;
        } else {
            current = f_1;
        }
        lastIndex++;
        return current;
    }
    @Override
    public BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
      
    }
    
}
