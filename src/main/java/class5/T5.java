package class5;

import java.util.Scanner;

public class T5 {
    // Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine
    // the grade based on the following rules:
    // * if the average score>=90 --> grade=A
    // * if the average score>=70 and <90 --> grade=B
    // * if the average score>=50 and <70 --> grade=C
    // * if the average score<50 -->grade=F


    // Moja koncepcja haha:
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Please Enter score from 0 to 100");
    // int averageScore=sc.nextInt();

    // if(averageScore >=90) {
    //    System.out.println("Grade = A");
    // }else if(averageScore >=70 && averageScore<90){
    //    System.out.println("Grade = B");
    // }else if(averageScore>=50 && averageScore<70){
    //    System.out.println("Grade = C");
    // }else if(averageScore<50){
    //    System.out.println("Grade = F");
    //    }
    //    }
    //    }
    // Prawidlowe roziazanie:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quizMarks, midMarks, finalMarks, avgMarks;
        char grade;
        System.out.println("Please enter the mark for quiz 0-100");
        quizMarks = sc.nextDouble();
        System.out.println("Please enter the mark for midterm 0-100");
        midMarks = sc.nextDouble();
        System.out.println("Please enter the mark for final 0-100");
        finalMarks=sc.nextDouble();
        avgMarks=(quizMarks+midMarks+finalMarks)/3;

        if(avgMarks>=90) {
            grade = 'A';
        }else if(avgMarks>=70) {
            grade = 'B';
        }else if(avgMarks>=50) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println(grade);
        }
    }


