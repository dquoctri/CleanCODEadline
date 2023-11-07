package com.dqtri.clean.handbook.meaningful.MakeMeaningfulDistinctions;

public abstract class NumberSeries {
    // Consider, for example, the truly hideous practice of creating a variable named klass just
    // because the name class was used for something else

    //Number-series naming (a1, a2, .. aN) is the opposite of intentional naming. Such
    //names are not disinformative—they are noninformative; they provide no clue to the
    //author’s intention.
    public static void copyChars(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    //If you have another called ProductInfo or ProductData, you have made the names different without
    // making them mean anything different. Info and Data are indistinct noise
    //words like a, an, and the.
    public void todoSomeThing(){
        //ProductInfo
        //ProductData
        //Info and Data are indistinct noise words like a, an, and the.
        //The problem comes in when you decide to call a variable theZork because you already have another variable named zork.
        //How is NameString better than
        //Name? Would a Name ever be a floating point number?
        //CustomerObject
    }

    public abstract void getActiveAccount();
    public abstract void getActiveAccounts();
    public abstract void getActiveAccountInfo();
}
