package lotto.validation

object PurchaseAmountValidator {
    fun validate(purchaseAmount: String) {
        require(purchaseAmount != "") { "Input should not be empty" }
        require(purchaseAmount.toInt() >= 1000 ) { "Input should more than 1,000" }
        require(purchaseAmount.toInt() % 1000 == 0 ) { "If the amount is not divisible by 1,000." }
        // TO-DO
//        require(purchaseAmount0 ) { "If the input is not a valid number." }
    }
}