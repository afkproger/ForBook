import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @org.junit.jupiter.api.Test
    void testToMakeInorder() {
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> integersForInorderWalk = new ArrayList<>(List.of(5,4,6,7,1,2,9,8,3,10));
        Tree<Integer> tree = new Tree<>();
        tree = tree.toCreateTreeFromList(integersForInorderWalk);
        assertEquals(integers,tree.toMakeInorder());
    }
}