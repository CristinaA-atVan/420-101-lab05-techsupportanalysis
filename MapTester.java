import java.util.HashMap;
/**
 * Debug Class
 * This whole class is the answer to Question 27
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    HashMap<String, String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contacts = new HashMap();
    }

    /**
     * Input a name and phone number into the phonebook
     */
    public void enterNumber(String name, String number)
    {
       contacts.put(name, number);
    }
    
    /**
     * Look up a person's number by name
     */
    public String lookupNumber(String name)
    {
        String number = contacts.get(name);
        return number;
    }
}
