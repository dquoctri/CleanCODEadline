package com.dqtri.clean.handbook.meaningful.AvoidDisinformation;

import java.util.List;

public class Information {
    public void getDisinformation(){
        List<Object> hp = null;
        Object aix;
        int sco;
        //they are the names of Unix platforms or variants
        //Do not refer to a grouping of accounts as an accountList
        List<Account> accountList;
    }

    public void getInformation(){
        //If the container holding the
        //accounts is not actually a List, it may lead to false conclusions.1 So accountGroup or
        //bunchOfAccounts or just plain accounts would be better.
        List<Account> accountGroup;
        List<Account> bunchOfAccounts;
        List<Account> accounts; //my best choice
    }


    //Beware of using names which vary in small ways. How long does it take to spot the
    //subtle difference between
    public void XYZControllerForEfficientHandlingOfStrings(){

    }
    //in one module
    //and, somewhere a little more distant,
    public void XYZControllerForEfficientStorageOfStrings(){

    }

    //Spelling similar concepts similarly is information. Using inconsistent spellings is disinformation
    public void todoSomething(int l, int O, int O1){
        int a = l;
        if ( O == l )
            a = O1;
        else
            l = 01;
    }
}
