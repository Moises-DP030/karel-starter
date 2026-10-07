import stanford.karel.*;

/*
 * MyKarel.java
 *
 * This is your robot. You are going to edit this file in class.
 *
 * Karel understands exactly four commands. That is not a simplification
 * to go easy on you; it is genuinely all there is:
 *
 *     move();          walk forward one square
 *     turnLeft();      rotate 90 degrees to the left
 *     pickBeeper();    pick up a beeper from the square you are standing on
 *     putBeeper();     put a beeper down on the square you are standing on
 *
 * The empty parentheses are required. move without them is not a command,
 * it is a typo, and the compiler will tell you so at length.
 *
 * There is no turnRight(). You will find that annoying for about ten seconds
 * and then you will work out what to do about it.
 */

public class MyKarel extends Karel {

    public void run() {

        // Right now Karel takes two steps and stops. Run it and watch.
        move();
        move();
        move();





        // YOUR TASK: get Karel to the beeper and pick it up.
        //
        // The beeper is two squares east and one square north of where Karel starts.
        //
        // Three more lines will do it. Add them below.
        turnLeft();
        move();
        pickBeeper();
        turnRight();


        //MyOwnMap solution

         public void run() {
        label32:
        while(true) {
            if (!this.beepersPresent()) {
                if (this.rightIsClear()) {
                    this.turnRight();
                    this.move();
                } else if (this.frontIsClear()) {
                    this.move();
                } else if (this.leftIsClear()) {
                    this.turnLeft();
                } else {
                    this.turnAround();
                }

                if (!this.beepersPresent()) {
                    continue;
                }

                int i = 1;

                do {
                    if (i > 10) {
                        continue label32;
                    }

                    ++i;
                    this.pickBeeper();
                } while(!this.noBeepersPresent());

                this.turnRight();
                return;
            }

            return;
        }
    }

    }
    public void turnRight(){

        turnLeft();
        turnLeft();
        turnLeft();

    }
    public void turnAround() {
        this.turnLeft();
        this.turnLeft();
    }
}
