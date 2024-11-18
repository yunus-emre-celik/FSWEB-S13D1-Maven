package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock>=20 || clock<8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19);

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
    int lowestTemp = 25;
    int highestTemp = isSummer ? 45 : 35;
    return temp<=highestTemp && temp> lowestTemp;

    }

    public static double area(double width, double height) {
        if(width<0 || height<0){ return -1;}
        return width*height;

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }else{
        return Math.PI * Math.pow(radius, 2);}
    }}

