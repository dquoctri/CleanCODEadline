package com.dqtri.clean.handbook.formatting;

import org.apache.logging.log4j.util.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerticalOpennessBetweenConcepts {
    class BoldWidget extends ParentWidget {
        public static final String REGEXP = "'''.+?'''";
        private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
                Pattern.MULTILINE + Pattern.DOTALL
        );
        public BoldWidget(ParentWidget parent, String text) throws Exception {
            super(parent);
            Matcher match = pattern.matcher(text);
            match.find();
            addChildWidgets(match.group(1));
        }
        public String render() throws Exception {
            StringBuffer html = new StringBuffer("<b>");
            html.append(childHtml()).append("</b>");
            return html.toString();
        }
    }

    class BoldWidget2 extends ParentWidget {
        public static final String REGEXP = "'''.+?'''";
        private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
                Pattern.MULTILINE + Pattern.DOTALL);
        public BoldWidget2(ParentWidget parent, String text) throws Exception {
            super(parent);
            Matcher match = pattern.matcher(text);
            match.find();
            addChildWidgets(match.group(1));}
        public String render() throws Exception {
            StringBuffer html = new StringBuffer("<b>");
            html.append(childHtml()).append("</b>");
            return html.toString();
        }
    }

    class ParentWidget {
        ParentWidget(ParentWidget widget){
            //TODO: something
        }
        void addChildWidgets(String child){
            //TODO: something
        }

        String childHtml() {
            return Strings.EMPTY;
        }
    }
}
