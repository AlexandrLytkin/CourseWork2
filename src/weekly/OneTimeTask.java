package weekly;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task{


    public OneTimeTask(String name, String description, LocalDateTime date, TaskType type, RepeatType repeatType) {
        super(name, description, date, type, repeatType);
        this.repeatType = RepeatType.ONE_TIME;
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return this.date.toLocalDate().equals(localDate);
    }
}