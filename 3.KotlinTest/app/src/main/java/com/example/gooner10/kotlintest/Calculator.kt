package com.example.gooner10.kotlintest

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
        return firstOperand / secondOperand
    }

    /**
     * Multiply operation
     */
    fun mul(firstOperand: Double, secondOperand: Double): Double {
        return firstOperand * secondOperand
    }
}