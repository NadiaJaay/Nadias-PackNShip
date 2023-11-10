public class Shipment {
    public static void main(String[] args) {
        System.out.println("Welcome to Nadia Jujooste's shipping calculator!");
        Package one = new Package();
        Package two = new Package();

        printPackages(one, two);
        printDimensions(one, two);
        printCost(one, two);
        
    }

    public static Double calcCost(double volume){
        if (volume <= 1) {
            return 3.0;
        }else {
            return 3.0 + (volume - 1);
        }
    }

    public static void difference(double costOne, double costTwo){
        
        int divisionOne = (int) (costTwo/costOne);
        int divisionTwo = (int) (costOne/costTwo);
        double differenceOne = costTwo - costOne; 
        double differenceTwo = costOne - costTwo;

        if (costOne == costTwo) {
            System.out.println("The first package is the same cost as the second package.");
        }

        if (costTwo > costOne) {
            if (divisionOne < 2) {
                System.out.printf("The second package is slightly more than the first package, with a difference of $%.2f\n", differenceOne);
            }else if (divisionOne < 3) {
                System.out.printf("The second package is twice the first package, with a difference of $%.2f\n", differenceOne);
            }else if (divisionOne < 4) {
                System.out.printf("The second package is triple the first package, with a difference of $%.2f\n", differenceOne);
            }else if (divisionOne < 5) {
                System.out.printf("The second package is quadruple the first package, with a difference of $%.2f\n", differenceOne);
            }else {
                System.out.printf("The second package is " + divisionOne + "x the first package, with a difference of $%.2f\n", differenceOne);
            }
        }

        if (costOne > costTwo) {
            if (divisionTwo < 2) {
                System.out.printf("The first package is slightly more than the second package, with a difference of $%.2f\n", differenceTwo);
            }else if (divisionTwo < 3) {
                System.out.printf("The first package is twice the second package, with a difference of $%.2f\n", differenceTwo);
            }else if (divisionTwo < 4) {
                System.out.printf("The first package is triple the second package, with a difference of $%.2f\n", differenceTwo);
            }else if (divisionTwo < 5) {
                System.out.printf("The first package is quadruple the second package, with a difference of $%.2f\n", differenceTwo);
            }else {
                System.out.printf("The first package is " + divisionTwo + "x the second package, with a difference of $%.2f\n", differenceTwo);
            }
        }
    }

    public static void printDimensions(Package one, Package two){

       System.out.println("\n-------------------------------------------------------------------------------");
       System.out.print("First package dimensions: ");
       one.displayDimensions();
       System.out.printf(", Volume = %.1f",  one.calcVolume());
       System.out.println("");

       System.out.print("Second package dimensions: ");
       two.displayDimensions();
       System.out.printf(", Volume = %.1f",  two.calcVolume());
       System.out.println("\n-------------------------------------------------------------------------------");

    }

    public static void printCost(Package one, Package two){

        System.out.printf("Package 1 will cost $%.2f to ship.\n", calcCost(one.calcVolume()));
        System.out.printf("Package 2 will cost $%.2f to ship.\n", calcCost(two.calcVolume()));
        System.out.println("-------------------------------------------------------------------------------");
        difference(calcCost(one.calcVolume()), calcCost(two.calcVolume()));
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void printPackages(Package one, Package two){
        System.out.println("\n---------------------------------");
        System.out.println("\nEnter first package dimensions");
        
        one.inputLength();
        one.inputWidth();
        one.inputHeight();

        System.out.println("\n---------------------------------");
        System.out.println("\nEnter second package dimensions");
        
        two.inputLength();
        two.inputWidth();
        two.inputHeight();
    }
}
