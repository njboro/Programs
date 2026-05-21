import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EGInnovationCodeTest {
    public static void main(String[] args) throws IOException {

        //Input : NABA#JYOTI#BORO@33

        //Scanner scanner = new Scanner(System.in);
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));


        //String input = scanner.nextLine();
        String input = bufferReader.readLine();


        if (input != null) {
            printSomething("Input string is "+input + "\n");

            StringTokenizer stringTokenizer = new StringTokenizer(input,"#@");

            String firstname = stringTokenizer.nextToken();
            String middleName = stringTokenizer.nextToken();
            String lastName = stringTokenizer.nextToken();
            String age = stringTokenizer.nextToken();



            //Count for #
            int countHash = 0;
            //Count for @
            int countATheRate = 0;


            char[] charArray = input.toCharArray();

            for (char c : charArray) {
                if (c == '#') {
                    countHash = countHash + 1;
                }

                if (c == '@') {
                    countATheRate = countATheRate + 1;
                }
            }

            String newStringWithDollarSymbol = input.replace("#","$");

            printSomething("1. No. of # in the input is - "+ countHash);
            printSomething("2. No. of @ in the input is - "+ countATheRate);
            printSomething("3. Separate with $ - "+ newStringWithDollarSymbol);

            //First name in uppercase
            //String firstname = "";
            //String[] strings = input.split("#");
            //string at pos = 0 will be the first firstname
            //Todo Check for null
            //firstname = strings[0];
            printSomething("4. First name in uppercase - "+ firstname.toUpperCase());

            //Last name in lowercase
            //lastName = strings[2];
            //Remove @ from
            //String ln = lastName.split("@")[0];
            printSomething("5. Last name in Lowercase - "+ lastName.toLowerCase());

            //Replace all separators with Space and print
        /*StringTokenizer stringTokenizer = new StringTokenizer(input);
        while(stringTokenizer.hasMoreTokens()) {
          printSomthing(stringTokenizer.nextToken());
        }*/

            StringBuilder str = new StringBuilder();
            printSomething("6. Replacing all separators with space - " +
                    str.append(firstname)
                            .append(" ")
                            .append(lastName)
                            .append(" ")
                            .append(age));


            //Firstname in reverse
            char[] fnChars = firstname.toCharArray();
            int size = fnChars.length;

            StringBuilder revString = new StringBuilder();

            for(int i = size-1; i>=0 ; i--) {
                revString.append(fnChars[i]);
            }

            printSomething("7. Reverse of a Firstname - " + revString);
        }
    }

    public static void printSomething(String value) {
        System.out.println(value);
    }
}