package Facade;

public class MovieSessionFacade {
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final LightingSystem lightingSystem;
    private final TicketSystem ticketSystem;

    // Фасад сам создает нужные объекты подсистемы (скрывает сложность)
    public MovieSessionFacade() {
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.lightingSystem = new LightingSystem();
        this.ticketSystem = new TicketSystem();
    }

    // Упрощенный метод для запуска всего сеанса
    public void startMovie(String movieTitle) {
        System.out.println("\n--- ПОДГОТОВКА К СЕАНСУ: " + movieTitle.toUpperCase() + " ---");
        ticketSystem.checkTickets();
        ticketSystem.lockDoors();
        lightingSystem.dimForMovie();
        projector.turnOn();
        projector.setInput("Digital Cinema Package (DCP)");
        projector.widescreenMode();
        soundSystem.turnOn();
        soundSystem.setVolume(75);
        soundSystem.setSurroundSound();
        System.out.println("🎬 Фильм \"" + movieTitle + "\" начался!\n");
    }

    // Упрощенный метод для завершения сеанса
    public void endMovie() {
        System.out.println("--- ЗАВЕРШЕНИЕ СЕАНСА ---");
        projector.turnOff();
        soundSystem.turnOff();
        lightingSystem.turnOnFull();
        ticketSystem.unlockDoors();
        System.out.println("✅ Зал готов к следующему сеансу.\n");
    }
}
