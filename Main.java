// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String glas="aeyuioаёуеыоэяиюAEIOUYАЕЁИОУЫЭЮЯ";
        String sogl="qwrtpsdfghjklzxcvbnmйцкнгшщзхфвпрлджчсмтбBCDFGHJKLMNPQRSTVWXYZБВГДЖЗЙКЛМНПРСТФХЧЦШЩ";
        Scanner scan = new Scanner(System. in );
        String tex = scan.nextLine();
        String[] sent=tex.split("\\.");
        for (int i = 0; i < sent.length; i++) {
            {
                int vowcount = 0;
                int conscount = 0;
                for (int j = 0; j < sent[i].length(); j++) {
                    {
                        for (int k = 0; k < glas.length(); k++) {
                            if (sent[i].charAt(j) == glas.charAt(k)) {
                                vowcount++;
                            }
                            if (sent[i].charAt(j) == sogl.charAt(k)) {
                                conscount++;
                            }
                        }
                    }
                }

                if(vowcount>conscount)
                {
                    System.out.println("в "+(i+1)+" предложение больше гласных ("+vowcount+">"+conscount+")");
                }
                else if (vowcount<conscount)
                {
                    System.out.println("в "+(i+1)+" предложение больше согласных ("+conscount+">"+vowcount+")");
                }
                else if (vowcount==0 && conscount==0)
                {
                    System.out.println("в "+(i+1)+" предложении нет букв");
                }
                else
                {
                    System.out.println("в "+(i+1)+" предложение равное количество гласных и согласных ("+vowcount+")");
                }

            }
        }
    }
}