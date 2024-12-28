import sheffield.*;

public class Scenario {

   private Suspect attacker;
   private Room attackedIn;
   private Weapon attackedWith;

   public void setAtRandom() {
      attackedWith = Weapon.pickedAtRandom();
      attacker = Suspect.pickedAtRandom();
      attackedIn = Room.pickedAtRandom();
   }

   public void setByAsking(EasyReader keyboard) {
      attackedIn = Room.askWhichOne(keyboard);
      attacker = Suspect.askWho(keyboard);
      attackedWith = Weapon.askWhichOne(keyboard);
   }

   public void askAboutWrongOnes(Scenario rightOne, EasyReader keyboard) {
     if  (  attackedIn != rightOne.attackedIn )
          attackedIn = Room.askWhichOne(keyboard);
     if  (  attacker != rightOne.attacker  )
          attacker = Suspect.askWho(keyboard);
     if  (  attackedWith != rightOne.attackedWith  )
          attackedWith = Weapon.askWhichOne(keyboard);
   }

   public boolean hasBeenDiscovered(Scenario guess) {
     //Replace this method body by your code for Task 5
     // if (attackedIn != guess.attackedIn && attacker != guess.attacker && attackedWith != guess.attackedWith) {
     //   String ans = "The victim was not attacked in " + attackedIn + " by " + attacker + " with "+ attackedWith;
     //   return false;
     //
     // }
     // else if (attackedIn != guess.attackedIn & attacker != guess.attacker & attackedWith == guess.attackedWith){
     //   String ans = "The victim was not attacked in " + attackedIn + " by " + attacker;
     //   return false;
     // }
     // else if (attackedIn != guess.attackedIn & attacker = guess.attacker & attackedWith == guess.attackedWith){
     //    String ans = "The victim was not attacked in " + attackedIn;
     //    return false;
     // }
     return true;
  }

  public boolean isUnknown() {
      return attacker == null || attackedIn == null || attackedWith == null;
  }

  public String toString() {
    return  "The victim was attacked in " + attackedIn + " by " +
                attacker + " with "+ attackedWith;
  }

}
