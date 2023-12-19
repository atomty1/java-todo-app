import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<NewTodo> todos = new ArrayList<NewTodo>();
    public static void main(String[] args) {
        System.out.println("Welcome");
        welcome();

    }

    public static void welcome() {
        System.out.print("1. Add todo.  2. Display all todos " +
                "3. Display undone tasks: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();
        if(user_input == 1){
            createTodo();
        } else if (user_input== 2) {
            displayAllTodos();
        } else if (user_input== 3) {
            displayUndoneTasks();
        }
        System.out.println("Go back to the main menu? 1. Yes 2. No");
        int move_to_mainmenu = input.nextInt();
        if(move_to_mainmenu==1){
            welcome();
        } else{
            System.out.println("Bye!!!");
        }
        input.close();
    }
    public static void createTodo(){
        System.out.print("Enter your task: ");
        Scanner input = new Scanner(System.in);
        String user_input = input.next();
        NewTodo myTodo = new NewTodo(user_input);
        todos.add(myTodo);
        input.close();
    }
    public static void displayAllTodos(){
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(i+1+" "+todos.get(i));
        }
        startCompleteTask();

    }
    public static void displayUndoneTasks(){
        for (int i = 0; i < todos.size(); i++) {
            boolean doneStatus = todos.get(i).done;
            if(!doneStatus) System.out.println(i+1+" "+todos.get(i));
        }
        startCompleteTask();


    }

    public  static  void startCompleteTask(){
        System.out.println("Do you want to complete a task? 1. Yes 2. No");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();
        if(user_input==1){
            completeTask();
        }
        input.close();
    }
    public  static  void completeTask(){
        System.out.println("Enter the number of the task: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();
        NewTodo myTask = todos.get(user_input-1);
        myTask.completed();
        input.close();
    }


}