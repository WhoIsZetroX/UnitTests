package noOriginal;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void addAtHead() {
        LinkedList l = new LinkedList("Node 1");
        Assertions.assertEquals(1, l.getSize());
        Assertions.assertEquals("Node 1", l.find(0).getData());
        l.addAtHead("Node 0");
        Assertions.assertEquals(2, l.getSize());
        Assertions.assertEquals("Node 0", l.find(0).getData());
        Assertions.assertEquals("Node 1", l.find(1).getData());
    }

    @org.junit.jupiter.api.Test
    void addAtTail() {
        LinkedList l = new LinkedList("Node 1");
        Assertions.assertEquals(1, l.getSize());
        Assertions.assertEquals("Node 1", l.find(0).getData());
        l.addAtTail("Node 0");
        Assertions.assertEquals(2, l.getSize());
        Assertions.assertEquals("Node 0", l.find(1).getData());
        Assertions.assertEquals("Node 1", l.find(0).getData());
    }

    @org.junit.jupiter.api.Test
    void addAtIndex() {
        LinkedList l = new LinkedList("Node 1");
        Assertions.assertEquals(1, l.getSize());
        Assertions.assertEquals("Node 1", l.find(0).getData());
        l.addAtHead("Node 0");
        l.addAtTail("Node 3");
        l.addAtTail("Node 4");
        l.addAtTail("Node 5");
        l.addAtIndex(2, "Node 2");
        Assertions.assertEquals(6, l.getSize());
        Assertions.assertEquals("Node 0", l.find(0).getData());
        Assertions.assertEquals("Node 1", l.find(1).getData());
        Assertions.assertEquals("Node 2", l.find(2).getData());
        Assertions.assertEquals("Node 3", l.find(3).getData());
        Assertions.assertEquals("Node 4", l.find(4).getData());
        Assertions.assertEquals("Node 5", l.find(5).getData());
    }

    @org.junit.jupiter.api.Test
    void deleteAtIndex() {
        LinkedList l = new LinkedList("Node 1");
        Assertions.assertEquals(1, l.getSize());
        Assertions.assertEquals("Node 1", l.find(0).getData());
        l.addAtHead("Node 0");
        l.addAtTail("Node 2");
        l.addAtTail("Node 3");
        l.addAtTail("Node 4");
        l.deleteAtIndex(2);
        Assertions.assertEquals(4, l.getSize());
        Assertions.assertEquals("Node 0", l.find(0).getData());
        Assertions.assertEquals("Node 1", l.find(1).getData());
        Assertions.assertEquals("Node 3", l.find(2).getData());
        Assertions.assertEquals("Node 4", l.find(3).getData());
    }

}