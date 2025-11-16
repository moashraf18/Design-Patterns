public class TextEditor {
    private ITextFormatter textFormatter;

    public TextEditor(ITextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void formatText(String text) {
        System.out.println("Formatted text: " + textFormatter.format(text));
    }
}
