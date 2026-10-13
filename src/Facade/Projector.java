package Facade;

public class Projector {
    public void turnOn() {
        System.out.println("🎥 Проектор: Питание включено, лампа разогревается.");
    }

    public void setInput(String source) {
        System.out.println("🎥 Проектор: Источник сигнала изменен на [" + source + "].");
    }

    public void widescreenMode() {
        System.out.println("🎥 Проектор: Переход в широкоформатный режим (16:9).");
    }

    public void turnOff() {
        System.out.println("🎥 Проектор: Питание выключено.");
    }
}