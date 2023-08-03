import org.junit.jupiter.api.Test;
import ru.netology.homework.PhoneBook;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int size = phoneBook.add("Alex", "+72328359023");
        assertEquals(1, size);
    }

    @Test
    public void testAddEqualsElements() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "+72328359023");
        int size = phoneBook.add("Alex", "+72328359023");
        assertEquals(1, size);
    }

    @Test
    public void testAddEqualsPhones() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "+72328359023");
        int size = phoneBook.add("Lara", "+72328359023");
        assertEquals(1, size);
    }

    @Test
    public void testAddEqualsNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+73338359020");
        int size = phoneBook.add("Ivan", "+79998359029");
        assertEquals(1, size);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+73338359020");
        String name = phoneBook.findByNumber("+73338359020");
        assertEquals("Ivan", name);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+73338359020");
        String phone = phoneBook.findByName("Ivan");
        assertEquals("+73338359020", phone);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        phoneBook.add("Jack", "+15649082167");
        phoneBook.add("Ivan", "+73338359020");
        phoneBook.add("Alex", "84994562211");
        phoneBook.printAllNames();
        String expectedOutput = "Alex" + '\n' + "Ivan" + '\n' + "Jack" + '\n';
        assertEquals(expectedOutput, outContent.toString());
    }
}
