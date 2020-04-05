package com.basicjavapractice;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void shouldReturnArithmeticException() {
        var r = 1 / 0;
    }

    @Test
    public void shouldReturnArithmeticExceptionMessage() {
        var errorMsg = "null";
        try {
            var r = 1 / 0;
        } catch (ArithmeticException e) {
            errorMsg = e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            errorMsg = e.getMessage();
        }
        // handle the known one always
        catch (Exception e) {
            errorMsg = e.getMessage();
        }

        Assert.assertEquals("/ by zero", errorMsg);
    }

    @Test
    public void shouldReturnIndexOutOfBoundsExceptionMessage() {
        var errorMsg = "null";
        try {
            var collection = new int[]{1, 2, 3};
            var result = collection[3];
        } catch (ArithmeticException e) {
            errorMsg = e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            errorMsg = "Out of bounds";
        }
        // handle the known one always
        catch (Exception e) {
            errorMsg = e.getMessage();
        }

        Assert.assertEquals("Out of bounds", errorMsg);
    }

}
