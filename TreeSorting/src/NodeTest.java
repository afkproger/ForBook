import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testGetData() {
        Node<Integer> node = new Node<>(5);
        assertEquals(5 , node.getData());
    }
    @Test
    void testGetLeft(){
        Node<Integer> node = new Node<>(5);
        node.setLeft(new Node<Integer>(4));
        assertEquals(new Node<Integer>(4),node.getLeft() );
    }


}