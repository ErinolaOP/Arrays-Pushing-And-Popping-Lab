package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // initialize the stack array
        stack = new String[size];
        // set initial top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // check if the stack is full
        if(top == stack.length-1){
            System.out.println("Stacks full ");
        }
        else{
            stack[++top] = action;
            System.out.println("Action \"" + action + "\" has been added to the stack");
        }
        // print message if the stack is full
        // increment top and add action to the stack
        // print confirmation message
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // Check if the stack is empty
        if (top == -1){
            System.out.println("Stack is empty");
            return null;
        }else {
            String action = stack[top--];
            System.out.println("Undone action: \"" +  action+"\"");
            return action;
        }
        // Print message if the stack is empty and return null
        // Retrieve and remove the top action from the stack
        // Print confirmation message, return and replace empty string with the undone action


    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // Check if the stack is empty
        if (top == -1){
            System.out.println("The stack is empty no actions to show.");
            return null;
        }else {
            String action = stack[top];
            return action;
        }
        //Print message if the stack is empty and return null
        //Return and replace empty string with the most recent action without removing it

    }

    // Method to display all actions in the stack
    public void display() {
        //Check if the stack is empty
        if(top ==-1){
            System.out.println("Stack is empty, no actions to display.");
        }else {
            System.out.println("Undo stack: ");
            for (int i = 0; i<=top;i++){
                System.out.print("\"" + stack[i]+"\"");
            }
            System.out.println();
        }

        //Print message if the stack is empty


        //Iterate through the stack and print each action

        //Print a new line after displaying all actions
    }
}