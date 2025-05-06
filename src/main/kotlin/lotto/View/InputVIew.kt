package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.model.WinningNumberParser

import lotto.validation.PurchaseAmountValidator
import lotto.validation.WinningNumberValidator

object InputView {

    fun readPurchaseAmount(): String {
        while (true) {
            try {
                println("Please enter the purchase amount.")
                val purchaseAmount = Console.readLine()
                PurchaseAmountValidator.validate(purchaseAmount)
                return purchaseAmount
            } catch (e:Exception) {
                println(e)
            }
        }
    }

    fun readWinningNumber(): String {
        while (true) {
            try {
                println()
                println("Please enter last week's winning numbers.")
                val winningNumber = Console.readLine()
                val parsedWinningNumber = WinningNumberParser.parse(winningNumber)
                WinningNumberValidator.validate(parsedWinningNumber)
                return winningNumber
            } catch (e:Exception) {
                println(e)
            }
        }
    }
}