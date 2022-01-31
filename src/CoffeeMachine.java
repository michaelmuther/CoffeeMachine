import java.util.Scanner;

public class CoffeeMachine {

//    final static String CUPS_INPUT_STR = "Write how many cups of coffee you will need:\n";
//    final static String YOU_WILL_NEED_STR = "For %d cups of coffee, you will need:\n";
    final static String WATER_STR = "%d ml of water\n";
    final static String MILK_STR = "%d ml of milk\n";
    final static String COFFEE_STR = "%d g of coffee beans\n";
    final static String CUPS_STR = "%d disposable cups\n";
    final static String MONEY_STR = "$%d of money\n";
//    final static String INV_WATER_STR = "Write how many ml of water the coffee machine has:\n";
//    final static String INV_MILK_STR = "Write how many ml of milk the coffee machine has:\n";
//    final static String INV_COFFEE_BEANS_STR = "Write how many grams of coffee beans the coffee machine has:\n";
//    final static String YES_EXACT_OUTPUT = "Yes, I can make that amount of coffee";
//    final static String NO_OUTPUT = "No, I can make only %d cup(s) of coffee";
//    final static String YES_WITH_REMAINDER_OUTPUT = "Yes, I can make that amount of coffee (and even %d more than that)";
    final static String MACHINE_HAS_STR = "\nThe coffee machine has:";
    final static String ACTION_INPUT_STR = "Write action (buy, fill, take):";
    final static String WHAT_TO_BUY_INPUT_STR = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:";
    final static String WATER_ADD_INPUT_STR = "Write how many ml of water you want to add:";
    final static String MILK_ADD_INPUT_STR = "Write how many ml of milk you want to add:";
    final static String COFFEE_ADD_INPUT_STR = "Write how many grams of coffee beans you want to add:";
    final static String CUPS_ADD_INPUT_STR = "Write how many disposable cups of coffee you want to add:";
    final static String TAKE_DOLLARS_STR = "I gave you $%d\n";

    static Scanner scanner = new Scanner(System.in);
//    final static int ML_WATER_PER_CUP = 200;
//    final static int ML_MILK_PER_CUP = 50;
//    final static int G_COFFEE_BEANS_PER_CUP = 15;
    final static int ML_WATER_PER_ESPRESSO = 250;
    final static int ML_MILK_PER_ESPRESSO = 0;
    final static int G_COFFEE_BEANS_PER_ESPRESSO = 16;
    final static int PRICE_PER_ESPRESSO = 4;
    final static int ML_WATER_PER_LATTE = 350;
    final static int ML_MILK_PER_LATTE = 75;
    final static int G_COFFEE_BEANS_PER_LATTE = 20;
    final static int PRICE_PER_LATTE = 7;
    final static int ML_WATER_PER_CAPPUCCINO = 200;
    final static int ML_MILK_PER_CAPPUCCINO = 100;
    final static int G_COFFEE_BEANS_PER_CAPPUCCINO = 12;
    final static int PRICE_PER_CAPPUCCINO = 6;
    final static int ML_WATER_START = 400;
    final static int ML_MILK_START = 540;
    final static int G_COFFEE_BEANS_START = 120;
    final static int CUPS_START = 9;
    final static int DOLLARS_START = 550;

//    static int cupsNeededInput = 0;
    static int mlWaterInvInput = 0;
    static int mlMilkInvInput = 0;
    static int gCoffeeBeansInvInput = 0;
    static int disposableCupsInvInput = 0;
//    static int cupsPossibleCalc = 0;
//    static int cupsRemainingCalc = 0;
//    static int mlWaterNeededCalc = 0;
//    static int mlMilkNeededCalc = 0;
//    static int gCoffeeBeansNeededCalc = 0;
    static int mlWaterInvCurrent = 0;
    static int mlMilkInvCurrent = 0;
    static int gCoffeeBeansInvCurrent = 0;
    static int disposableCupsCurrent = 0;
    static int dollarsMoneyCurrent = 0;


//    public static void inputIngredients() {
//        System.out.print(INV_WATER_STR);
//        mlWaterInvInput = scanner.nextInt();
//        System.out.print(INV_MILK_STR);
//        mlMilkInvInput = scanner.nextInt();
//        System.out.print(INV_COFFEE_BEANS_STR);
//        gCoffeeBeansInvInput = scanner.nextInt();
//    }

//    public static void inputCups() {
//        System.out.print(CUPS_INPUT_STR);
//        cupsNeededInput = scanner.nextInt();
//    }

//    public static void calculateIngredients() {
//        mlWaterNeededCalc = ML_WATER_PER_CUP * cupsNeededInput;
//        mlMilkNeededCalc = ML_MILK_PER_CUP * cupsNeededInput;
//        gCoffeeBeansNeededCalc = G_COFFEE_BEANS_PER_CUP * cupsNeededInput;
//    }

//    public static void calculateCapacity() {
//        int portionsWater = mlWaterInvInput / ML_WATER_PER_CUP;
//        int portionsMilk = mlMilkInvInput / ML_MILK_PER_CUP;
//        int portionsCoffeeBeans = gCoffeeBeansInvInput / G_COFFEE_BEANS_PER_CUP;
//        cupsPossibleCalc = minimumThreeInts(portionsWater, portionsMilk, portionsCoffeeBeans);
//        cupsRemainingCalc = cupsPossibleCalc - cupsNeededInput;
//    }

//    public static int minimumThreeInts(int a, int b, int c) {
//        int min = a;
//        if (min > b) min = b;
//        if (min > c) min = c;
//        return min;
//    }

//    public static void printOutput() {
//        if (cupsNeededInput == cupsPossibleCalc) {
//            System.out.print(YES_EXACT_OUTPUT);
//        } else if (cupsNeededInput > cupsPossibleCalc) {
//            System.out.printf(NO_OUTPUT, cupsPossibleCalc);
//        } else {
//            System.out.printf(YES_WITH_REMAINDER_OUTPUT, cupsRemainingCalc);
//        }
//    }

//    public static void printIngredients() {
//        System.out.printf(YOU_WILL_NEED_STR, cupsNeededInput);
//        System.out.printf(WATER_STR, mlWaterNeededCalc);
//        System.out.printf(MILK_STR, mlMilkNeededCalc);
//        System.out.printf(COFFEE_STR, gCoffeeBeansNeededCalc);
//    }

