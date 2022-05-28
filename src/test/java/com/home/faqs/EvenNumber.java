package com.home.faqs;

import org.junit.Test;

public class EvenNumber {


    int[] n = {5, 4, 3, 6, 9};

    @Test
    public void isEvenNumber() {
        for (int j : n) {
            if (j % 2 == 0)
                System.out.println(j + " is Even");
            else
                System.out.println(j + " is Odd");
        }
    }
}
