import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the operation which you want : ");
            String chooser = "1. Menu\n" +
                    "2.Order\n" +
                    "3.Report\n" +
                    "4.Search";
            System.out.println(chooser);
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println(" Choose the operation  :");
                    String chooser1="1.Add new food\n" +
                            "2.Remove the food\n" +
                            "3.Show all of the foods";
                    System.out.println(chooser1);
                    int number1=scanner.nextInt();
                    switch(number1){
                        case 1->MenuUtil.addFood();
                        case 2->MenuUtil.removeFood();
                        case 3->MenuUtil.showFood();
                    }
                }
                case 2 -> {

                }
            }















        }
    }


}
