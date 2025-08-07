package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exercise 1: append() - Appending Content
        System.out.println("--- EXERCISE 1 ---");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);

        // Additional Instructions
        StringBuilder additionalString = new StringBuilder();
        additionalString.append("Welcome to ").append("2025").append(".");
        System.out.println("Additional String: " + additionalString);
        System.out.println();


        // Exercise 2: insert() - Inserting Content at a Position
        System.out.println("--- EXERCISE 2 ---");
        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        System.out.println(sb2);
        System.out.println();


        // Exercise 3: delete() - Deleting Content
        System.out.println("--- EXERCISE 3 ---");
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        sb3.delete(8, 16);
        System.out.println("After delete(8, 16): " + sb3);

        sb3.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb3);
        System.out.println();


        // Exercise 4: replace() - Replacing a Section
        System.out.println("--- EXERCISE 4 ---");
        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        sb4.replace(24, 30, "Java");
        System.out.println(sb4);
        System.out.println();


        // Exercise 5: Method Chaining
        System.out.println("--- EXERCISE 5 ---");
        StringBuilder sb5 = new StringBuilder("Start");
        sb5.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(sb5);
        System.out.println();


        // Exercise 6: substring(), indexOf(), and Non-Existing Words
        System.out.println("--- EXERCISE 6 ---");
        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog.");

        String sub = sb6.substring(16, 19);
        System.out.println("Substring: " + sub);

        int indexOfFox = sb6.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        int indexOfCat = sb6.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
        System.out.println();


        // Exercise 7: toString() - Converting back to a String
        System.out.println("--- EXERCISE 7 ---");
        StringBuilder sb7 = new StringBuilder("Status: ");
        sb7.append("Pending");

        String finalStatus = sb7.toString();

        sb7.append(" - Approved");

        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);

    }
}