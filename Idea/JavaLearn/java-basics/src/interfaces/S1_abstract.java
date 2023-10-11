package interfaces;

/*
Abstract Classes and Methods
抽象类和方法

Data abstraction is the process of hiding certain details and showing only essential information to the user.
数据抽象是隐藏某些细节并仅向用户显示基本信息的过程。

Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
抽象可以通过抽象类或接口来实现（您将在下一章中了解更多）。

The abstract keyword is a non-access modifier, used for classes and methods.
关键字 abstract 是一个非访问修饰符，用于类和方法.

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
抽象类：是一个受限制的类，不能用于创建对象（要访问它，它必须从另一个类继承）。

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
抽象方法：只能在抽象类中使用，并且没有主体。主体由子类（继承自）提供。

An abstract class can have both abstract and regular methods.
抽象类可以同时具有抽象方法和常规方法.
* */

public class S1_abstract {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    Pig(){}
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
