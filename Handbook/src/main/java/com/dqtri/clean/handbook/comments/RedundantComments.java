package com.dqtri.clean.handbook.comments;

import lombok.extern.java.Log;
import org.apache.catalina.Cluster;
import org.apache.catalina.Container;
import org.apache.catalina.Lifecycle;
import org.apache.catalina.Loader;
import org.apache.catalina.Manager;
import org.apache.catalina.Pipeline;
import org.apache.catalina.Realm;
import org.apache.catalina.core.StandardPipeline;

import javax.management.MBeanRegistration;
import javax.naming.directory.DirContext;
import java.io.Serializable;
import java.util.ArrayList;

public class RedundantComments {
    // Utility method that returns when this.closed is true. Throws an exception
    // if the timeout is reached.
    public synchronized void waitForClose(final long timeoutMillis)
            throws Exception {
        if (!closed) {
            wait(timeoutMillis);
            if (!closed)
                throw new Exception("MockResponseSender could not be closed");
        }
    }

    boolean closed;

    abstract class ContainerBase
            implements Container, Lifecycle, Pipeline,
            MBeanRegistration, Serializable {
        /**
         * The processor delay for this component.
         */
        protected int backgroundProcessorDelay = -1;
        /**
         * The lifecycle event support for this component.
         */
        protected LifecycleSupport lifecycle =
                new LifecycleSupport(this);
        /**
         * The container event listeners for this Container.
         */
        protected ArrayList listeners = new ArrayList();
        /**
         * The Loader implementation with which this Container is
         * associated.
         */
        protected Loader loader = null;
        /**
         * The Logger implementation with which this Container is
         * associated.
         */
        protected Log logger = null;
        /**
         * Associated logger name.
         */
        protected String logName = null;

        /**
         * The Manager implementation with which this Container is
         * associated.
         */
        protected Manager manager = null;
        /**
         * The cluster with which this Container is associated.
         */
        protected Cluster cluster = null;
        /**
         * The human-readable name of this Container.
         */
        protected String name = null;
        /**
         * The parent Container to which this Container is a child.
         */
        protected Container parent = null;
        /**
         * The parent class loader to be configured when we install a
         * Loader.
         */
        protected ClassLoader parentClassLoader = null;
        /**
         * The Pipeline object with which this Container is
         * associated.
         */
        protected Pipeline pipeline = new StandardPipeline(this);
        /**
         * The Realm with which this Container is associated.
         */
        protected Realm realm = null;
        /**
         * The resources DirContext object with which this Container
         * is associated.
         */
        protected DirContext resources = null;
    }

    //Misleading Comments
    //Mandated Comments

    /**
     * @param title             The title of the CD
     * @param author            The author of the CD
     * @param tracks            The number of tracks on the CD
     * @param durationInMinutes The duration of the CD in minutes
     */
    public void addCD(String title, String author,
                      int tracks, int durationInMinutes) {
        CD cd = new CD();
        cd.title = title;
        cd.author = author;
        cd.tracks = tracks;
        //cd.duration = duration; ??
        //cdList.add(cd);
    }

    class CD {
        String title;
        String author;
        int tracks;
        int durationInMinutes;
        int duration;
    }

    class LifecycleSupport {
        LifecycleSupport(ContainerBase thiz){}
    }

}
