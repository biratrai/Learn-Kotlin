package com.example.gooner10.kotlintest

import android.util.Log
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculatorTest {
    private var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addTwoNumbers() {
        val resultAdd = calculator!!.add(1.0, 2.0)
        assertThat(resultAdd, `is`(equalTo(3.0)))
    }

    @Test
    fun addTwoNumbersNegative() {
        val resultAdd = calculator!!.add(-1.0, 2.0)
        assertThat(resultAdd, `is`(equalTo(1.0)))
    }

    @Test
    fun addTwoNumbersWorksWithNegativeResult() {
        val resultAdd = calculator!!.add(-1.0, -17.0)
        assertThat(resultAdd, `is`(equalTo(-18.0)))
    }

    @Test
    fun addTwoNumbersFloats() {
        val resultAdd = calculator!!.add(1.111, 1.111)
        assertThat(resultAdd, `is`(equalTo(2.222)))
    }

    @Test
    fun addTwoNumbersBignums() {
        val resultAdd = calculator!!.add(123456781.0, 111111111.0)
        assertThat(resultAdd, `is`(equalTo(234567892.0)))
    }

    @Test
    fun subTwoNumbers() {
        val resultSub = calculator!!.sub(1.0, 1.0)
        assertThat(resultSub, `is`(equalTo(0.0)))
    }

    @Test
    fun subWorksWithNegativeResult() {
        val resultSub = calculator!!.sub(1.0, 17.0)
        assertThat(resultSub, `is`(equalTo(-16.0)))
    }

    @Test
    fun divTwoNumbers() {
        val resultDiv = calculator!!.div(32.0, 2.0)
        assertThat(resultDiv, `is`(equalTo(16.0)))
    }

    @Test(expected = ArithmeticException::class)
    fun divDivideByZeroThrows() {
        calculator!!.div(32.0, 0.0)
    }

    @Test
    fun mulTwoNumbers() {
        val resultMul = calculator!!.mul(32.0, 2.0)
        assertThat(resultMul, `is`(equalTo(64.0)))
    }
}
