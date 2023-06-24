package Algorithms_1;

import java.util.Arrays;

public class StringArrayListImpl implements StringList {
    private String[] arrayStorage; //making String array, which will be the storage
    private int arraySize; //variable for the size
    private int currentPosition; //for knowing on which position we added an item

    public StringArrayListImpl(int size) { //making constructor for using a size
        this.arrayStorage = new String[size]; // initializing storage with new String array for using size and keeping new elements
        this.arraySize = size; //informing that this variable size initialized with size from constructor, which size array was
        currentPosition = 0; //starting from this position
    }
    // Добавление элемента. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(String item) {
        validateItem(item);
        validateSize();
        arrayStorage[arraySize++] = item; //adding an item to the storage in current position. [currentPosition++]
        return item; //returning added item
    }


    // Добавление элемента на определенную позицию списка. Если выходит за пределы фактического количества элементов
    // или массива, выбросить исключение. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(int index, String item) {
        validateSize();
        validateIndex(index);
        validateItem(item);
        if (index == arraySize) {
            arrayStorage[arraySize++] = item;
            return item;
        }
        System.arraycopy(arrayStorage, index, arrayStorage, index + 1, arraySize - index);
        arrayStorage[index] = item; //putting on needed position our item
        arraySize++;
        return item;

//        if (currentPosition == arraySize - 1) { //checking if position is minus
//            throw new InvalidIndexException();
//        }
//        for (int i = currentPosition; i >= index; i--) { // shifting to the right all elements after this index
//            // for adding for needed position(to the center) But starting from the end/currentPosition to the index
//            arrayStorage[i + 1] = arrayStorage[i]; //to the right position adding current position for shifting to the right
//        }
    }



    // Установить элемент на определенную позицию, затерев существующий. Выбросить исключение, если индекс больше
    // фактического количества элементов или выходит за пределы массива.
    @Override
    public String set(int index, String item) {
       validateIndex(index);
        validateItem(item);
        arrayStorage[index] = item;
        return item;
    }


    // Удаление элемента. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public String remove(String item) {
//        int removeIndex = -1;
//        boolean existElement = false;  //flag that from the beginning there is no element
//        for (int i = 0; i < arrayStorage.length; i++) {
//            if (item.equals(arrayStorage[i])) {
//                removeIndex = i;
//                existElement = true;
//                break;
//            }
//        }
//        if (!existElement) { //if there is no such element , because now exist element isn't true
//            throw new ItemNotFoundException(); //only if existElement was false
//        }
//        for (int i = removeIndex + 1; i < currentPosition; i++) { //from next element after needed index to current, because after it there is no element
//            arrayStorage[i - 1] = arrayStorage[i]; //Предыдущую кладем в текущую
//        }
//        arrayStorage[currentPosition] = null;
//        currentPosition--;
//        return item;


        validateItem(item);
        int index = indexOf(item);
        return remove(index);
//        if(index == -1){
//            throw new ItemNotFoundException();
//        }
//        if(index != arraySize){
//            System.arraycopy(arrayStorage, index + 1, arrayStorage, index, arraySize - index);
//        }
//        arraySize--;
//        return item;

    }



    // Удаление элемента по индексу. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = arrayStorage[index];
        if(index != arraySize){
            System.arraycopy(arrayStorage, index + 1, arrayStorage, index, arraySize - index);
        }
        arraySize--;
        return item;
//        if (index < 0 || index >= arrayStorage.length || index > currentPosition) { //because there is no element after currentPosition
//            throw new ItemNotFoundException();
//        }
//        for (int i = index + 1; i < currentPosition; i++) { //from next element after needed index to current, because after it there is no element
//            arrayStorage[i - 1] = arrayStorage[i]; //Предыдущую кладем в текущую
//        }
//        arrayStorage[currentPosition] = null;
//        currentPosition--;
//        return arrayStorage[index];
    }


    // Проверка на существование элемента.Вернуть true/false;
    @Override
    public boolean contains(String item) {
        for (int i = 0; i < currentPosition; i++) {
            if (item.equals(arrayStorage[i])) {
                return true;
            }
        }
        return false;
    }


    // Поиск элемента. Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int indexOf(String item) {
        for (int i = 0; i < currentPosition; i++) {
            if (item.equals(arrayStorage[i])) {
                return i;
            }
        }
        return -1;
    }


    // Поиск элемента с конца. Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int lastIndexOf(String item) {
        for (int i = currentPosition - 1; i >= 0; i--) {
            if (item.equals(arrayStorage[i])) {
                return i;
            }
        }
        return -1;
    }


    // Получить элемент по индексу. Вернуть элемент или исключение, если выходит за рамки фактического
    // количества элементов.
    @Override
    public String get(int index) {
        validateIndex(index);
        return arrayStorage[index];
    }


    // Сравнить текущий список с другим. Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equals(StringList otherList) {
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
    public String[] toArray() {
        return Arrays.copyOf(arrayStorage, arraySize);
    }


    private void validateItem(String item) {
        if (item == null) {
            throw new ItemNotFoundException();
        }
    }

    private void validateIndex(int index) {
        if (index > arraySize || index < 0) {
            throw new InvalidIndexException();
        }
    }

    private void validateSize() {
        if (arraySize >= arrayStorage.length) {
            throw new StorageIsFullException();
        }
    }

}
