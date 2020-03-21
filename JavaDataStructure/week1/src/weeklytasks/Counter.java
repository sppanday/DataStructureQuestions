package weeklytasks;

public class Counter {

    private int value = 0;
    private String thisName;

    public Counter() {
    }

    public Counter(int entryValue) {
        value = entryValue;
    }

    public Counter(int entryValue, String name) {
        value = entryValue;
        thisName = name;
    }

    public String getName() {
        return thisName;
    }

    public void bump(int howMuch) {
        value = value + howMuch;
    }

    public void bump() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
