package com.dqtri.clean.handbook.meaningful.UsePronounceableNames;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    //private final String recordId = "102";
    private static final String RECORD_ID = "102";
    /* ... */
}
