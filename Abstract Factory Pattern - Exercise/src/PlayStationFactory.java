public class PlayStationFactory implements GamingFactory {

    @Override
    public GameController createController() {
        return new PlayStationController();
    }

    @Override
    public GameDisc createDisc() {
        return new PlayStationDisc();
    }
}