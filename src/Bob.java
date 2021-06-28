import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /*
        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
         */
        Scanner bobScanner = new Scanner(System.in);
        boolean endConvo = false;

        do {
            System.out.println("Say something to bob:");
            String userInput = bobScanner.nextLine();
            boolean askQuestion = userInput.endsWith("?");
            boolean ifYelled = userInput.endsWith("!");
            boolean isEmpty = userInput.isEmpty();
            boolean endLoop = userInput.equalsIgnoreCase("end loop");


            if (askQuestion) {
                System.out.println("Sure");
            } else if (ifYelled) {
                System.out.println("Whoa, chill out!");
            } else if (isEmpty) {
                System.out.println("Fine, be that way...");
            } else if (endLoop) {
                System.out.println("Ending Loop");
                endConvo = true;
            } else {
                System.out.println("Whatever...");
            }

//            //Using Switch Statement
//             switch (userInput){
//                 case userInput.endsWith("?"):
//                     System.out.println("Sure");
//                     break;
//                 case ifYelled:
//                     System.out.println("Woah, chill out man");
//                     break;
//                 case isEmpty:
//                     System.out.println("Fine, be that way");
//                     break;
//                 case endConvo:
//                     System.out.println("Ending Convo");
//                     endLoop = true;
//                     break;
//                 default:
//                     System.out.println("Whatever..");
//                     break;
//             }

        } while (!endConvo);


    }
}