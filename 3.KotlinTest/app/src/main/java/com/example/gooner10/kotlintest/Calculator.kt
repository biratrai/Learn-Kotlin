package com.example.gooner10.kotlintest

import java.lang.IllegalArgumentException

/**
 * Utility class for SimpleCalc to perform the actual calculations.
 */
class Calculator {

    // Available operations
    enum class Operator {
        ADD, SUB, DIV, MUL
    }

    /**
     * Addition operation
     */
    fun add(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand + secondOperand
    }

    /**
     * Subtract operation
     */
    fun sub(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand - secondOperand
    }

    /**
     * Divide operation
     */
    fun div(firstOperand: Double, secondOperand: Double): Double {
        if (secondOperand == 0.0) {
            throw ArithmeticException("You cannot divide by zero")
        }
        return firstOperand / secondOperand
    }

    /**
     * Multiply operation
     */
    fun mul(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand * secondOperand
    }
}