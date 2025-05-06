package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
        require(numbers.all { it -> (1 <= it) && (it <= 45) }) { "[ERROR] Each Lotto number should between 1 and 45." }
        require(numbers.size == numbers.distinct().size) { "[ERROR] Each Lotto number should be unique." }
        require(numbers.sorted() == numbers) { "[ERROR] Lotto number should be in ascending order." }
    }

    override fun toString(): String {
        return numbers.toString()
    }
}
