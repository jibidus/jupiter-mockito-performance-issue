package com.jibidus.junit.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JupiterTest2 {

    @InjectMocks
    private VintageTest1.TestedClass testedClass;

    @Mock
    private VintageTest1.Dependency dependency;

    public static class TestedClass {
        private VintageTest1.Dependency dependency;

        public TestedClass(VintageTest1.Dependency dependency) {
            this.dependency = dependency;
        }

        public String apply(String input) {
            return dependency.apply(input);
        }
    }

    public static class Dependency {
        public String apply(String input) {
            return input;
        }
    }

    @Test
    public void test1() {
        when(dependency.apply("input value 1")).thenReturn("output value 1");
        assertEquals("output value 1", testedClass.apply("input value 1"));
    }

    @Test
    public void test2() {
        when(dependency.apply("input value 2")).thenReturn("output value 2");
        assertEquals("output value 2", testedClass.apply("input value 2"));
    }

    @Test
    public void test3() {
        when(dependency.apply("input value 3")).thenReturn("output value 3");
        assertEquals("output value 3", testedClass.apply("input value 3"));
    }

    @Test
    public void test4() {
        when(dependency.apply("input value 4")).thenReturn("output value 4");
        assertEquals("output value 4", testedClass.apply("input value 4"));
    }

    @Test
    public void test5() {
        when(dependency.apply("input value 5")).thenReturn("output value 5");
        assertEquals("output value 5", testedClass.apply("input value 5"));
    }

    @Test
    public void test6() {
        when(dependency.apply("input value 1")).thenReturn("output value 1");
        assertEquals("output value 1", testedClass.apply("input value 1"));
    }

    @Test
    public void test7() {
        when(dependency.apply("input value 2")).thenReturn("output value 2");
        assertEquals("output value 2", testedClass.apply("input value 2"));
    }

    @Test
    public void test8() {
        when(dependency.apply("input value 3")).thenReturn("output value 3");
        assertEquals("output value 3", testedClass.apply("input value 3"));
    }

    @Test
    public void test9() {
        when(dependency.apply("input value 4")).thenReturn("output value 4");
        assertEquals("output value 4", testedClass.apply("input value 4"));
    }

    @Test
    public void test10() {
        when(dependency.apply("input value 5")).thenReturn("output value 5");
        assertEquals("output value 5", testedClass.apply("input value 5"));
    }

    @Test
    public void test11() {
        when(dependency.apply("input value 1")).thenReturn("output value 1");
        assertEquals("output value 1", testedClass.apply("input value 1"));
    }

    @Test
    public void test12() {
        when(dependency.apply("input value 2")).thenReturn("output value 2");
        assertEquals("output value 2", testedClass.apply("input value 2"));
    }

    @Test
    public void test13() {
        when(dependency.apply("input value 3")).thenReturn("output value 3");
        assertEquals("output value 3", testedClass.apply("input value 3"));
    }

    @Test
    public void test14() {
        when(dependency.apply("input value 4")).thenReturn("output value 4");
        assertEquals("output value 4", testedClass.apply("input value 4"));
    }

    @Test
    public void test15() {
        when(dependency.apply("input value 5")).thenReturn("output value 5");
        assertEquals("output value 5", testedClass.apply("input value 5"));
    }
}
