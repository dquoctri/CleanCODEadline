package com.dqtri.clean.handbook.comments;

public class BadComments {
    //Amplification
    //A comment may be used to amplify the importance of something that may otherwise seem
    //inconsequential.
    //String listItemContent = match.group(3).trim();
    //// the trim is real important. It removes the starting
    //// spaces that could cause the item to be recognized
    //// as another list.
    //new ListItemWidget(this, listItemContent, this.level + 1);
    //return buildList(text.substring(match.end()));


    ///There is nothing quite so helpful and satisfying as a well-described public API. The javadocs for the standard Java library are a case in point. It would be difficult, at best, to write
    //Java programs without them

//Bad Comments
//Most comments fall into this category. Usually they are crutches or excuses for poor code
//or justifications for insufficient decisions, amounting to little more than the programmer
//talking to himself.

    //Mumbling
    //Plopping in a comment just because you feel you should or because the process requires it,
    //is a hack. If you decide to write a comment, then spend the time necessary to make sure it
    //is the best comment you can write.


//    public void loadProperties() {
//        try {
//            String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
//            FileInputStream propertiesStream = new FileInputStream(propertiesPath);
//            loadedProperties.load(propertiesStream);
//        } catch (IOException e) {
//// No properties files means all defaults are loaded
//        }
//    }


    //Don’t Use a Comment When You Can Use a Function or a Variable
    // does the module from the global list <mod> depend on the
// subsystem we are part of?
//if (smodule.getDependSubsystems().contains(subSysMod.getSubSystem()))


    //This could be rephrased without the comment as
    //ArrayList moduleDependees = smodule.getDependSubsystems();
    //String ourSubSystem = subSysMod.getSubSystem();
    //if (moduleDependees.contains(ourSubSystem))

}
