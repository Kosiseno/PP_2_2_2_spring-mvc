package web.model;

public class Car {

    private long individualNumber;

    private String mark;

    private String model;

    public Car() {
    }

    public Car(long id, String mark, String model) {
        this.individualNumber = id;
        this.mark = mark;
        this.model = model;
    }

    public long getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(long individualNumber) {
        this.individualNumber = individualNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
