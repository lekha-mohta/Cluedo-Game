import sheffield.*;

public class Weapon {

   private final static int MAX_NUMBER=6;
   private static Weapon [] allTheWeapons;

   public static void initializeThem() {
     //Fill in this method body with your code for Task 1
     // Defining EasyReader object
     EasyReader file = new EasyReader("weapons.txt");
     // Creating a Temporary Library
     Weapon [] tempWeapon = new Weapon[MAX_NUMBER];

     // Reading values from text file
     int count = 0;
     while (!file.eof()) {
       String weapon = file.readString();
       tempWeapon[count] = new Weapon (weapon);
       count++;
     }

     //Storing values in allTheWeapons
     allTheWeapons = new Weapon[count];
     System.arraycopy(tempWeapon,0,allTheWeapons,0,count);
     listTheWeapons();
   }

   public static Weapon askWhichOne(EasyReader keyboard)  {
     //Replace in this method body with your code for Task 4
     String inputWeapon = keyboard.readString("With what weapon? ");

     //Check whether the string starts with the or not
     if (inputWeapon.substring(0,4) != "the "){
       inputWeapon = "the " + inputWeapon.replace("_"," ");
     }
     else{
       inputWeapon = inputWeapon.replace("_"," ");
     }

     //return the matched value
     for (int i = 0; i<MAX_NUMBER; i++) {
       if (allTheWeapons[i].toString().equalsIgnoreCase(inputWeapon)) {
         return allTheWeapons[i];
       }
     }
     return null;
   }

   public static void listTheWeapons()  {
     System.out.print("The weapons are "+allTheWeapons[0]);
     for (int i = 1; i<MAX_NUMBER-1; i++)
        System.out.print(", "+allTheWeapons[i]);
     System.out.println(" and "+allTheWeapons[MAX_NUMBER-1]);
   }

   public static Weapon pickedAtRandom() {
     //Replace in this method body with your code for Task 3
     int index = (int)(Math.random() * MAX_NUMBER);
     return allTheWeapons[index];
   }

   private String weapon;

   private Weapon (String n)  {  weapon = n;  }

   public String toString()  {  return "the "+weapon.toLowerCase();  }
   
}
