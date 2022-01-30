import java.util.Scanner;

public class CoffeeMachine {

    final static String CUPS_INPUT_STR = "Write how many cups of coffee you will need:\n";
    final static String YOU_WILL_NEED_STR = "For %d cups of coffee, you will need:\n";
    final static String WATER_STR = "%d ml of water\n";
    final static String MILK_STR = "%d ml of milk\n";
    final static String COFFEE_STR = "%d g of coffee beans\n";
    final static String INV_WATER_STR = "Write how many ml of water the coffee machine has:\n";
    final static String INV_MILK_STR = "Write how many ml of milk the coffee machine has:\n";
    final static String INV_COFFEE_BEANS_STR = "Write how many grams of coffee beans the coffee machine has:\n";
    final static String YES_EXACT_OUTPUT = "Yes, I can make that amount of coffee";
    final static String NO_OUTPUT = "No, I can make only %d cup(s) of coffee";
    final static String YES_WITH_REMAINDER_OUTPUT = "Yes, I can make that amount of coffee (and even %d more than that)";

    static Scanner scanner = new Scanner(System.in);
    static int cupsNeededInput = 0;
    static int mlWaterInvInput = 0;
    static int mlMilkInvInput = 0;
    static int gCoffeeBeansInvInput = 0;
    static int cupsPossibleCalc = 0;
    static int cupsRemainingCalc = 0;
    final static int ML_WATER_PER_CUP = 200;
    final static int ML_MILK_PER_CUP = 50;
    final static int G_COFFEE_BEANS_PER_CUP = 15;
    static int mlWaterNeededCalc = 0;
    static int mlMilkNeededCalc = 0;
    static int gCoffeeBeansNeededCalc = 0;

    public static void inputIngredients() {
        System.out.print(INV_WATER_STR);
        mlWaterInvInput = scanner.nextInt();
        System.out.print(INV_MILK_STR);
        mlMilkInvInput = scanner.nextInt();
        System.out.print(INV_COFFEE_BEANS_STR);
        gCoffeeBeansInvInput = scanner.nextInt();
    }

    public static void inputCups() {
        System.out.print(CUPS_INPUT_STR);
        cupsNeededInput = scanner.nextInt();
    }

    public static void calculateIngredients() {
        mlWaterNeededCalc = ML_WATER_PER_CUP * cupsNeededInput;
        mlMilkNeededCalc = ML_MILK_PER_CUP * cupsNeededInput;
        gCoffeeBeansNeededCalc = G_COFFEE_BEANS_PER_CUP * cupsNeededInput;
    }

    public static void calculateCapacity() {
        int portionsWater = mlWaterInvInput / ML_WATER_PER_CUP;
        int portionsMilk = mlMilkInvInput / ML_MILK_PER_CUP;
        int portionsCoffeeBeans = gCoffeeBeansInvInput / G_COFFEE_BEANS_PER_CUP;
        cupsPossibleCalc = minimumThreeInts(portionsWater, portionsMilk, portionsCoffeeBeans);
        cupsRemainingCalc = cupsPossibleCalc - cupsNeededInput;
    }

    public static int minimumThreeInts(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    public static void printOutput() {
        if (cupsNeededInput == cupsPossibleCalc) {
            System.out.print(YES_EXACT_OUTPUT);
        } else if (cupsNeededInput > cupsPossibleCalc) {
            System.out.printf(NO_OUTPUT, cupsPossibleCalc);
        } else {
            System.out.printf(YES_WITH_REMAINDER_OUTPUT, cupsRemainingCalc);
        }
    }

    public static void printIngredients() {
        System.out.printf(YOU_WILL_NEED_STR, cupsNeededInput);
        System.out.printf(WATER_STR, mlWaterNeededCalc);
        System.out.printf(MILK_STR, mlMilkNeededCalc);
        System.out.printf(COFFEE_STR, gCoffeeBeansNeededCalc);
    }

    public static void main(String[] args) {
        inputIngredients();
        inputCups();
        calculateIngredients();
        calculateCapacity();
        printOutput();
//        printIngredients();
    }
}


//    final static String STARTING_STR = "Starting to make a coffee";
//    final static String GRINDING_STR = "Grinding coffee beans";
//    final static String BOILING_STR = "Boiling water";
//    final static String MIXING_STR = "Mixing boiled water with crushed coffee beans";
//    final static String POURING_COFFEE_STR = "Pouring coffee into the cup";
//    final static String POURING_MILK_STR = "Pouring some milk into the cup";
//    final static String READY_STR = "Coffee is ready!";

//        System.out.println(STARTING_STR);
//        System.out.println(GRINDING_STR);
//        System.out.println(BOILING_STR);
//        System.out.println(MIXING_STR);
//        System.out.println(POURING_COFFEE_STR);
//        System.out.println(POURING_MILK_STR);
//        System.out.println(READY_STR);