## Assignment 4: Facade Pattern

**3. Clean Code Requirements**

**1. Meaningful names making the API self-explanatory:**
Методы фасада (`startMovie` и `endMovie`) названы максимально понятно. Клиенту сразу ясно, что делает метод, без необходимости изучать, как именно запускается оборудование.

**2. Single Responsibility Principle (SRP):**
Фасад (`MovieSessionFacade`) занимается исключительно координацией вызовов в правильном порядке. Он не дублирует логику включения света или звука — эта ответственность лежит строго на соответствующих классах подсистемы (`LightingSystem`, `SoundSystem`)[cite: 8].

**3. No leaking of subsystem details:**
Публичный интерфейс фасада полностью скрывает сложность оборудования от клиента. Класс `MainClient` не знает о существовании `Projector` или `TicketSystem` — он вызывает только простые методы фасада[cite: 8].

**4. Small, focused subsystem classes with clear responsibilities:**
Классы подсистемы очень компактные и сфокусированы каждый на своей конкретной задаче аппаратуры. Они полностью автономны и ничего не знают о существовании фасада или друг друга[cite: 8].

**5. Information Hiding & Encapsulation:**
Объекты подсистем внутри класса `MovieSessionFacade` объявлены как `private final`. Это защищает их от прямого доступа и изменения извне, гарантируя целостность работы всего кинотеатра.