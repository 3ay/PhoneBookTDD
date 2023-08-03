import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.homework.PhoneBook;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int size = phoneBook.add("Alex", "+72328359023");
        Assertions.assertEquals(1, size);
    }

    @Test
    public void testAddEqualsElements() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "+72328359023");
        int size = phoneBook.add("Alex", "+72328359023");
        Assertions.assertEquals(1, size);
    }
    @Test
    public void testAddEqualsPhones() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "+72328359023");
        int size = phoneBook.add("Lara", "+72328359023");
        Assertions.assertEquals(1, size);
    }
    @Test
    public void testAddEqualsNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+73338359020");
        int size = phoneBook.add("Ivan", "+79998359029");
        Assertions.assertEquals(1, size);
    }
    @Test
    public void testFindByNumber()
    {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+73338359020");
        String name = phoneBook.findByNumber("+73338359020");
        Assertions.assertEquals("Ivan", name);
    }
}
