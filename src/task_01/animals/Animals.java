package task_01.animals;

public enum Animals {
    WOLF(3), BIRD(1), CAT(5);

    int age;

    Animals (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.name() + ", age = " + age;
    }
}

