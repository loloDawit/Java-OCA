package app;

class Array {
    private int[] array;
    private int nElements;

    public Array(int max) {
        array = new int[max];
        nElements = 0;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // insert array elements
    public boolean insert(int value) {
        array[nElements] = value;
        nElements++;
        return true;
    }

    // sort array
    // bubble sort
    public void bSort() {
        int temp;
        for (int i = 0; i < nElements - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        display();
    }

}