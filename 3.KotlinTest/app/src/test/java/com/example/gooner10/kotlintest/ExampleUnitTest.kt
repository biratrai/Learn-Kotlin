package com.example.gooner10.kotlintest

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
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
}
