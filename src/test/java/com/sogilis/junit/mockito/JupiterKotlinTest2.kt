package com.sogilis.junit.mockito

import com.nhaarman.mockito_kotlin.whenever
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class JupiterKotlinTest2 {

    @InjectMocks
    private lateinit var testedClass: VintageTest1.TestedClass

    @Mock
    private lateinit  var dependency: VintageTest1.Dependency

    class TestedClass(private val dependency: VintageTest1.Dependency) {

        fun apply(input: String): String {
            return dependency.apply(input)
        }
    }

    class Dependency {
        fun apply(input: String): String {
            return input
        }
    }

    @Test
    fun test1() {
        whenever(dependency.apply("input value 1")).thenReturn("output value 1")
        assertEquals("output value 1", testedClass.apply("input value 1"))
    }

    @Test
    fun test2() {
        whenever(dependency.apply("input value 2")).thenReturn("output value 2")
        assertEquals("output value 2", testedClass.apply("input value 2"))
    }

    @Test
    fun test3() {
        whenever(dependency.apply("input value 3")).thenReturn("output value 3")
        assertEquals("output value 3", testedClass.apply("input value 3"))
    }

    @Test
    fun test4() {
        whenever(dependency.apply("input value 4")).thenReturn("output value 4")
        assertEquals("output value 4", testedClass.apply("input value 4"))
    }

    @Test
    fun test5() {
        whenever(dependency.apply("input value 5")).thenReturn("output value 5")
        assertEquals("output value 5", testedClass.apply("input value 5"))
    }

    @Test
    fun test6() {
        whenever(dependency.apply("input value 1")).thenReturn("output value 1")
        assertEquals("output value 1", testedClass.apply("input value 1"))
    }

    @Test
    fun test7() {
        whenever(dependency.apply("input value 2")).thenReturn("output value 2")
        assertEquals("output value 2", testedClass.apply("input value 2"))
    }

    @Test
    fun test8() {
        whenever(dependency.apply("input value 3")).thenReturn("output value 3")
        assertEquals("output value 3", testedClass.apply("input value 3"))
    }

    @Test
    fun test9() {
        whenever(dependency.apply("input value 4")).thenReturn("output value 4")
        assertEquals("output value 4", testedClass.apply("input value 4"))
    }

    @Test
    fun test10() {
        whenever(dependency.apply("input value 5")).thenReturn("output value 5")
        assertEquals("output value 5", testedClass.apply("input value 5"))
    }

    @Test
    fun test11() {
        whenever(dependency.apply("input value 1")).thenReturn("output value 1")
        assertEquals("output value 1", testedClass.apply("input value 1"))
    }

    @Test
    fun test12() {
        whenever(dependency.apply("input value 2")).thenReturn("output value 2")
        assertEquals("output value 2", testedClass.apply("input value 2"))
    }

    @Test
    fun test13() {
        whenever(dependency.apply("input value 3")).thenReturn("output value 3")
        assertEquals("output value 3", testedClass.apply("input value 3"))
    }

    @Test
    fun test14() {
        whenever(dependency.apply("input value 4")).thenReturn("output value 4")
        assertEquals("output value 4", testedClass.apply("input value 4"))
    }

    @Test
    fun test15() {
        whenever(dependency.apply("input value 5")).thenReturn("output value 5")
        assertEquals("output value 5", testedClass.apply("input value 5"))
    }
}
