**3. Clean Code Requirements (Justification of 5 Principles for the Bridge Pattern)**

**1. Clear separation of abstraction-side vs. implementation-side responsibilities:**
The responsibilities are strictly separated. The `Notification` hierarchy (abstraction) is responsible solely for the business logic and formatting the message content (what to send). Meanwhile, the `MessageSender` interface and its implementations are responsible exclusively for the technical delivery mechanism (how to send). No implementor details leak to the client or the abstraction side.

**2. Meaningful names distinguishing Abstraction vs. Implementor roles:**
Class names clearly reflect their roles in the Bridge pattern. Names like `MessageSender`, `EmailSender`, and `TelegramSender` clearly indicate their implementor role (message delivery). Names like `Notification`, `BookingConfirmation`, and `PromoAlert` reflect the business entities on the abstraction side.

**3. Small, focused classes on both sides of the bridge:**
The Single Responsibility Principle is maintained. Each class performs exactly one task. For example, `EmailSender` only simulates sending an email and consists of just a single, short `sendMessage()` method.

**4. No duplicated logic between Concrete Implementors:**
There is no duplicated code between the concrete implementors (`EmailSender` and `TelegramSender`). Each class contains only the unique logic for its specific communication channel. The base logic of storing the reference to the sender is extracted into the abstract parent class `Notification`, which prevents constructor duplication in its subclasses.

**5. Backward-compatible design (Open-Closed Principle):**
The architecture is open for extension but closed for modification. If a new communication method needs to be added in the future (e.g., an `SmsSender`), we only need to create one new concrete implementor class. Adding this new implementor requires no changes to the `Notification` abstraction or its existing subclasses.

---
