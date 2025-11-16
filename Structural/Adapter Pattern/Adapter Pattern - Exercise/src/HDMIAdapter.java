// Adapter
public class HDMIAdapter implements HDMI {
    private VGA vga = new VGA();

    @Override
    public void connectWithHDMICable() {
        vga.connectWithVGACable();
    }
}
