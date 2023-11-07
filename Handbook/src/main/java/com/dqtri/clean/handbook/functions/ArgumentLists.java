package com.dqtri.clean.handbook.functions;

public abstract class ArgumentLists {
    abstract void monad(Integer... args);
    abstract void dyad(String name, Integer... args);
    abstract void triad(String name, int count, Integer... args);
}
