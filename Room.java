import sheffield.*;

public enum Room {

   KITCHEN,
   BALLROOM,
   CONSERVATORY,
   BILLIARD_ROOM,
   LIBRARY,
   STUDY,
   HALL,
   LOUNGE,
   DINING_ROOM;

   static int roomCount = Room.values().length;

   static Room askWhichOne(EasyReader keyboard)  {
     //Replace in this method body with your code for Task 4
     String roomAttack = keyboard.readString("Where are you? ");

     //Checking whether the string starts with the
     if (roomAttack.substring(0,4) == "the "){
       roomAttack = roomAttack.replace("_"," ");
     }
     else{
       roomAttack = "the " + roomAttack.replace("_"," ");
     }

     //Checking for matching values
     Room[] Rooms = Room.values();
     boolean found = false;
     for (Room rooms : Rooms) {
       if (rooms.toString().equalsIgnoreCase(roomAttack)) {
         found = true;
         return rooms;
       }
     }
     return null;
   }

   static Room pickedAtRandom() {
     //Replace in this method body with your code for Task 3
     int index = (int)(Math.random() * roomCount);
     return Room.values()[index];
   }

   public static void listThem() {
     //Replace this for Task 2
     System.out.print("The rooms are ");
     int i = 0;
     for (Room rooms : Room.values()) {
       if (i<roomCount-1) {
         System.out.print (rooms + ", ");
         i++;
       }
       else {
         System.out.println (rooms);
       }
     }
   }

   public String toString() {
     return "the "+name().toLowerCase().replace("_"," ");
   }

}
