package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Row> gameBoard = new ArrayList<>();

    public List<Row> getFlaggedRows() {
        List<Row> flaggedCells = new ArrayList<>();
        for (Row row : gameBoard)
            if (row.isFlagged())
                flaggedCells.add(row);
        return flaggedCells;
    }
}
