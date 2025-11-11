import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ITextFormatter LCF = new LowerCaseFormat();
        ITextFormatter UCF = new UpperCaseFormat();
        TextEditor textEditor = new TextEditor(LCF);
        TextEditor textEditor2 = new TextEditor(UCF);
        System.out.println("Enter text to be formatted: ");
        Scanner text = new Scanner(System.in);
        textEditor.formatText(text.nextLine());
        textEditor2.formatText(text.nextLine());
    }
}