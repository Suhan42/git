package someClasses;

public class 内部类调用 {
    public static void main(String []args) {
        InnerClass no = new InnerClass();

        InnerClass.A noa = no.new A(2);
        //B 是静态的
        InnerClass.B nob = new InnerClass.B(4);

        no.outclass();
        noa.out();
        nob.out();

        //匿名类的重写
        Anonymous an = new Anonymous() {
            void out() {
                int num=2;
                for(int i=0; i<3; i++, num++)
                    System.out.print(num+" ");
            }
        };
        an.out();
    }
}

