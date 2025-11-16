import java.util.ArrayList;
import java.util.List;

public class NameCollection implements IterableCollection {

    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator createIterator() {
        return new NameIterator(names);
    }
}