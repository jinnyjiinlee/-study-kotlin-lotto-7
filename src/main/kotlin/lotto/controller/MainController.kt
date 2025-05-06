package lotto.controller

import lotto.model.TicketCountCalculator
import lotto.view.InputView
import lotto.view.OutputView

class MainController() {
    fun run() {
        val purchaseAmount = InputView.readPurchaseAmount();

        val ticketCount = TicketCountCalculator.run(purchaseAmount)
        OutputView.printTicketCount(ticketCount)
        OutputView.printLottoTicket(ticketCount)
    }
}