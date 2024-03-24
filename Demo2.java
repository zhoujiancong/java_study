package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo2 {

    public static void main(String[] args) {

        BigDecimal bg1 = BigDecimal.valueOf(10.0);
        BigDecimal bg2 = BigDecimal.valueOf(2.0);

        System.out.println(bg1.add(bg2));
        System.out.println(bg1.subtract(bg2));
        System.out.println(bg1.multiply(bg2));
        System.out.println(bg1.divide(bg2));

        //不过除法有一个小细节:
        //如果两数除得尽,那么就可以用上面的方法
        //但是若除不尽,则会报错
        //所以要使用另外一个方法
        //多了两个参数  保留的位数 和 保留方式

        BigDecimal bg3 = BigDecimal.valueOf(3.0);

        System.out.println(bg1.divide(bg3, 2, RoundingMode.HALF_UP));

        //RoundingMode.HALF_UP是传统意义上的四舍五入
        //如果想要了解其他方式的保留规则,可以在JDK参考文档中查看
      //打开文档 -> 搜索RoundingMode 就可以查看对应

    }

}
