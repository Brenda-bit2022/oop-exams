/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author My PC
 */
public class LectureRoom {
    private int studentCount;
    private boolean[] lights;

    
    public LectureRoom() {
        studentCount = 0;
        lights = new boolean[3]; 
    }

    
    public void addStudents(int number) {
        studentCount += number;
        System.out.println(number + " students added. Total students: " + studentCount);
    }

    
    public void removeStudents(int number) {
        if (number > studentCount) {
            studentCount = 0;
        } else {
            studentCount -= number;
        }
        System.out.println(number + " students removed. Total students: " + studentCount);
    }

    
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number.");
        }
    }

   
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number.");
        }
    }

    
    public void displayStatus() {
        System.out.println("Current number of students: " + studentCount);
        System.out.print("Lights status: ");
        for (int i = 0; i < lights.length; i++) {
            System.out.print("Light " + (i + 1) + ": " + (lights[i] ? "On" : "Off") + " ");
        }
        System.out.println();
    }
}

