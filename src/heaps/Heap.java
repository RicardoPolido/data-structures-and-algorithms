package heaps;

/*
    - A complete binary tree.
    - Must satisfy the heap property.
    - Max heap: Every parent is greater than or equal to its children.
    - Min heap: Every parent is less than or equal to its children.

    - A binary heal must be a complete tree.
    - Children are added at each level from left to right
    - Usually implemented as arrays.
    - The maximum or minimum value will always be at the root of the tree - the advantage of using a heap.
    - Heapify: Process of converting a binary tree into a heap - this often has to be done after an insertion or deletion.
    - No required ordering between siblings.

    * Storing heaps as arrays:

        - We can store binary heaps as arrays.
        - We put the root at array[0].
        - We then transverse each level from left to right, and so the left child of the root would go into array[1],
its right child would to into array[2], etc.

        - For the node at array[i]:

        left child: 2i + 1
        right child: 21 + 2

        parent = floor((i-1)/2)

    * Delete:

        - Must choose a replacement value.
        - Will take the rightmost value, so that the tree remains complete.
        - Then we must heapify the heap.
        - When replacement value is greater than parent, fix heap above. Otherwise, fix heap below.

        - Fix heap abose -> same as insert. Swap replacement value with parent.
        - Fix heap below -> Swap the replacement value with the larger of its two children.
        - Rinse and repeat in both cases until the replacement value is in its correct position.
        - Will only need to fix up or down, not both.
 */

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];

        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    public int delete(int index) {

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;

    }

    public void sort() {
        int lastHeapIndex = size - 1;

        for (int i = 0; i < lastHeapIndex; i++) {
            int tmp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = tmp;

            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {

        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }

                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }


}
