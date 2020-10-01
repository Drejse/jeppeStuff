class Cup {
  Dice diceOne;
  Dice diceTwo;

  Cup(Dice diceOne, Dice diceTwo) {

    this.diceOne = diceOne;
    this.diceTwo = diceTwo;
  }

  int Roll() {
    int sum = 0;
    while (sum < 6000) {
      sum += diceOne.Roll() + diceTwo.Roll();
      println(sum);
    }
    return sum;
  }
}
