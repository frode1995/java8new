/**
 * @Author: frode
 * @Date:2018/8/6 16:35
 * @Description: lambda和匿名类
 */
public class LambdaInterface {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World1");
        r1.run();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World2");
            }
        };
        r2.run();
        process(()-> System.out.println("Hello World3"));
    }

    public static void process(Runnable r) {
      r.run();
    }
}
