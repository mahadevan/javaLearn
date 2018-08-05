import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        userChoice();
    }

    public static void userChoice(){
        
        boolean exitLoop = false;
        while(exitLoop == false) {
        String ask = "\nPlease Select a Java Programme to Run.\nEnter your Choice as a Number : ";
        System.out.println("________________________");
        System.out.println("*** All Program List ***");
        System.out.println("________________________\n");
        System.out.println("1. Hello World Program");
        System.out.println("2. Looping Program");
        System.out.println("3. Calculator");
        System.out.println("4. exit");
        int option = scanSelection(ask);
        exitLoop = programRun(option);
        }
    }
    
    public static int scanSelection(String prompt){
        System.out.print(prompt);
        Scanner takeSelection = new Scanner(System.in);
        return takeSelection.nextInt();
    }
    public static boolean programRun(int choice){
        switch(choice){ 
            case 1: helloWorld();
                    break;
            case 2: looping();
                    break;
            case 3: simpleCalc();
                    break;
            case 4: return true;
                    
            default:
                    System.out.println("Invalid Choice !!! ");
                    break;
        }
        return false;
    }

// *** All Programs ***
// Hello World
    public static void helloWorld(){
        String x = "\nHello World !";
		System.out.println(x);
    }
// Looping Program
    public static void looping(){
        System.out.println("\nThis Program Demonstrates Four loops : foreach, for, while & do while !");
        int x = scanLoopSelection("\nLoop Program : Please Enter a Number as Selection :");
        switch(x){
            case 1: forEach(); break;
            case 2: forLoop(); break;
            case 3: whileLoop(); break;
            case 4: doWhile(); break;
            default: break;
        }
    }
    public static int scanLoopSelection(String prompt){
        System.out.print(prompt);
        System.out.println("\n1.ForEach Loop\n2.For Loop\n3.While Loop\n4.Do-While Loop");
        Scanner selectLoop = new Scanner(System.in);
        return selectLoop.nextInt();
    }
 

    public static void forEach() {
        System.out.println("\n * For Each Loop Execusion for String Array ! * ");
        String[] stringArray7 = new String[7];
        stringArray7[0] = "apple";
        stringArray7[1] = "ball";
        stringArray7[2] = "cup";
        stringArray7[3] = "dog";
        stringArray7[4] = "elephant";
        stringArray7[5] = "fox";
        stringArray7[6] = "grass";
     
        int count = 1;
        for(String feString: stringArray7){ 
            System.out.println(count+" Thing - "+ stringArray7[count-1]);
            count = count + 1;
        }
        System.out.printf("\nCounted %d Things !",count-1);
        System.out.println("\n --- End Of String Array. ---");
        
        System.out.println("\n * For-Each Loop Execusion for Integer Array ! * ");
        
        int[] integerArray5 = new int[]{2,4,6,8,10};
        count = 0;
        for(int array5 : integerArray5){
            System.out.println(integerArray5[count++]);
        }
        System.out.format("\nTotal %d Numbers !",count);
        System.out.println("\n --- End Of Integer Array. ---");
    }
    public static void forLoop() {
        System.out.println(" * For Loop Execusion Program * \n");
        int i;
        for(i = 1; i<11; i=i+1){
            System.out.format("Printing this %d time.\n",i);
        }
        System.out.format("For Looped Total %d times.\n",i-1);
    }
    public static void whileLoop() {
        System.out.println(" * While Loop Execusion Program * \n");
        int wi=0;
        while(wi<50){
            System.out.format("Adding 5 to %d to reach 50.\n",wi);
            wi += 5;
        }
        System.out.format("50 Reached ! Now the value of our variable is %d.\n",wi);
    }
    public static void doWhile() {
        System.out.println(" * Do-While Loop Program * \n");
        int dwi = 0;
        do{
            System.out.format("Adding 10 to %d to reach 100.\n",dwi);
            dwi += 10;
        }while(dwi<100);
        System.out.format("100 Reached ! Now the value of our variable is %d.\n",dwi);
    }

    // Simple Calculator

    public static void simpleCalc() {

        Double firstNum = getFirstNum("\nEnter First Number : ");

        Double secondNum = getSecondNum("\nEnter Second Number : ");

        performAction(firstNum,secondNum);

    }

        public static Double getFirstNum (String ask){
            System.out.print(ask);
            Scanner readFirstNum = new Scanner(System.in);
            String readStr1 = readFirstNum.nextLine();
            Double firstDouble = Double.parseDouble(readStr1);
            return firstDouble;
        }

        public static Double getSecondNum (String ask){
            System.out.print(ask);
            Scanner readSecondNum = new Scanner(System.in);
            String readStr2 = readSecondNum.nextLine();
            Double secondDouble = Double.parseDouble(readStr2);
            return secondDouble;
        }

        public static void choices () {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Quotient");
            System.out.println("5. Remainder");
            System.out.println("6. Exit This Program.");
        }

        public static double performAction(double first,double second) {
            System.out.println("\nPlease Enter Your Choice Of Operation ? ");
            choices();

            Scanner scanChoice = new Scanner(System.in);
            int choiceOpn = scanChoice.nextInt();

            switch (choiceOpn) {
                case 1:
                    addNum(first,second);
                    break;
                case 2:
                    subNum(first,second);
                    break;
                case 3:
                    mulNum(first,second);
                    break;
                case 4:
                    quoNum(first,second);
                    break;
                case 5:
                    remNum(first,second);
                    break;
                case 6:
                    break;

                default:
                    System.out.println("Wrong Choice.... ! \n\nPlease Enter a Number From List Below !\n\nValid Choices\n");
                    choices();
                    break;

            }
            return -1;
        }

        public static void addNum(double first, double second) {
        double result = first + second;
        System.out.println(result);
        performAction(first,second);
        }

        public static void subNum(double first, double second) {
            double result = first - second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void mulNum(double first, double second) {
            double result = first * second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void quoNum(double first, double second) {
            double result = first / second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void remNum(double first, double second) {
            double result = first % second;
            System.out.println(result);
            performAction(first,second);
        }



    }






        

    
