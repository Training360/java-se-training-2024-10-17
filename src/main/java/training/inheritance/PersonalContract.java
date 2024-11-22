package training.inheritance;

import lombok.Data;

public class PersonalContract extends Contract {

    @Override
    public void print() {
        System.out.println("personal contract");
    }

    public static void main(String[] args) {
        Contract pc = new PersonalContract();
        pc.print();
    }
}
