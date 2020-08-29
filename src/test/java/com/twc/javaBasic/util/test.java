package com.twc.javaBasic.util;

import com.twc.javaBasic.NameImpl;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class test {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        SimpleObjectWithInternalState instance = new SimpleObjectWithInternalState("Initial Name");

        tryingToUpdateState(instance);

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 164 of "Core Java Vol 1", section 4.5.
        // <--start
        final String expected = "Updated Name";
        // --end-->

        assertEquals(expected, instance.getName());
        System.out.println("Assertion statement through");
    }
    private static void tryingToUpdateState(SimpleObjectWithInternalState instance) {
        instance.setName("Updated Name");
    }


}
