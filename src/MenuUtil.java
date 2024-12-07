import java.util.Scanner;

public class MenuUtil {
    //əlavə etmək, silmək və göstərmək
    public static void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name : ");
        String name = scanner.next();
        System.out.println("category : ");
        String category = scanner.next();
        System.out.println("price : ");
        double price = scanner.nextDouble();


        Food food = new Food(name,price,category);
        Util.addFood(food);
    }

    public static void removeFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String name = scanner.next();
        System.out.println("Please enter the price : ");
        Double price = scanner.nextDouble();
        System.out.println("Please enter the category : ");
        String category = scanner.next();
        Util.removeFood(name, price, category);
    }

    public static void showFood() {
        Util.showMenu();
    }

//    public static void order() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the customer name :");
//        String Cname = scanner.next();
//        System.out.println("Please enter the array of food which customer choose : ");
//        String name = scanner.next();
//        Food[] foods1 = new Food[10];
//        boolean flag = false;
//        int sum = 0;
//        for (int i = 0; i < Menu.foodcounts; i++) {
//            if (Menu.foods[i].getName().equals(name)) {
//                foods1[i] = Menu.foods[i];
//                sum += Menu.foods[i].getPrice();
//                flag = true;
//
//            } else {
//                System.out.println("This food has not in the restaurant ");
//            }
//            if
//
//
//        }
//
//    }


}



