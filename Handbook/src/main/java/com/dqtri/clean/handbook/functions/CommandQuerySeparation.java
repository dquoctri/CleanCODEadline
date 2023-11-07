package com.dqtri.clean.handbook.functions;

public abstract class CommandQuerySeparation {
    public abstract boolean set(String attribute, String value);
    //if (set("username", "unclebob"))...

    void doSomething() {
        if (set("username", "unclebob")){
            //TODO: somethings
        }
    }

    //Imagine this from the point of view of the reader. What does it mean? Is it asking whether
    //the “username” attribute was previously set to “unclebob”? Or is it asking whether the
    //“username” attribute was successfully set to “unclebob”? It’s hard to infer the meaning from
    //the call because it’s not clear whether the word “set” is a verb or an adjective.



    public abstract void setAttribute(String attribute, String value);
    public abstract boolean attributeExists(String attribute);

    void setAttributeIfExists(){
        if (attributeExists("username")) {
            setAttribute("username", "unclebob");
        }
    }
}

