import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please share your idea with us.");
        Scanner in=new Scanner(System.in);
        String content=in.nextLine();
        if (content.length()<=140) {
            int countAt = 0;
            int countHash = 0;

            for (int i = 0; i < content.length()-1; i++) {
                if (content.charAt(i) == '@' ) {
                    if( content.charAt(i + 1) != ' ' && content.charAt(i + 1) != '\t'){

                    countAt++;}


                } else  if (content.charAt(i) == '#' ) {
                    if(content.charAt(i + 1) != ' ' && content.charAt(i + 1) != '\t'){

                        countHash++;}
                    }


                }


            int countLink = content.length() - content.toLowerCase().replaceAll("http://", "      ").length();


            System.out.println("Length correct!");
            System.out.println("Number of Hashtags: " + countHash);
            System.out.println("Number of Attributions: " + countAt);
            System.out.println("NUmber of Links: " + countLink);

        }else {
            int excessNumber = content.length()-140;
            System.out.println("Excess Characters: "+excessNumber);}
    }
}


            /*content.length()-content.replaceAll("@","").length()-(content.length()-content.replaceAll("@ "," ").length());
            int countHash=content.length()-content.replaceAll("#","").length();*/








