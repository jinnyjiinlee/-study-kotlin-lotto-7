package lotto.view

import lotto.model.LottoMaker

object OutputView {
    fun printTicketCount(ticketCount: Int) {
        println()
        println("You have purchased $ticketCount tickets.")
    }

    fun printLottoTicket(ticketCount: Int) {
        val lottoTickets = LottoMaker.run(ticketCount)
        lottoTickets.forEach { println(it) }
    }
}