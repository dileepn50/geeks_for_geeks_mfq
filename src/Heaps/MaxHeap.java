package Heaps;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        size = 0;
    }

    private void insert(int item) {
        heap[++size] = item;
        int current = size;

        while (current > 1 && heap[current] > heap[current / 2]) {
            int temp = heap[current];
            heap[current] = heap[current / 2];
            heap[current / 2] = temp;
            current /= 2;
        }
    }

    private void remove() {
        System.out.println("inside remove");
        int maxElement = heap[1];
        heap[1] = heap[size--];
        heapify();

    }
    private void heapify() {
        int pos = 1;
        int i = pos;
        int left, right;

        while (i < size) {
            left = i * 2;
            right = i * 2 + 1;
            pos = i;
            System.out.println("before i = " + i);
            if (left < size && heap[i] < heap[left])
                i = left;
            if (right <= size && heap[i] < heap[right])
                i = right;
            System.out.println("pos = " + pos);
            System.out.println("i = " + i);
            System.out.println("swapping " + heap[pos] + " and " + heap[i]);
            int temp = heap[pos];
            heap[pos] = heap[i];
            heap[i] = temp;
            if (i == pos)
                return;

        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        maxHeap.insert(19);
        maxHeap.insert(43);
        maxHeap.insert(12);
        maxHeap.insert(71);
        maxHeap.insert(35);
        maxHeap.insert(23);
        maxHeap.insert(56);
        maxHeap.insert(36);

        for (int i = 1; i <= maxHeap.size; i++)
            System.out.println(maxHeap.heap[i]);
        maxHeap.remove();
        System.out.println("after heapify");
        for (int i = 1; i <= maxHeap.size; i++)
            System.out.println(maxHeap.heap[i]);


    }
} 