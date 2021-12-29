package collectionslist.address;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<String> addresses = new ArrayList<>();

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        int numberRemove = addresses.indexOf(address);
        addresses.remove(numberRemove);
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
