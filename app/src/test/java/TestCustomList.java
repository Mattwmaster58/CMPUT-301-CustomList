import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
}
