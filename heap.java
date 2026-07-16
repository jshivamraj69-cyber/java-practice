public class heap {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 10, 2 };
        float[] heap = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            heap[i] = arr[i];
        }
        int n = heap.length;

        System.out.print("Original array: ");
        printHeap(heap);

        heapSort(heap, n);

        System.out.print("Sorted array: ");
        printHeap(heap);
    }

    public static void heapify(float[] heap, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < n && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            float temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            heapify(heap, n, largest);
        }
    }

    public static void buildHeap(float[] heap, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(heap, n, i);
        }
    }

    public static void heapSort(float[] heap, int n) {
        buildHeap(heap, n);
        for (int i = n - 1; i > 0; i--) {
            float temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapify(heap, i, 0);
        }
    }

    public static void printHeap(float[] heap) {
        for (float value : heap) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
