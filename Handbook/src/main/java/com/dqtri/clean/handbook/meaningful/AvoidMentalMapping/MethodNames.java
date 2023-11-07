package com.dqtri.clean.handbook.meaningful.AvoidMentalMapping;

//Class Names
//Classes and objects should have noun or noun phrase names like Customer, WikiPage,
//Account, and AddressParser. Avoid words like Manager, Processor, Data, or Info in the name
//of a class. A class name should not be a verb.

public class MethodNames {
    //Methods should have verb or verb phrase names like postPayment, deletePage, or save.
    //Accessors, mutators, and predicates should be named for their value and prefixed with get,
    //set, and is according to the javabean standard.4
    //string name = employee.getName();
    //customer.setName("mike");
    //if (paycheck.isPosted())...
    //When constructors are overloaded, use static factory methods with names that
    //describe the arguments. For example,
    //Complex fulcrumPoint = Complex.FromRealNumber(23.0);
    //is generally better than
    //Complex fulcrumPoint = new Complex(23.0);
    //Consider enforcing their use by making the corresponding constructors private

//Will
//they know what the function named
//HolyHandGrenade is supposed to do? Sure,
//it’s cute, but maybe in this case
//DeleteItems might be a better name.
//Choose clarity over entertainment value.
//Cuteness in code often appears in the form of colloquialisms or slang. For example,
//don’t use the name whack() to mean kill(). Don’t tell little culture-dependent jokes like
//eatMyShorts() to mean abort().
//Say what you mean. Mean what you say.

}


