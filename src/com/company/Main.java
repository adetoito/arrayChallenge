package com.company;

public class Main {

    public static void main(String[] args) {

        int grades[] = {90, 95, 100};
        int sum = 0;

        for (int counter = 0; counter < grades.length; counter++) {
            sum += grades[counter];
        }

        double average = sum / (grades.length);
        System.out.println(average);

    }
}
