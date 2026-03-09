package JAVA;
// you are given two lists of students IDs:
// clubA
// clubB
// your task is to determine which students are members of both clubs
// Requirements:
// A student ID should appear only once in the final output even if it has duplicates in the input
// The output must be sorted in ascending order
// If no common students exist,print no common student

// Input Format:
// First line: Integer n (no.of students in club A)
// Next line: n space-separated integers(IDs of club A)
// Next line: Integer m (no.of students in club B)
// Next line: m space-separated integers(IDs of club B)

// Output Format:
// print all common student IDs in ascending order or Print no common student if no intesection exists

import java.util.*;

public class Hmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        TreeSet<Integer> clubA = new TreeSet<>();
        for(int i=0;i<n;i++){
            clubA.add(input.nextInt());
        }
        
        int m = input.nextInt();
        TreeSet<Integer> clubB = new TreeSet<>();
        for(int i=0;i<m;i++){
            clubB.add(input.nextInt());
        }

        clubA.retainAll(clubB);
        if(clubA.isEmpty()){
            System.out.println("NO COMMON STUDENT");
        }else{
            System.out.println(clubA);
        }

        input.close();



    }
    
}

// this is the test push so that i can 
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change
// after change