package visitor;

public class CleaningVisitor implements HallVisitor {
    @Override
    public void visit(StandardHall hall) {
        System.out.println("🧹 Уборка StandardHall: пылесосим " + hall.getSeatCount() + " обычных кресел и моем пол.");
    }

    @Override
    public void visit(VIPHall hall) {
        System.out.println("✨ Уборка VIPHall: бережная химчистка " + hall.getSofaCount() + " кожаных диванов и полировка столиков.");
    }
}