package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    private List<String> todoList = new ArrayList<>();

    public void addTodo (String toDo) {
        if ("x".equals(toDo)) {
            String pathName = "C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionwritefile/todos.txt";
            try {
                Files.write(Paths.get(pathName), todoList);
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        todoList.add(toDo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDo toDo = new ToDo();
        System.out.println("Add meg a következő teendőt! Ha nincs több teendőd, akkor x-et írj be!");
        String toDoScanner = null;
        while (!"x".equals(toDoScanner)) {
            toDoScanner = sc.nextLine();
            toDo.addTodo(toDoScanner);
        }
    }
}
