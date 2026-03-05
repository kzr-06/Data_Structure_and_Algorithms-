package JAVA;
// You are given a set of operations to maintain a student marks database.
// Each student has: name → String, marks → Integer
// Use a HashMap<String, Integer> to store the data.

// ---
// 📌 Operations

// 1. ADD name marks
// Add a new student with marks.
// If the student already exists, ignore.


// 2. UPDATE name marks
// Update marks of an existing student.
// If the student does not exist, ignore.

// 3. GET name
// Fetch the marks of a student.
// If the student does not exist, return -1.

// ---
// 📌 Task

// Implement the function:
// List<Integer> studentMarksOperations(List<List<String>> operations)
// This function should return a list of integers containing results of all GET operations in the same order.

// ---
// 📥 Sample Input

// 5
// ADD Alice 85
// ADD Bob 90
// GET Alice
// UPDATE Alice 95
// GET Alice
// GET Charlie

// (Note: Number of operations = 5)
// 📤 Sample Output

// [85, 95, -1]

// 🧠 Explanation

// Operation	Result	HashMap

// ADD Alice 85	—	{Alice=85}
// ADD Bob 90	—	{Alice=85, Bob=90}
// GET Alice	85	output → 85
// UPDATE Alice 95	—	{Alice=95, Bob=90}
// GET Alice	95	output → 85, 95
// GET Charlie	-1	output → 85, 95, -1

import java.util.*;

public class Hmap_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        HashMap <String,Integer> map = new HashMap<>();
        int n = Integer.parseInt(input.nextLine());

        
        for(int i=0;i<n;i++){
            String[] a = input.nextLine().split(" ");

            String op = a[0];      // ADD / UPDATE / GET
            String name = a[1];

            if(op.equals("ADD")){
                map.put(name,Integer.parseInt(a[2]));
            }else if(op.equals("UPDATE")){
                if(map.containsKey(name)){
                    map.put(name,Integer.parseInt(a[2]));
                }
            }else{
                if(map.containsKey(name)) {
                    list.add(map.get(name));
                } else {
                    list.add(-1);
                }
            }
        }
        System.out.println(list);

        input.close();
    }
}
