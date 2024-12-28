import sheffield.*;

public class Suspect {

   private final static int MAX_NUMBER=10;

   private static Suspect [] allTheSuspects;
   private static int numberOfSuspects;


   public static void initializeEveryone() {
     //Fill in this method body with your code for Task 1
     // Defining EasyReader object
     EasyReader file = new EasyReader("suspects.txt");

     //Creating a Temporary LIbrary
     Suspect [] tempSuspect = new Suspect[MAX_NUMBER];

     // Reading values from text file
     int count = 0;
     while (!file.eof()) {
       String suspect = file.readString();
       tempSuspect[count] = new Suspect (suspect);
       count++;
     }

     int MIN_NUMBER = 3;
     //Defining Value of numberOfSuspects
     numberOfSuspects = count;

     //Specifying Limit of Suspects
     if ((numberOfSuspects >= MIN_NUMBER) && (numberOfSuspects <= MAX_NUMBER)) {
       allTheSuspects = new Suspect[numberOfSuspects];
       System.arraycopy(tempSuspect,0,allTheSuspects,0,numberOfSuspects);
     }
     else{
       System.out.println("Out of Bound");
     }
     listTheSuspects();
   }

   public static Suspect askWho(EasyReader keyboard)  {
     //Replace in this method body with your code for Task 4
     String inputSuspect = keyboard.readString("Who do you accuse? ");

     //return matched vales
     for (int i = 0; i<numberOfSuspects; i++) {
       if (allTheSuspects[i].toString().equalsIgnoreCase(inputSuspect)) {
         return allTheSuspects[i];
       }
     }
     return null;
   }

   public static void listTheSuspects()  {
     System.out.print("The suspects are "+allTheSuspects[0]);
     for (int i = 1; i<numberOfSuspects-1; i++)
        System.out.print(", "+allTheSuspects[i]);
     System.out.println(" and "+allTheSuspects[numberOfSuspects-1]);
   }

   public static Suspect pickedAtRandom() {
     //Replace in this method body with your code for Task 3
     int index = (int)(Math.random() * numberOfSuspects);
     return allTheSuspects[index];
   }

   private String name;

   private Suspect (String n)  {  name = n;  }

   public String toString()  {  return name;  }

}
