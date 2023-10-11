package basics;
/*
类的组合和复用
在新类中创建现有类的对象。这种方式叫做“组合”（Composition），通过这种方式复用代码的功能，而非其形式。

对于像C语言等面向过程语言来说，“复用”通常指的就是“复制代码”。任何语言都可通过简单复制来达到代码复用的目的，但是这样做的效果并不好。Java围绕“类”（Class）来解决问题。我们可以直接使用别人构建或调试过的代码，而非创建新类、重新开始。如何在不污染源代码的前提下使用现存代码是需要技巧的。在本章里，你将学习到两种方式来达到这个目的：
1.组合（Composition）：第一种方式直接了当。在新类中创建现有类的对象。这种方式叫做“组合”（Composition），通过这种方式复用代码的功能，而非其形式。
2.继承（Inheritance）：第二种方式更为微妙。创建现有类类型的新类。照字面理解：采用现有类形式，又无需在编码时改动其代码，这种方式就叫做“继承”（Inheritance），编译器会做大部分的工作。继承是面向对象编程（OOP）的重要基础之一。更多功能相关将在多态（Polymorphism）章节中介绍。

* */
public class S6_composition {
    public static void main(String []args) {
        SIM s1 = new SIM("19510187956");
        SIM s2 = new SIM("110-120-119");
        Phone p = new Phone();
        p.setSIM1(s1);
        p.setSIM2(s2);
        p.getPhone1();
        p.getPhone2();
    }
}
//双卡手机
class Phone{
    SIM sim1, sim2;
    void setSIM1(SIM sim1) {
        this.sim1 = sim1;
    }
    void setSIM2(SIM sim2) {
        this.sim2 = sim2;
    }
    void getPhone1() {
        sim1.getSIM();
    }
    void getPhone2() {
        sim2.getSIM();
    }
}
//SIM卡
class SIM{
    String h;
    SIM(String h){
        this.h = h;
    }

    void getSIM() {
        System.out.println(h);
    }
}