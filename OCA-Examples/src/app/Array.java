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

    public int size() {
        return array.length;
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

    // selection sort
    public void sSort() {
        int i;
        for (i = 0; i < nElements - 1; i++) {
            int min = i; // minimum
            for (int j = i + 1; j < nElements; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
        display();
    }

    private void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Binary search
    public int find(int key) {
        int lowerBound = 0;
        int upperBound = nElements - 1;

        int currentIndex;
        while (true) {
            currentIndex = (lowerBound + upperBound) / 2; // set curinx to the middle
            if (array[currentIndex] == key) {
                return currentIndex; // found it
            } else if (lowerBound > upperBound) {
                return nElements; // cant find
            } else {
                if (array[currentIndex] < key) {
                    lowerBound = currentIndex + 1; // it;s in the upper half
                } else {
                    upperBound = currentIndex - 1;
                }
            }
        }
    }

}