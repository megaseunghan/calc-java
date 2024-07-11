package app.calc.core;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Number> storage;

    public Calculator(List<Number> storage) {
        this.storage = storage;
    }

    public void add(Number result) {
        storage.add(result);
    }

    public void remove(int index) {
        storage.remove(index);
    }

    public void removeFirst() {
        storage.remove(0);
    }

    // 조회 메서드
    public void inquiry() {
        storage.forEach(elem -> System.out.print(elem + " "));
    }

    // Storage Getter
    public List<Number> getStorage() {
        return new ArrayList<>(storage);
    }

    // Storage Setter
    public void setStorage(List<Number> storage) {
        this.storage = storage;
    }

}
