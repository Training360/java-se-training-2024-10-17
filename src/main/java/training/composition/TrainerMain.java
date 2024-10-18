package training.composition;

import java.util.ArrayList;
import java.util.List;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe",
                List.of(new Address("Bécs")));

        // Demeter törvényét megsérti
//        trainer.getAddresses().add(new Address("Budapest"));

        // Ez már jó megoldás
        trainer.addAddress(new Address("Budapest"));
    }
}
