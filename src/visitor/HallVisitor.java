package visitor;

public interface HallVisitor {
    void visit(StandardHall hall);
    void visit(VIPHall hall);
}