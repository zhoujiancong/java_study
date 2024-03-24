package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {


        //通过下面打印的内容可知
        //如果通过传入double类型的数值来构造对象,那么数值可能不精确
        //所以一般是不使用的
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);//0.01000000000000000020816681711721685132943093776702880859375
        System.out.println(bd2);//0.0899999999999999966693309261245303787291049957275390625


        //通过传入String类型的数值来构造对象,那么数值是精确的
        BigDecimal bg3 = new BigDecimal("0.01");
        BigDecimal bg4 = new BigDecimal("0.09");
        BigDecimal bg5 = bg3.add(bg4);
        System.out.println(bg3);//0.01
        System.out.println(bg4);//0.09
        System.out.println(bg5);//0.10


        //还可以通过像biginteger一样,调用静态方法valuof,向里面传入double类型的数

        BigDecimal bg6 = BigDecimal.valueOf(0.01);
        System.out.println(bg6);

        //当然,这个静态方法还可以传入整数,只是打印出来依旧是以小数形式打印
        //并且,如果这个整数范围在[0,10]之间,那么不会new 是为了节省空间

        BigDecimal bg7 = BigDecimal.valueOf(10);
        BigDecimal bg8 = BigDecimal.valueOf(10);
        System.out.println(bg7 == bg8);//true

        BigDecimal bg9 = BigDecimal.valueOf(100);
        BigDecimal bg10 = BigDecimal.valueOf(100);
        System.out.println(bg9 == bg10);//false

        //建议
        //一般如果输入数不超过double,可以使用静态方法valueof
        //如果超过,或者不明确,则使用成员方法即可
        //一般要对小数进行精确操作,则要创建bigdecimal对象

    }



}
