package com.dqtri.clean.handbook.meaningful.AvoidEncodings;

import lombok.Getter;
import lombok.Setter;

public class MemberPrefixes {
    class Part1 {
        private String m_dsc; // The textual description
        void setName(String name) {
            m_dsc = name;
        }
    }

    class Part2 {
        String description;
        void setDescription(String description) {
            this.description = description;
        }
    }

    @Setter
    @Getter
    class Part3 {
        String description;
    }
}