    public static void machineStartingInventory() {
        mlWaterInvCurrent = ML_WATER_START;
        mlMilkInvCurrent = ML_MILK_START;
        gCoffeeBeansInvCurrent = G_COFFEE_BEANS_START;
        disposableCupsCurrent = CUPS_START;
        dollarsMoneyCurrent = DOLLARS_START;
        machineInventoryPrint();
    }

    public static void machineInventoryPrint() {
        System.out.println(MACHINE_HAS_STR);
        System.out.printf(WATER_STR, mlWaterInvCurrent);
        System.out.printf(MILK_STR, mlMilkInvCurrent);
        System.out.printf(COFFEE_STR, gCoffeeBeansInvCurrent);
        System.out.printf(CUPS_STR, disposableCupsCurrent);
        System.out.printf(MONEY_STR, dollarsMoneyCurrent);
    }

    public static void inputAction() {
        System.out.println(ACTION_INPUT_STR);
        String action = scanner.nextLine();
        switch (action) {
            case "buy" -> buyItem();
            case "fill" -> fillMachine();
            case "take" -> takeMoney();
        }
    }

    public static void buyItem() {
        System.out.println(WHAT_TO_BUY_INPUT_STR);
        int purchase = scanner.nextInt();
        switch (purchase) {
            case 1 -> {
                mlWaterInvCurrent -= ML_WATER_PER_ESPRESSO;
                mlMilkInvCurrent -= ML_MILK_PER_ESPRESSO;
                gCoffeeBeansInvCurrent -= G_COFFEE_BEANS_PER_ESPRESSO;
                disposableCupsCurrent--;
                dollarsMoneyCurrent += PRICE_PER_ESPRESSO;
            }
            case 2 -> {
                mlWaterInvCurrent -= ML_WATER_PER_LATTE;
                mlMilkInvCurrent -= ML_MILK_PER_LATTE;
                gCoffeeBeansInvCurrent -= G_COFFEE_BEANS_PER_LATTE;
                disposableCupsCurrent--;
                dollarsMoneyCurrent += PRICE_PER_LATTE;
            }
            case 3 -> {
                mlWaterInvCurrent -= ML_WATER_PER_CAPPUCCINO;
                mlMilkInvCurrent -= ML_MILK_PER_CAPPUCCINO;
                gCoffeeBeansInvCurrent -= G_COFFEE_BEANS_PER_CAPPUCCINO;
                disposableCupsCurrent--;
                dollarsMoneyCurrent += PRICE_PER_CAPPUCCINO;
            }
            default -> {
            }
        }
        machineInventoryPrint();
    }

    public static void fillMachine() {
        System.out.println(WATER_ADD_INPUT_STR);
        mlWaterInvInput = scanner.nextInt();
        mlWaterInvCurrent += mlWaterInvInput;

        System.out.println(MILK_ADD_INPUT_STR);
        mlMilkInvInput = scanner.nextInt();
        mlMilkInvCurrent += mlMilkInvInput;

        System.out.println(COFFEE_ADD_INPUT_STR);
        gCoffeeBeansInvInput = scanner.nextInt();
        gCoffeeBeansInvCurrent += gCoffeeBeansInvInput;

        System.out.println(CUPS_ADD_INPUT_STR);
        disposableCupsInvInput = scanner.nextInt();
        disposableCupsCurrent += disposableCupsInvInput;

        machineInventoryPrint();
    }

    public static void takeMoney() {
        System.out.printf(TAKE_DOLLARS_STR,dollarsMoneyCurrent);
        dollarsMoneyCurrent = 0;
        machineInventoryPrint();
    }
    public static void main(String[] args) {
        machineStartingInventory();
        inputAction();
//        printIngredients();
//        inputIngredients();
//        inputCups();
//        calculateIngredients();
//        calculateCapacity();
//        printOutput();
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