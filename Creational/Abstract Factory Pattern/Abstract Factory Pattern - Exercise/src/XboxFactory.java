public class XboxFactory implements GamingFactory {

    @Override
    public GameController createController() {
        return new XboxController();
    }

    @Override
    public GameDisc createDisc() {
        return new XboxDisc();
    }
}