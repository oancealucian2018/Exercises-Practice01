package utile.sda;
import java.text.DecimalFormat;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr:");

        boolean repeat = true;

        while(repeat){
            int nrIntrodus = scanner.nextInt();
            int sum = 0;
            if((nrIntrodus < 1000) && (nrIntrodus > 0)) {
                int r;
                while (nrIntrodus != 0) {
                    r = nrIntrodus % 10;
                    sum += r;

                    nrIntrodus = nrIntrodus / 10;
                } System.out.println(sum);
                repeat = false;
            }else{
                repeat =true;
                System.out.println("Introduceti nr intre 0 si 1000");
            }
        }
    }
}
