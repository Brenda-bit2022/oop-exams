/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author My PC
 */
    import java.util.Scanner; 

public class LectureRoomVu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LectureRoom room = new LectureRoom();
        char choice;

        do {
            System.out.println("\nLecture Room Control Menu:");
            System.out.println("W: Add students");
            System.out.println("X: Remove students");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case 'W':
                case 'w':
                    System.out.print("Enter number of students to add: ");
                    int studentsToAdd = input.nextInt();
                    room.addStudents(studentsToAdd);
                    break;

                case 'X':
                case 'x':
                    System.out.print("Enter number of students to remove: ");
                    int studentsToRemove = input.nextInt();
                    room.removeStudents(studentsToRemove);
                    break;

                case 'Y':
                case 'y':
                    System.out.print("Enter light number to turn on (1-3): ");
                    int lightToTurnOn = input.nextInt();
                    room.turnOnLight(lightToTurnOn);
                    break;

                case 'Z':
                case 'z':
                    System.out.print("Enter light number to turn off (1-3): ");
                    int lightToTurnOff = input.nextInt();
                    room.turnOffLight(lightToTurnOff);
                    break;

                case 'Q':
                case 'q':
                    System.out.println("Quitting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            room.displayStatus();

        } while (choice != 'Q' && choice != 'q');

        input.close();
    }
}

