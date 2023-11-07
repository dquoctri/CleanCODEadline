package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames; //Noncompliant

import java.util.Date;
import java.util.List;

public class Bad {
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

    PhoneNumber phoneString; //Update datatype but not update name

    class PhoneNumber{}

    class Item{}

}