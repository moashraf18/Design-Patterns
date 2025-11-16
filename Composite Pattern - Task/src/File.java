import javax.xml.transform.Source;

public class File implements FileComponent {

    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}