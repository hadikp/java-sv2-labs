package interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {

    private List<String> tasksList = new ArrayList<>();

    public SimpleThread(List<String> tasksList) {
        this.tasksList = tasksList;
    }

    private boolean nextStep(int count) {
        System.out.println(tasksList.get(count));
        return (tasksList.size() -1 > count);
    }

    @Override
    public void run() {
        boolean isTrue;
        int count = 0;
         do {
             isTrue = nextStep(count);
            count++;
        } while (isTrue);
    }

    public List<String> getTasksList() {
        return tasksList;
    }
}
