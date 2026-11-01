package visitor;

public interface CinemaHall {
    void accept(HallVisitor visitor);
}