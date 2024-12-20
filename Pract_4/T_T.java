package Pract_4;

public class T_T {
    public static abstract class Transport {
        protected double speed;
        protected double costPerKm;

        public Transport(double speed, double costPerKm) {
            this.speed = speed;
            this.costPerKm = costPerKm;
        }

        public abstract double calculateTime(double distance);
        public abstract double calculateCost(double distance);
    }
    public static class Car extends Transport {
        public Car(double speed, double costPerKm) {
            super(speed, costPerKm);
        }

        @Override
        public double calculateTime(double distance) {
            return distance / speed; // Время = расстояние / скорость
        }

        @Override
        public double calculateCost(double distance) {
            return distance * costPerKm;
        }
    }
    public static class Airplane extends Transport {

        public Airplane(double speed, double costPerKm) {
            super(speed, costPerKm);
        }

        @Override
        public double calculateTime(double distance) {
            return distance / speed; // Время = расстояние / скорость
        }

        @Override
        public double calculateCost(double distance) {
            return distance * costPerKm;
        }
    }
        public static void main(String[] args) {
            Transport car = new Car(80, 0.5);
            Transport airplane = new Airplane(800, 5);
            double distance = 500;
            int passengers = 3;

            System.out.println("Car:");
            System.out.println("Time: " + car.calculateTime(distance) + " hours");
            System.out.println("Cost: " + car.calculateCost(distance) + " deneg");

            System.out.println("\nAirplane:");
            System.out.println("Time: " + airplane.calculateTime(distance) + " hours");
            System.out.println("Cost: " + airplane.calculateCost(distance) + " deneg");

        }

}
