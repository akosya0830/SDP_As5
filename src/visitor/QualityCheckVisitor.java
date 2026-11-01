package visitor;

public class QualityCheckVisitor implements HallVisitor {
    @Override
    public void visit(StandardHall hall) {
        System.out.println("🔊 Проверка StandardHall: тестирование стандартного проектора и звука 5.1.");
    }

    @Override
    public void visit(VIPHall hall) {
        System.out.println("🎬 Проверка VIPHall: калибровка IMAX-проектора и проверка кнопок вызова официанта у " + hall.getSofaCount() + " VIP-диванов.");
    }
}