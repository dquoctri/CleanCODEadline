package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames.game;

import java.util.ArrayList;
import java.util.List;

public class Who {
    int[][] theList = new int[9][9];

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    //1. What kinds of things are in theList?
    //2. What is the significance of the zeroth subscript of an item in theList?
    //3. What is the significance of the value 4?
    //4. How would I use the list being returned?

    int[][] gameBoard = new int[9][9];
    static final int STATUS_VALUE = 0;
    static final int FLAGGED = 4;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
