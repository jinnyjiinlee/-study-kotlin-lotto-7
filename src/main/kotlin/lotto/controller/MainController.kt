package lotto.controller

import lotto.model.PurchaseAmountParser
import lotto.view.InputView

class MainController() {
    fun run() {
        val purchaseAmount = InputView.readPurchaseAmount();
        val ticketCount = PurchaseAmountParser.parse(purchaseAmount)
    }
}