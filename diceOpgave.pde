// opgave1
import java.util.Random;
public Random rnd;

Dice diceOne;
Dice diceTwo;
Cup cup;

void setup() {  
  rnd = new Random();
  diceOne = new Dice(6);
  diceTwo = new Dice(6);
  cup = new Cup(diceOne, diceTwo);



  cup.Roll();
  //diceRoll();
  //keepRolling();
  //println(dice.Roll());
  //dice.keepRolling();
}

int diceRoll() {

  int diceOne = rnd.nextInt(6)+1;
  int diceTwo = rnd.nextInt(6)+1;
  int sum = diceOne + diceTwo;
  return sum;
}


void keepRolling() {
  int sum = 0;
  while (sum < 100) {
    sum += diceRoll();
    println(sum);
  }
}
