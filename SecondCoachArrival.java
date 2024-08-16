/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author My PC
 */
public class SecondCoachArrival {
    public static void main(String[] args) {
        int totalDistance = 10000;
        double speed = 225.5; // in m/s
        int startTime = 9 * 60; // 09:00 hours in minutes
        int travelTime = (int) (totalDistance / (speed * 60)); // convert speed to km/h
        int arrivalTime = startTime + travelTime;
        System.out.println("Arrival time: " + arrivalTime / 60 + ":" + arrivalTime % 60);
    }
    }