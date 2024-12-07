public class Util {
    public static void addFood(Food food) {
        int persentage = (Menu.foodcounts / Menu.foods.length) * 100;
        if (persentage >= 80) {
            Food[] foods1 = new Food[Menu.foodcounts * 2];
            for (int i = 0; i < Menu.foodcounts; i++) {
                foods1[i] = Menu.foods[i];
            }
            Menu.foods = foods1;
        }
        Menu.foods[Menu.foodcounts] = food;
        Menu.foodcounts++;

    }

    public static void removeFood(String name, double price, String category) {
        for (int i = 0; i < Menu.foodcounts; i++) {
            if (Menu.foods[i].getName() == name && Menu.foods[i].getPrice() == price && Menu.foods[i].getCategory() == category) {
                Menu.foods[i] = null;
                make(Menu.foods,i);
                Menu.foodcounts--;


            }
            else {
                System.out.println("There is not this food ");
            }

        }

    }

    public static void showMenu() {
        System.out.println("/////////////////////////////");
        for (int i = 0; i < Menu.foodcounts; i++) {
            System.out.print(Menu.foods[i].getName());
        }
        System.out.println("///////////////////////////");

    }

    private static void make(Food[] foods, int k) {
        for (int i = 0; i < Menu.foodcounts; i++) {
            Menu.foods[i+k]=Menu.foods[i+k+1];
            Menu.foods[i+k+1]=null;
        }
    }

}

