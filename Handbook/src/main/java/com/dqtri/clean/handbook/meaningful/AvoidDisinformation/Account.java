package com.dqtri.clean.handbook.meaningful.AvoidDisinformation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(exclude = "password")
@EqualsAndHashCode
public class Account {
    private String username;
    @JsonIgnore
    private String password;
}
