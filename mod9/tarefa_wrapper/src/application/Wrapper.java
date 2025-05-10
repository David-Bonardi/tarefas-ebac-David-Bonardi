package application;

/**
 * @author David Bonardi
 */
public class Wrapper {
    public static void main(String[] args){
        int age = 22;
        System.out.println("The age is: " + age);
        Integer wrappedAge = age;
        System.out.println("The Wrapped age is: " + wrappedAge);
    }
}
