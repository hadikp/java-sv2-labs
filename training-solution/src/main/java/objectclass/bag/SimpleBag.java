package objectclass.bag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> itemsList = new ArrayList<>();

    private int cursor;

    public SimpleBag() {
    }

    public void putItem(Object item) {
        itemsList.add(item);
    }

    public boolean isEmpty() {
        return  (itemsList.size() == 0) ? true : false;
    }

    public int size() {
        return itemsList.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        //for (int i = 0; )
        return true;
    }

    public Object next() {
        cursor++;
       return itemsList.get(cursor);
    }

    public boolean contains(Object item) {
            if (itemsList.contains(item)) {
                return true;
            }
        return false;
    }

    public int getCursor() {
       return cursor;
    }

    public List<Object> getItemsList() {
        return itemsList;
    }
}
