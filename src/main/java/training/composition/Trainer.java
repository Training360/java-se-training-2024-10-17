package training.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trainer {

    @Getter
    private String name;

    private List<Address> addresses;

    public Trainer(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Trainer(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = new ArrayList<>(addresses);
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }
}
