package basics;

/* 子类父类(Subclass and Superclass)
subclass (child) - the class that inherits from another class
子类（子类） - 从另一个类继承的类

superclass (parent) - the class being inherited from
超类（父类） - 继承自的类

extends关键字：类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。当你这样做时，你将自动获得父类中的所有字段和方法。
super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
this关键字：指向自己的引用。

final 可以用来修饰变量（包括类属性、对象属性、局部变量和形参）、方法（包括类方法和对象方法）和类。final 含义为 "最终的"。
使用 final 关键字声明类，就是把类定义定义为最终类，不能被继承，或者用于修饰方法，该方法不能被子类重写。


方法重载:
　　　java允许在一个类中，多个方法拥有相同的名字，但在名字相同的同时，必须有不同的参数，这就是重载。
　　　编译时编译器会根据实际情况挑选出正确的方法，如果编译器找不到匹配的参数或者找出多个可能的匹配就会产生编译时错误，这个过程被称为重载的解析　　　　
　　　重载规则:
　　　　　（一）再使用方法重载的时候，必须通过方法中不同的参数列表来实现方法的重载。如：方法的参数个数不同或者方法的参数类型不同。
　　　　　（二）不能通过访问权限，返回值类型和抛出的异常来实现重载
　　　　　（三）方法的异常类型和抛出异常的数目不会影响方法的重载，也就是说重载的方法中允许抛出不同的异常
　　　　　（四）可以有不同的返回值类型，只要方法的参数列表不同即可
　　　　　（五）可以有不同的访问修饰符

方法重写：
　　　Java程序中类的继承特性可以产生一个子类，子类继承父类就拥有了父类的非私有的属性（方法和变量），在子类中可以增加自己的属性（方法和变量），同时也可以对父类中的方法进行扩展，以增强自己的功能，这样就称之为重写，也称为复写或者覆盖。
　　　重写规则:　　　　
　　　　　在进行方法重写的时候需要遵循以下规则才能实现方法重写：
　　　　　（一）子类方法的参数列表必须和父类中被重写的方法的参数列表相同（参数个数和参数类型），否则只能实现方法的重载。
　　　　　（二）子类方法的返回值类型必须和父类中被重写的方法返回值类型相同，否则只能实现方法重载。
　　　　　（三）在Java规定，子类方法的访问权限不能比父类中被重写的方法的访问权限更小，必须大于或等于父类的访问权限。
　　　　　（四）在重写的过程中，如果父类中被重写的方法抛出异常，则子类中的方法也要抛出异常。但是抛出的异常也有一定的约束--->子类不能抛出比父类更多的异常，只能抛出比父类更小的异常，或者不抛出异常。
* */
public class S7_inheritance extends Object{
    public static void main(String []args) {

        Object o1 = new Object();
        //如果o1 = 1; 就输出内容

        //to.String()是自动调用的
        System.out.println(o1.toString());
        //java.lang.Object@15db9742 这后面是地址
        Object t1 = new S7_inheritance();
        System.out.println(t1);

        Son boy = new Son(2);
        boy.setFa(3);
        boy.out();

        boy.setf(5);
        boy.out();

    }
}

class Father {
    private int fa;
    int f;
    void setFa(int fa){
        this.fa=fa;
    }
    void out() {
        System.out.println("fa is:"+fa);
    }
}


class Son extends Father{
    int s;

    //父类里面已经有了 f，这里又定义了，就是 覆盖（Override）（成员变量的隐藏）
    int f=123;

    Son(){}
    Son(int s){
        this.s=s;
    }
    void setf(int f){
        super.f=f;	//super操作被隐藏的，只能往上一层父类
    }

    //方法也有 方法重写
    void out() {
        System.out.println("s is:"+s);
        System.out.println("f is:"+super.f);
    }

}
