package lotto.model

object PurchaseAmountParser {
    fun parse(purchaseAmountInput: String): Int {
        return purchaseAmountInput.toInt() % 1000
    }
}