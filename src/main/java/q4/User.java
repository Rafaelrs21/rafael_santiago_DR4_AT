package q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class User {
    private String name;
    private String email;
    private List<Address> addresses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public void addAddress(Address address) {
        if (address != null) {
            addresses.add(address);
        }
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }
}
