import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeSortTest {

    @Test
    void testSort() {

        List<Integer> inputList = new ArrayList<>(List.of(2,3,4,5,6,7,8,9));
        List<Integer> list = new ArrayList<>(List.of(6,4,5,3,2,7,8,9));
        TreeSort<Integer> treeSort = new TreeSort<>();
        Assertions.assertEquals(inputList,treeSort.sort(list));
    }
}