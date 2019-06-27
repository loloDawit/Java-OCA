package app;

class ArrayPerson {
    private Person[] array;
    private int nElements;

    public ArrayPerson(int max) {
        array = new Person[100];
        nElements = 0;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            array[i].displayPerson();
        }
        System.out.println();
    }

    public boolean insert(String lName, String fName, int age) {
        array[nElements] = new Person(lName, fName, age);
        nElements++;
        return true;
    }

    public Person find(String searchName) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (array[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == nElements) {
            return null;
        } else {
            return array[i];
        }
    }

    public boolean delete(String searchName) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (array[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == nElements) {
            return false;
        } else {
            for (int k = i; k < nElements - 1; k++) {
                array[k] = array[k + 1];
                nElements--;
            }
        }
        return true;
    }

}