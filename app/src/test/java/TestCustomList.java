import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestCustomList {
    private CustomList list;

    @BeforeAll
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int size = list.getCount();
        list.addCity(new City("hello", "goodbye"));
        assertEquals(list.getCount(), size + 1);
    }

    @Test
    public void hasCityTest(){
        list.addCity(new City("Edmonton","AB"));
        assertTrue(list.hasCity(new City("Edmonton","AB")));
    }
}
