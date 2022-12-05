package weekly;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Yearly extends Task{

    public Yearly(String name, String description, LocalDateTime date, TaskType type, RepeatType repeatType) {
        super(name, description, date, type, repeatType);
        this.repeatType = RepeatType.YEARLY;
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return this.date.toLocalDate().equals(localDate) || (this.date.toLocalDate().isBefore(localDate)
                && this.date.toLocalDate().getDayOfYear() == localDate.getDayOfYear());
    }
}