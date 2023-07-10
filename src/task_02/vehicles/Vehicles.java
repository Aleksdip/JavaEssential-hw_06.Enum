package task_02.vehicles;

public enum Vehicles {
    BMW(100000) {
        @Override
        public String getColor() {
            return "Black";
        }
    }, OPEL(5000) {
        @Override
        public String getColor() {
            return "White";
        }
    }, FIAT(7000) {
        @Override
        public String getColor() {
            return "Green";
        }
    };

    int price;

    Vehicles(int price) {
        this.price = price;
    }

    public abstract String getColor();

    @Override
    public String toString() {
        return super.name() + ", color = " + getColor() + ", price = " + price;
    }
}

