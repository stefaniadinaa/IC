/**
 * <h1>CircularLinkedList</h1>
 * The CircularLinkedList program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Stefania
 * @version 1.0
 * @since   2022-05-17
 */
public class CircularLinkedList {
    /*This method is used to define a circularLinkedList*/
    private Node head = null;
    private Node tail = null;

/* This method is used to add a node in a list
* *@param value This is the value of the node
* *@return Nothing */
    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }
    /* Search a value in list
    * @param searchValue This is the value for searching
    * @return boolean This return true if the node exist in list, false if not */
    public boolean containsNode(int searchValue) {
        Node currentNode = head;

        if (head == null) {
            return false;
        } else {
            do {
                if (currentNode.value == searchValue) {
                    return true;
                }
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
            return false;
        }
    }
    /* Delete a node from list
    * @param valueToDelete
    * return Nothing*/
    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
        if (head == null) {
            return;
        }
        do {
            Node nextNode = currentNode.nextNode;
            if (nextNode.value == valueToDelete) {
                if (tail == head) {
                    head = null;
                    tail = null;
                } else {
                    currentNode.nextNode = nextNode.nextNode;
                    if (head == nextNode) {
                        head = head.nextNode;
                    }
                    if (tail == nextNode) {
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }
    /* Return the next currentNode
    * @param currentNode
    * @return Node This returns the next node for the currentNode*/
    public Node getNode(Node currentNode){
        return currentNode.nextNode;
    }

}