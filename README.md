# COM1003 Java Programming - Assignment 3

This project is a simplified adaptation of the board game **Cluedo**, where the user guesses the solution to a scenario involving a murder in a specific room, by a particular suspect, using a specific weapon. The game progressively narrows down the options based on user guesses.

## Learning Outcomes
This project is designed to:

- Develop understanding of interacting classes in Java.
- Enhance ability to write programs from a given specification.
- Cultivate skills for clear, high-quality coding practices.
- Manipulate arrays and use methods in Java effectively.

## Project Structure

The project consists of the following key files:

1. **Assignment3.java**: The main entry point for the program.
2. **Weapon.java**: Handles weapon-related functionalities.
3. **Suspect.java**: Manages suspect-related functionalities.
4. **Room.java**: Defines room-related data and methods.
5. **Scenario.java**: Core logic for setting and validating the game scenario.

Additionally, two data files are provided:

- `weapons.txt`: List of weapons, one per line.
- `suspects.txt`: List of suspects, one per line.

## Key Tasks

### Task 1: Read Weapons and Suspects
- Modify `Weapon.java` and `Suspect.java` to read data from the provided text files and initialize the respective arrays.
- Print the initialized weapons and suspects using existing methods.

### Task 2: List Rooms
- Update the `Room.java` enum to list available rooms dynamically using the `values()` method.

### Task 3: Random Scenario Generation
- Implement methods in `Weapon.java`, `Suspect.java`, and `Room.java` to randomly select a weapon, suspect, and room for the game scenario.

### Task 4: User Input
- Update the `Scenario.java` class to allow the user to guess the solution using prompts for room, suspect, and weapon.
- Implement case-insensitive handling for user inputs.

### Task 5: Validate Guesses
- Complete the `hasBeenDiscovered()` method in `Scenario.java` to compare user guesses against the actual scenario and provide detailed feedback.

## Example Output

```text
The weapons are the candlestick, the dagger, the lead pipe, the revolver, the rope, and the wrench.
The suspects are Miss Scarlett, Reverend Green, Colonel Mustard, Professor Plum, Mrs Peacock, and Mrs White.
The rooms are the kitchen, the ballroom, the conservatory, the billiard room, the library, the study, the hall, the lounge, and the dining room.

Where are you? hall
Who do you accuse? Reverend Green
With what weapon? rope
The victim was not attacked in the hall by Reverend Green with the rope.
```

## Requirements

- **Java Development Kit (JDK)**: Ensure JDK is installed on your system.
- Place all `.java` files and data files (`weapons.txt` and `suspects.txt`) in the same directory.

## Compilation and Execution

To compile and run the program:

```bash
javac *.java
java Assignment3
```
