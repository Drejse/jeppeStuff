class Dice {

  int sides;


  Dice(int sides) {

    this.sides = sides;
  }

  int Roll() {
    return rnd.nextInt(sides-1)+1;
  }
}
