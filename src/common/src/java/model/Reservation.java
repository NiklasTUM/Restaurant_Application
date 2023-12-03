package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity

public class Reservation {
    private Date date;
    private boolean confirmed;
    private boolean canceled;
    private Long id;

    public boolean createCalenderEvent() {
        return true;
    }

    public void confirm(){

    }

    public void cancel() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
