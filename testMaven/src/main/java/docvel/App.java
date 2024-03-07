package docvel;

/**
 * Person
 *
 */
public class App {
    public static void main( String[] args ){
        Person person1 = new Person("Иван", 21);

        System.out.printf("%s хэш: %d", person1, person1.hashCode());
    }
}
