package lotto.view

import camp.nextstep.edu.missionutils.Console

import lotto.validation.PurchaseAmountValidator

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
}