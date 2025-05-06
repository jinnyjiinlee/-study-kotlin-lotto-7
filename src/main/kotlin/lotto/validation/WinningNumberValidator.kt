package lotto.validation

object WinningNumberValidator {
    fun validate(winningNumber: List<String>) {
        require(winningNumber.size == 6) { "Input should not be six digits" }
        require(winningNumber[0] != "") { "Input should not be empty" }
//        - [ ] If any value is not a number.
    }
}