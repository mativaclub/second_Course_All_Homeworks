package Algorithms_3;
import Algorithms_1.InvalidIndexException;
import Algorithms_1.ItemNotFoundException;
import Algorithms_1.StorageIsFullException;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList {
    private Integer[] storage; //making String array, which will be the storage
    private int arraySize;   //variable for the size
    private final int currentPosition; //for knowing on which position we added an item

    public IntegerListImpl(int listSize) { //making constructor for using a size
        this.storage = new Integer[listSize];// initializing storage with new String array for using size and keeping new elements
        this.arraySize = listSize;//informing that this variable size initialized with size from constructor, which size array was
        currentPosition = 0; //starting from this position
    }

    // Добавление элемента. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(Integer item) {
        validateItem(item);
        growIfNeeded();
        storage[arraySize++] = item; //adding an item to the storage in current position. [currentPosition++]
        return item; //returning added item
    }

    // Добавление элемента на определенную позицию списка. Если выходит за пределы фактического количества элементов
    // или массива, выбросить исключение. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(int index, Integer item) {
        growIfNeeded();
        validateIndex(index);
        validateItem(item);
        if (index == arraySize) {
            storage[arraySize++] = item;
            return item;
        }
        System.arraycopy(storage, index, storage, index + 1, arraySize - index);
        storage[index] = item; //putting on needed position our item
        arraySize++;
        return item;
    }

    // Установить элемент на определенную позицию, затерев существующий. Выбросить исключение, если индекс больше
    // фактического количества элементов или выходит за пределы массива.
    @Override
    public Integer set(int index, Integer item) {
        validateIndex(index);
        validateItem(item);
        storage[index] = item;
        return item;
    }

    // Удаление элемента. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public Integer remove(Integer item) {
        validateItem(item);
        int index = indexOf(item);
        return remove(index);
    }

    // Удаление элемента по индексу. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public Integer remove(int index) {
        validateIndex(index);
        Integer item = storage[index];
        if(index != arraySize){
            System.arraycopy(storage, index + 1, storage, index, arraySize - index);
        }
        arraySize--;
        return item;
    }

    // Проверка на существование элемента.Вернуть true/false;
//    @Override
//    public boolean contains(Integer item, String Inspection_Selection_Bubbles) {
//        for (int i = 0; i < currentPosition; i++) {
//            if (item.equals(storage[i])) {
//                return true;
//            }
//        }
//        return false;
//    }

    // Поиск элемента. Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < currentPosition; i++) {
            if (item.equals(storage[i])) {
                return i;
            }
        }
        return -1;
    }

    // Поиск элемента с конца. Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int lastIndexOf(Integer item) {
        for (int i = currentPosition - 1; i >= 0; i--) {
            if (item.equals(storage[i])) {
                return i;
            }
        }
        return -1;
    }

    // Получить элемент по индексу. Вернуть элемент или исключение, если выходит за рамки фактического
    // количества элементов.
    @Override
    public Integer get(int index) {
        validateIndex(index);
        return storage[index];
    }

    // Сравнить текущий список с другим. Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equals(IntegerList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return arraySize;
    }

    @Override
    public boolean isEmpty() {
        return arraySize == 0;
    }

    // Удалить все элементы из списка.
    @Override
    public void clear() {
        arraySize = 0;
    }

    // Создать новый массив из строк в списке и вернуть его.
    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(storage, arraySize);
    }

    @Override
    public IntegerList integerListCopy(IntegerList list) {
        return null;
    }

    @Override
    public Integer[] getStorage() {
        return new Integer[0];
    }

    private void validateItem(Integer item) {
        if (item == null) {
            throw new ItemNotFoundException();
        }
    }

    private void validateIndex(int index) {
        if (index > arraySize || index < 0) {
            throw new InvalidIndexException();
        }
    }

    private void growIfNeeded() {
        if (arraySize == storage.length) {
          grow();
        }
    }


    @Override
    public boolean contains(Integer item, String Inspection_Selection_Bubbles) {
        switch (Inspection_Selection_Bubbles) {
            case "Inspection":
                sortInsertion(storage);
                break;
            case "Selection":
                sortSelection(storage);
                break;
            case "Bubbles":
                sortBubbles(storage);
                break;
        }

        int min = 0;
        int max = storage.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (item == storage[mid]) {
                return true;
            }

            if (item < storage[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;

//        for (Integer el : storage) {
//            if (item.equals(el)) {
//                return true;
//            }
//        }
//        return false;
    }

    private static void sortInsertion(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    private void sortSelection(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    private void sortBubbles(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    private static void swapElements(Integer[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

//    private void sort(Integer[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i;
//            while ((j > 0 && arr[j - 1] >= temp)) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = temp;
//        }
//    }

    private void sort(Integer[] arr) {
        quickSort(arr, 0, arr.length - 1);
        }


    private boolean binarySearch(Integer[] arr, Integer item) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (item.equals(arr[mid])) {
                return true;
            }
            if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    private void grow() {
        storage = Arrays.copyOf(storage, arraySize + arraySize / 2);
    }


    private void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex -1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i+1, end);
        return i + 1;
    }



}
