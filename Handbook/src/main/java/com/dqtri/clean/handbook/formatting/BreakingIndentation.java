package com.dqtri.clean.handbook.formatting;

public class BreakingIndentation {
    // @formatter:off
    class CommentWidget extends TextWidget
    {
        public static final String REGEXP = "^#[^\r\n]*(?:(?:\r\n)|\n|\r)?";
        public CommentWidget(ParentWidget parent, String text){super(parent, text);}
        public String render() throws Exception {return ""; }
    }
    // @formatter:on

    class CommentWidget2 extends TextWidget {
        public static final String REGEXP = "^#[^\r\n]*(?:(?:\r\n)|\n|\r)?";
        public CommentWidget2(ParentWidget parent, String text) {
            super(parent, text);
        }
        public String render() throws Exception {
            return "";
        }
    }

    class ParentWidget {

    }
    class TextWidget{
        TextWidget(ParentWidget parent, String text){

        }
    }
}
