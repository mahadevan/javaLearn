import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        System.out.println("New Changes");
        userChoice();
    }

    public static void userChoice(){
        String ask = "\nPlease Select a Java Programme to Run.\nEnter your Choice as a Number : ";
        System.out.println(ask);
        System.out.println("________________________");
        System.out.println("*** All Program List ***");
        System.out.println("________________________\n");
        System.out.println("1. Hello World");
        System.out.println("2. For Loop");
        System.out.println("3. exit");
        boolean exitLoop = false;
        while(exitLoop == false) {
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
            case 2: forLoop();
                    break;
            case 3: return true;
            default:
                    System.out.println("Invalid Choice !!! ");
                    break;
        }
        return false;
    }

// Programs
    public static void helloWorld(){
        String x = "Hello World !";
		System.out.println(x);
    }
    public static void forLoop(){
        String x = "For Loop";
		System.out.println(x);
    }
    
    }
