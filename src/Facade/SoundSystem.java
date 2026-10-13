package Facade;

public class SoundSystem {
    public void turnOn() {
        System.out.println("🔊 Аудиосистема: Включена.");
    }

    public void setVolume(int level) {
        System.out.println("🔊 Аудиосистема: Установлен уровень громкости " + level + ".");
    }

    public void setSurroundSound() {
        System.out.println("🔊 Аудиосистема: Включен режим объемного звучания (Dolby Atmos).");
    }

    public void turnOff() {
        System.out.println("🔊 Аудиосистема: Выключена.");
    }
}