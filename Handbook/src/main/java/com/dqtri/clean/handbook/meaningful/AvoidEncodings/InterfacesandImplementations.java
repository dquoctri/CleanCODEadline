package com.dqtri.clean.handbook.meaningful.AvoidEncodings;

public class InterfacesandImplementations {
    //This factory will be an interface and will
    //be implemented by a concrete class. What should you name them? IShapeFactory and
    //ShapeFactory? I prefer to leave interfaces unadorned. The preceding I, so common in
    //today’s legacy wads, is a distraction at best and too much information at worst. I don’t
    //want my users knowing that I’m handing them an interface. I just want them to know that
    //it’s a ShapeFactory. So if I must encode either the interface or the implementation, I choose
    //the implementation. Calling it ShapeFactoryImp, or even the hideous CShapeFactory, is preferable to encoding the interface.


    class ShapeFactory implements IShapeFactory{}
    interface IShapeFactory{}

    class CShapeFactory {}

    class ShapeFactoryImp{}
}
