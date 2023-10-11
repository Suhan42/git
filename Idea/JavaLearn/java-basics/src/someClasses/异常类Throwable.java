package someClasses;

public class 异常类Throwable {

    public static void main(String[] args) {

        int a=1, b=2, c=3;

        try {
            a = Integer.parseInt("1234");	//把串转换成数
            b = Integer.parseInt("a123");	//这里串里面有字母所以出错了，也就没有赋值
            c = 12;			//因为上面一行出错了，所以直接catch，这一行就没有执行
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage()+"\n");
            //e.printStackTrace();	//直接报错
        }
        //Exception 是所有异常类的父类，都可以捕获到
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        //finally子语句，无论try是否异常，都会执行finally语句
        finally {
            System.out.println("a is "+a+"\nb is "+b+"\nc is "+c);
        }
    //故意测试
        try {
            System.out.println("故意抛出异常测试");
            throw new java.io.IOException("故意的");		//throw 抛出异常
        }
        catch(java.io.IOException e) {
            System.out.println("发生异常："+e.getMessage());
        }
    //引用测试
        try {
            hello();
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }
    }

    static void hello() throws Exception  {
        System.out.println("helloword");
        throw new java.io.IOException("I/O也是故意抛出异常");
    }

}
