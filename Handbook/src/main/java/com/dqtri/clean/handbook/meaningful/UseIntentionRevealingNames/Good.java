package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames;

import java.util.Date;
import java.util.List;

public class Good {
    int i; //this for for loop

    int numberOfUsers; // Describes the variable's purpose

    int calculateTotalPrice(List<Item> shoppingCart) { /*...*/ return 0;}

    String customerName; // Consistent use of CamelCase

    class Customer {
        String name; //in this context
    }

    String name; // Avoid prefixing with data types

    void processPayment(double amount) { /*...*/ }

    // The Good - self-explanatory variable name
    Date currentDate = new Date();

    int d; // elapsed time in days

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    class Item{}
}
