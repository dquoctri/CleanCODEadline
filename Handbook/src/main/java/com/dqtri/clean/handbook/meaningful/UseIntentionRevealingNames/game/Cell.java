package com.dqtri.clean.handbook.meaningful.UseIntentionRevealingNames.game;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Cell {
    public static final int FLAGGED = 4;

    private int value;

    public boolean isFlagged() {
        return value == FLAGGED;
    }

}
