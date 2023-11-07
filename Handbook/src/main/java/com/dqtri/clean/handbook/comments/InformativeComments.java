package com.dqtri.clean.handbook.comments;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public abstract class InformativeComments {

    // Returns an instance of the Responder being tested.
    protected abstract Responder responderInstance();


    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile(
            "\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

    //Explanation of Intent
    public int compareTo(Object o)
    {
        if(o instanceof WikiPagePath)
        {
            WikiPagePath p = (WikiPagePath) o;
            String compressedName = StringUtil.join(names, "");
            String compressedArgumentName = StringUtil.join(p.names, "");
            return compressedName.compareTo(compressedArgumentName);
        }
        return 1; // we are greater because we are the right type.
    }

    public void testConcurrentAddWidgets() throws Exception {
        WidgetBuilder widgetBuilder =
                new WidgetBuilder(new Class[]{BoldWidget.class});

        String text = "'''bold text'''";
        ParentWidget parent =
                new BoldWidget(new MockWidgetRoot(), "'''bold text'''");
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);
        //This is our best attempt to get a race condition
        //by creating large number of threads.
        for (int i = 0; i < 25000; i++) {
            WidgetBuilderThread widgetBuilderThread =
                    new WidgetBuilderThread(widgetBuilder, text, parent, failFlag);
//            Thread thread = new Thread(widgetBuilderThread);
//            thread.start();
        }
//        assertEquals(false, failFlag.get());
    }


    private class Responder {
    }

    String names;
    private class WikiPagePath {
        String names;
    }

    private class StringUtil {
        static String join(String s1, String s2){
            return s1 + s2;
        }
    }

    private class BoldWidget extends ParentWidget {
        public BoldWidget(MockWidgetRoot mockWidgetRoot, String s) {
        }
    }

    private class MockWidgetRoot {
    }

    private class WidgetBuilder {
        public WidgetBuilder(Class[] classes) {
        }
    }

    private class ParentWidget {
    }

    private class WidgetBuilderThread {
        public WidgetBuilderThread(WidgetBuilder widgetBuilder, String text, ParentWidget parent, AtomicBoolean failFlag) {
        }
    }
}
