class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
        soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie) {
        System.out.println("Initializing Movie Mode...");
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(20);
        dvdPlayer.play(movie);
    }
}