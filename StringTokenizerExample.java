import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] main) {
        String str = "Hello, my name is Nabajyoti Boro?";
        StringTokenizer stringTokenizer = new StringTokenizer(str/*, ",?"*/);
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
