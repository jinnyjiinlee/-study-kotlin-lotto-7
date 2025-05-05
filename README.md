### Receive the purchase amount for the lotto.
- [ ] Print a prompt message to enter the purchase amount.
- [ ] Parse the entered amount and calculate the number of purchasable tickets by dividing it by 1,000.
- [ ] If the input is invalid, throw an 'IllegalArgumentException' and prompt the user again.
    - [ ] If the input is empty.
    - [ ] If the amount is less than 1,000.
    - [ ] If the amount is not divisible by 1,000.
    - [ ] If the input is not a valid number.

### Print the purchased lotto tickets.
- [ ] Print a message to show the number of purchased tickets. "You have purchased $8 tickets."
- [ ] Sort the numbers in each lotto ticket in ascending order.
- [ ] Print each lotto ticket's numbers, one per line.

### Manage lotto tickets as Objects.
- [ ] Create a `Lotto` object for each purchased ticket.
- [ ] Validate that each `Lotto` object contains exactly six numbers.
- [ ] Validate that all numbers are between 1 and 45.
- [ ] Validate that all numbers are unique.
- [ ] Validate that the numbers in each ticket in ascending order.

### Receive the winning numbers for the lotto.
- [ ] Print a prompt message to enter the winning numbers. "Please enter last week's winning numbers."
- [ ] If the input is invalid, throw an 'IllegalArgumentException' and prompt the user again.
    - [ ] If the input is empty.
    - [ ] If the number of values is not 6.
    - [ ] If any value is not a number.

### Receive the bonus number for the lotto.
- [ ] Print a prompt message to enter the bonus number.
- [ ] If the input is invalid, throw an 'IllegalArgumentException' and prompt the user again.
    - [ ] If the input is empty.
    - [ ] If the input is not a number.
    - [ ] If the number is not in range 1 to 45.
    - [ ] If the number must not consist of winning numbers.

### Print the winning statistics by match count.
- [ ] Print a message for the winning statistics. "Winning Statistics"
- [ ] Print a separator line.
- [ ] Print the number of winning tickets for 3, 4, 5, 5+bonus number, and 6 matched numbers.

### Print the total return rate.
- [ ] Calculate the total return rate.
- [ ] Print the return rate message. "Total return rate is $62.5 %."