public class Person {
    //fields
    public String name;
    private int age;
    public static int idNumberCreator = 0;
    private int idNumber;

    //Constructors
    public Person(String name, int age) {
        System.out.println("Constructed Person Object");
        this.name = name;
        this.age = age;
        idNumber = idNumberCreator;
        idNumberCreator++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(String message){
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Name: "+ name + "\tAge: " + age + "\tID: " + idNumber;
    }
}
