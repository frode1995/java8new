import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: frode
 * @Date:2018/8/6 17:03
 * @Description:
 */
public class LambdaDemo {
    public static void main(String[] args) throws IOException {
        String result1 = processFileLimited();
        System.out.println(result1);

       // String result2 = processFile(BufferedReader br) -> br.readLine();
        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLine = processFile((BufferedReader c)-> c.readLine()+c.readLine());
        System.out.println(twoLine);
    }

    public static String processFile(BufferReaderProcesser p ) throws IOException {
        try //以resources为根目录
                (BufferedReader br = new BufferedReader(new FileReader("C:/test/test.txt"))){
            return p.process(br);
        }
    }
    public interface BufferReaderProcesser{
        public String process(BufferedReader b) throws IOException;
    }

    public static String processFileLimited() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:/test/test.txt"))) {
            return br.readLine();
        }
    }
}
