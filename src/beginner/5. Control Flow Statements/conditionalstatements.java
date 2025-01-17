public class conditionalstatements {
    public static void main(String[] args) {
        System.out.println("Conditional statements");
        /*
         * 1. if Statement 
         * 2. if-else Statement
         * 3. if-else if-else Ladder
         * 4. switch-case Statement             
         */
        System.out.println();
        System.out.println("1. if Statement");
        int a = 5;
        if (a > 0) {
            System.out.println("The number is positive."+a);
            a+=1;
        }
        System.out.println();
        System.out.println("2. if-else Statement");
        int c = -2;
        if (c > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
        System.out.println();
        System.out.println("3. if-else if-else Ladder");
        int p = 0;
        if (p > 0) {
            System.out.println("The number is positive.");
        } else if (p < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println();
        System.out.println("4. switch-case Statement");
        String dayName;
        switch (a = 1) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day: " + dayName);
    }
    
}
