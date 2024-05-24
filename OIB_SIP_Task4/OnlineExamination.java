package OIB_SIP_Task4;
import java.util.*;

public class OnlineExamination {
    public static void main(String[] args){
        
        HashMap<String,Answers> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Online Examination Portal =====");
        ExamPortal portal = new ExamPortal();
        
        portal.login();
        mp.put("d", new Answers("d","c"));
        Answers answer = new Answers("d", "c");

        boolean exit = false;
        while(exit != true){
        System.out.println("1.Give Exam");
        System.out.println("3.Exit");

        System.out.println("Select an option:");
        int option = sc.nextInt();
        
        switch(option){

            case 1:
            System.out.println("Answer the following questions:");

            System.out.println("Q1.Which statement is true about Java?");
            System.out.println("a. Java is a sequence-dependent programming language");
            System.out.println("b. Java is a code dependent programming language");
            System.out.println("c.Java is a platform-dependent programming language");
            System.out.println("d.Java is a platform-independent programming language");

            System.out.print("Enter ans: ");
            String ans1 = sc.next();
            if(ans1.equals(answer.getAnswer1())){
                System.out.println("ans1: correct");
                int marks1 = 1;
            }
            else{
                System.out.println("wrong answer:" +ans1);
                System.out.println("correct:d");
            }

            System.out.println("Q2.Which component is used to compile, debug and execute the java programs?");
            System.out.println("a. JRE");
            System.out.println("b. JIT");
            System.out.println("c.JDK");
            System.out.println("d.JVM");

            System.out.print("Enter ans: ");
            String ans2 = sc.next();
            if(ans2.equals(answer.getAnswer2())){
                System.out.println("ans2: correct");
                int marks2 = 1;
            }
            else{
                System.out.println("wrong answer:"+ans2);
                System.out.println("correct:c");
            }
            break;

            case 3:
            System.out.println("Thank you");
            exit = true;
            break;

        }
    }
        
    }

}

class ExamPortal{
    
    public void login(){
        
        HashMap<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Login with username and password");

        System.out.print("Enter username: ");
        String userName = sc.next();

        System.out.print("Enter pasword: ");
        String password = sc.next();
        map.put(password,userName);

        if(map.containsKey(password)){
            System.out.println("===== Logged In =====");
        }

    }
}

class Answers{
    private String correctAns1;
    private String correctAns2;

    public Answers(String correctAns1, String correctAns2){
        this.correctAns1 = correctAns1;
        this.correctAns2 = correctAns2;
    }

    public String getAnswer1(){
        return correctAns1;
    }
    public String getAnswer2(){
        return correctAns2;
    }
}
