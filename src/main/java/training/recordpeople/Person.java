package training.recordpeople;

public record Person(String name, int yearOfBirth) {

    public int getAge(int year) {
        return year - yearOfBirth;
    }
}
