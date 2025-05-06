package lotto.model

import camp.nextstep.edu.missionutils.Randoms
import lotto.Lotto

object LottoMaker {
    fun run(ticketCount: Int): MutableList<Lotto> {
        val lottoTickets = mutableListOf<Lotto>()

        repeat(ticketCount) {
            val oneLottoTicket = Lotto((Randoms.pickUniqueNumbersInRange(1, 45, 6)).sorted())
            lottoTickets.add(oneLottoTicket)
        }

        return lottoTickets
    }
}