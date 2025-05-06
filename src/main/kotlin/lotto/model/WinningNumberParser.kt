package lotto.model

object WinningNumberParser {
    fun parse(winningNumber: String): List<String> {
        return winningNumber.split(',')
    }
}