package collectionsqueue.todo;

import java.util.*;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo td: todos) {
            if (td.isUrgent()) {
                result.push(td);
            } else {
                result.addLast(td);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDo reggeli = new ToDo("reggelizés", false);
        ToDo tizorai = new ToDo("tízórai", false);
        ToDo ebed = new ToDo("ebédelés", true);
        ToDo uzsonna  = new ToDo("uzsonnázás", false);
        ToDo vacsora = new ToDo("vacsorázás", false);
        ToDo kod = new ToDo("Java kódírás", true);
        List<ToDo> todos = Arrays.asList(reggeli, tizorai, ebed, uzsonna, vacsora, kod);
        ToDoList toDoList = new ToDoList(todos);
        System.out.println(toDoList.getTodosInUrgencyOrder());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());
    }
}
