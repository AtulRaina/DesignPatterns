package Singelton;

import sun.management.jmxremote.SingleEntryRegistry;

// this Implementation is not thread safe;

// Why do be need Singleton Design pattern?

// Singleton is a createional design pattern
// It is used to control the creation of a object
// When we want to ensure that only one instance of an object is created we apply Singleton design
//pattern.
// Usually we make the constructor private
// The class define static instance of itself.
// Then an public instance method which is used to access the instance of the object

//Give example of Singleton design pattern
// File Operations
// Want to have only one instance share
// logger class
//  Gloabal Point of access


public class Singleton
{
  private static Singleton instance;
    private Singleton()
    {

    }
   public static Singleton instance()
    {
        if(instance==null) {
            instance = new Singleton();
            System.out.print("Object initialized....");
            return instance;
        }
        else {
            System.out.print("\n Using already Existing Initialized Object.....");
            return instance;
        }
    }

    public void Log(String message)
    {
        System.out.print(message);
    }
}
