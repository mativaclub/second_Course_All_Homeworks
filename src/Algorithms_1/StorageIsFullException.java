package Algorithms_1;

public class StorageIsFullException extends RuntimeException {
    public StorageIsFullException() {
    }

    public StorageIsFullException(String message) {
        super(message);
    }
}
