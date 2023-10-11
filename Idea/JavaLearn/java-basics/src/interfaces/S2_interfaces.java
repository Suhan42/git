package interfaces;

/* 接口可以随意跨包

Another way to achieve abstraction in Java, is with interfaces.
在Java中实现抽象的另一种方法是使用接口。

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
要访问接口方法，接口必须由另一个类使用 implements 关键字（而不是 extends ）“实现”（有点像继承）。接口方法的主体由“implement”类提供：

Notes on Interfaces: 接口注意事项：
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
与抽象类一样，接口不能用于创建对象（在上面的例子中，不可能在 MyMainClass 中创建“Animal”对象）
Interface methods do not have a body - the body is provided by the "implement" class
接口方法没有主体 - 主体由“implement”类提供
On implementation of an interface, you must override all of its methods
在接口的实现上，必须重写其所有方法
Interface methods are by default abstract and public
接口方法是默认 abstract 和 public
Interface attributes are by default public, static and final
默认情况下，接口属性为 public ， static 并且 final
An interface cannot contain a constructor (as it cannot be used to create objects)
接口不能包含构造函数（因为它不能用于创建对象）

Why And When To Use Interfaces?
为什么以及何时使用接口？
1) To achieve security - hide certain details and only show the important details of an object (interface).
1）实现安全性 - 隐藏某些细节，只显示对象（接口）的重要细节。
2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).
2）Java不支持“多重继承”（一个类只能从一个超类继承）。但是，它可以通过接口实现，因为该类可以实现多个接口。注意：要实现多个接口，请用逗号分隔它们（请参阅下面的示例）。
* */
public class S2_interfaces {
    public static void main(String[] args) {
        Pig2 myPig = new Pig2();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Interface
interface Animal2 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
// 也可以继承多个接口：
//class Pig2 implements Animal2, Animal3, Animal4 {
class Pig2 implements Animal2 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee2");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz2");
    }
}