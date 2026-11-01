package visitor;

public class StandardHall implements CinemaHall {
    private int seatCount = 100; // Количество обычных кресел

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public void accept(HallVisitor visitor) {
        // Зал передает самого себя (this) в нужный метод посетителя
        visitor.visit(this);
    }
}