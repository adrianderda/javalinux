package Zadania_23;

public class Lista {

    int first;
    int[] table = new int[10];
    int last;

    public void addElement(int element) {
        table[first] = element;
        first++;
        last++;
    }

    public void listStatus() {
        for (int i = 0; i < last; i++) {
            System.out.println(table[i]);
        }
    }

    public void deleteFromList(int index) {
        for (int i = 0; i < last; i++) {
            if (i == index) {
                for (int j = i; j < last - 1; j++) {
                    table[j] = table[j + 1];
                    last--;
                }
            }
        }
    }

    public void search(int value) {
        for (int i = 0; i < last; i++) {
            if (table[i] == value) {
                System.out.println("Znalazem liczbe na indeksie " + i);
            }
        }
    }

    public void removeDuplicates() {
        for (int i = 0; i < last; i++) {
            for (int j = i + 1; j < last; j++) {
                if (table[i] == table[j]) {
                    table[j] = table[last - 1];
                    last--;
                    j--;
                }
            }
        }
    }
}




