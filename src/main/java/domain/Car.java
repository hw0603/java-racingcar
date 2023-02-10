package domain;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private static final int MAX_LENGTH = 5;
    private final String name;
    private int position;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name) {
        if (Objects.isNull(name)) {
            throw new IllegalStateException("자동차 이름 Null 오류");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 빈 문자열일 수 없습니다.");
        }
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move() {
        ++this.position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


    @Override
    public int compareTo(Car o) {
        return position - o.getPosition();
    }
}