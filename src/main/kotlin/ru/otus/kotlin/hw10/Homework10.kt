package ru.otus.kotlin.hw10

import java.time.LocalDateTime
import kotlin.math.max

fun main() {

    val lambdaFunction: () -> Unit = { println("executed") }

    fun executeLambdaFunc(n: Int, f: () -> Unit) = repeat(n) { f() }
    executeLambdaFunc(10, lambdaFunction)

    //task2
    fun main_f(f: () -> Unit) {
        println(LocalDateTime.now())
        f()
        println(LocalDateTime.now())
    }
    main_f(lambdaFunction)

    fun knapsack(weights: IntArray, costs: IntArray, needed: Int): Int {
        val n = weights.size
        val dp = Array(needed + 1) { IntArray(n + 1) }
        for (j in 1..n) {
            for (w in 1..needed) {
                val el1 = dp[w][j - 1]

                if (weights[j - 1] <= w) {
                    val el2Cost = costs[j - 1]
                    val el2 = dp[w - weights[j - 1]][j - 1]

                    dp[w][j] = Math.max(el1, el2 + el2Cost)
                } else {
                    dp[w][j] = el1
                }
            }
        }
        return dp[needed][n]
    }

    fun knapsackLambda(weightsF: (Int) -> Int, weightsSizeF: () -> Int, costsF: (Int) -> Int, neededF: () -> Int): Int {
        val needed = neededF()
        val n = weightsSizeF()
        val dp = Array(needed + 1) { IntArray(n + 1) }
        for (j in 1..n) {
            for (w in 1..needed) {
                val el1 = dp[w][j - 1]

                if (weightsF(j - 1) <= w) {
                    val el2 = dp[w - weightsF(j - 1)][j - 1]
                    val el2Cost = costsF(j - 1)

                    dp[w][j] = max(el1, el2 + el2Cost)
                } else {
                    dp[w][j] = el1
                }
            }
        }
        return dp[needed][n]
    }

}