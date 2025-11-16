import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    List<FileComponent> components = new ArrayList<FileComponent>();

    Folder(String name) {
        this.name = name;
    }

    public void addFile(FileComponent file) {
        components.add(file);
    }

    public void removeFile(FileComponent file) {
        components.remove(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : components) {
            component.showDetails();
        }
    }
}