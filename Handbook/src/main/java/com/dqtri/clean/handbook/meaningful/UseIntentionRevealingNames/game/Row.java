package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames.game;

import java.util.ArrayList;
import java.util.List;

public class Row {
    public static final int STATUS_VALUE = 0;

    public List<Cell> cells = new ArrayList<>();

    public boolean isFlagged() {
        return cells.size() > STATUS_VALUE && cells.get(STATUS_VALUE).isFlagged();
    }

}
