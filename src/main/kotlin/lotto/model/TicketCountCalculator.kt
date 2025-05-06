package lotto.model

object TicketCountCalculator {
    fun run (purchaseAmount: String): Int {
        return purchaseAmount.toInt() / 1000
    }
}
