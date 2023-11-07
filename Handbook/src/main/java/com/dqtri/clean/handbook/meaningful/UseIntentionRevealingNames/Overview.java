package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames;

import java.util.Date;
import java.util.List;

public class Overview {

    //Bad

    int x; // What does 'x' represent in this context?

    int usrCntr; // Instead of 'userCounter'

    String tmp; // What does 'tmp' stand for?

    int totalPrice(List<Item> shoppingCart) { return 0; } //function should be a verb

    class Customer {
        String customerName;
    } //duplicate customer prefix

    int calculate_total_price() { return 0; } // Inconsistent use of underscores

    String strName; // Avoid prefixing with data types

    // The Ugly - what is d???
    Date d = new Date();


    //Good

    int i; //this for for loop

    int numberOfUsers; // Describes the variable's purpose

    int calculateTotalPrice(List<Item> shoppingCart) { /*...*/ return 0;}

    String customerName; // Consistent use of CamelCase

    class Customer2 {
        String name; //in this context
    }

    String name; // Avoid prefixing with data types

    void processPayment(double amount) { /*...*/ }

    // The Good - self-explanatory variable name
    Date currentDate = new Date();
    Date today = new Date();
    Date now = new Date();

    int e; // elapsed time in days

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    class Item{}
}
