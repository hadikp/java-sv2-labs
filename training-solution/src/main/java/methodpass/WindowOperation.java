package methodpass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {
        List<Window> windowsNewList = new ArrayList<>();
        for (Window w: windows) {
            Window wPlus = new Window("RoomPlus", w.getWidth(), w.getHeight() + plusSize);
            windowsNewList.add(wPlus);
        }
        System.out.println("Eredeti ablakméret:");
        printListHeight(windows);
        System.out.println("Új ablakméret:");
        printListHeight(windowsNewList);
    }

    private void printListHeight(List<Window> windows) {
        for (Window w: windows) {
            System.out.print(w.getHeight() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        WindowOperation window = new WindowOperation();
        List<Window> windows = new ArrayList(Arrays.asList(new Window("Hálószoba", 200, 100),
                new Window("Vendégszoba", 200, 200),
                new Window("Kisszoba", 200, 300),
                new Window("Nagyszoba", 200, 50)));
        window.riseSize(windows, 30);
    }
}
