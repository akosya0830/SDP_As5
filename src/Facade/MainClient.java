package Facade;

public class MainClient {
    public static void main(String[] args) {
        // Клиент работает ТОЛЬКО с Фасадом. Ему не нужно управлять проектором или светом напрямую.
        MovieSessionFacade cinemaFacade = new MovieSessionFacade();

        // Запуск фильма одной простой командой
        cinemaFacade.startMovie("Интерстеллар");

        // ... фильм идет ...

        // Завершение фильма одной простой командой
        cinemaFacade.endMovie();
    }
}
