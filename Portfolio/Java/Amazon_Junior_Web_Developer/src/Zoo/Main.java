package Zoo;

import java.util.Scanner;

public class Main { // begin ZooMain

    public static void main(String[] args) { // begin main method

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1 ;
        int continueInnerLoop = 1;


        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:

                    Tiger tiger = new Tiger();

                    do { // do-while loop

                        System.out.println("The animal which is chosen is: " + tiger.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);

                        switch (menuChoice) { // begin switch

                            case 1: // set properties tiger properties
                                System.out.println("Enter tiger weight: ");
                                tiger.setWeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter tiger height: ");
                                tiger.setHeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character


                                System.out.println("Enter tiger age: ");
                                tiger.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter tiger speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter the tiger's number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter tiger roar level: ");
                                tiger.setSoundLevel(keyboard.nextInt());
                                break; // break case 1

                            case 2: // display tiger properties
                                System.out.println("Weight: " + tiger.getWeight());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Roar level: " + tiger.getSoundLevel());
                                break; // break case 2

                            case 3: // movement
                                tiger.walking();
                                break; // break case 3

                            case 4: // eating
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break; // break case 4

                            default: // default if 1-4 isn't selected
                                System.out.println("Not supported.");

                        } // end inner switch

                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();

                    } while(continueInnerLoop == 1); // while loop

                    break;

                case 2:

                    Dolphin dolphin = new Dolphin(); // create a new instance of dolphin
                    do {



                        System.out.println("The animal which is chosen is : " + dolphin.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);

                        // get menu choice
                        switch (menuChoice) {

                            case 1: // set properties
                                System.out.println("Enter dolphin weight: ");
                                dolphin.setWeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter dolphin height: ");
                                dolphin.setHeight(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter dolphin age: ");
                                dolphin.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character

                                System.out.println("Enter dolphin color: ");
                                dolphin.setColor(keyboard.nextLine());


                                System.out.println("Enter dolphin swim speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // consume buffered new line character
                                break;

                            case 2: // display properties
                                System.out.println("Weight: " + dolphin.getWeight());
                                System.out.println("Height: " + dolphin.getHeight());
                                System.out.println("Age: " + dolphin.getAge());
                                System.out.println("Color: " + dolphin.getColor());
                                System.out.println("Dolphin swim speed: " + dolphin.getSwimmingSpeed());
                                break;

                            case 3: // movement
                                dolphin.swimming();
                                break;

                            case 4: // eating
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;

                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;

                case 3:

                    Penguin penguin = new Penguin();
                    do {


                        System.out.println("The animal which has been chose is: " + penguin.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, penguin);

                        switch (menuChoice) {

                            case 1: // set properties

                                System.out.println("Enter penguin weight: ");
                                penguin.setWeight(keyboard.nextInt());
                                keyboard.nextLine();

                                System.out.println("Enter penguin height: ");
                                penguin.setHeight(keyboard.nextInt());
                                keyboard.nextLine();

                                System.out.println("Enter penguin age: ");
                                penguin.setAge(keyboard.nextInt());
                                keyboard.nextLine();

                                System.out.println("Is the penguin swimming? (true/false): ");
                                penguin.setSwimming(keyboard.nextBoolean());
                                keyboard.nextLine();

                                if (penguin.isSwimming()) {
                                    System.out.println("Enter penguin swimming speed: ");
                                    penguin.setSwimSpeed(keyboard.nextInt());
                                    keyboard.nextLine();
                                } else {
                                    System.out.println("Enter penguin walking speed: ");
                                    penguin.setWalkSpeed(keyboard.nextInt());
                                    keyboard.nextLine();
                                }
                                break;

                            case 2: // display properties.

                                System.out.println("Weight: " + penguin.getWeight());
                                System.out.println("Height: " + penguin.getHeight());
                                System.out.println("Age: " + penguin.getAge());

                                if (penguin.isSwimming()) {
                                    System.out.println("Penguin swim speed: " + penguin.getSwimSpeed());
                                } else {
                                    System.out.println("Penguin walk speed: " + penguin.getWalkSpeed());
                                }
                                break;

                            case 3:
                                if (penguin.isSwimming()) {
                                    penguin.swimming();
                                } else {
                                    penguin.walking();
                                }
                                break;

                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;

                            default:
                                System.out.println("Not supported");


                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;


                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
    } // end main method



    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
} // end class
