package com.dqtri.clean.handbook.functions;

import java.io.InputStream;

public abstract class CommonMonadicForms {
    abstract boolean fileExists(String MyFile);
    abstract InputStream fileOpen(String MyFile);
    abstract void passwordAttemptFailedNtimes(int attempts);
    abstract void includeSetupPageInto(StringBuffer pageText);
    abstract StringBuffer transform(StringBuffer in);
    abstract void transform_(StringBuffer out);
}
