package visitor;

public class VIPHall implements CinemaHall {
    private int sofaCount = 15; // Количество VIP-диванов

    public int getSofaCount() {
        return sofaCount;
    }

    @Override
    public void accept(HallVisitor visitor) {
        visitor.visit(this);
    }
}