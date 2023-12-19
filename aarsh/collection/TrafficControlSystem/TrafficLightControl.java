package aarsh.collection.TrafficControlSystem;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficLightControl {
    private Queue<Car> carsQueue;

    public TrafficLightControl() {
        carsQueue = new LinkedList<>();
    }

    void addCar(Car car) {
        carsQueue.add(car);
    }

    Car removeCar() {
        if (!isQueueEmpty()) {
            return carsQueue.poll();
        }
        return null;
    }

    int getQueueLength() {
        return carsQueue.size();
    }

    boolean isQueueEmpty() {
        return carsQueue.isEmpty();
    }

    long getWaitingTime(Car car) {
        return System.currentTimeMillis() - car.getArrivalTime();
    }

    long getAverageWaitingTime() {
        int size = carsQueue.size();
        long sum = 0;
        for (Car car : carsQueue) {
            sum = sum + car.getWaitingTime();
        }
        if (getQueueLength() > 0)
            return sum / size;
        else
            return 0;
    }

    public static void main(String[] args) {
        TrafficLightControl tlc = new TrafficLightControl();
        tlc.addCar(new Car("ABC-123"));
        tlc.addCar(new Car("DEF-456"));
        tlc.addCar(new Car("GHI-789"));
        System.out.println("Queue Length: " + tlc.getQueueLength());
        System.out.println("Average Waiting Time: " + tlc.getAverageWaitingTime());
        Car removedCar = tlc.removeCar();
        System.out.println("Removed Car: " + removedCar.getLicensePlate());
        System.out.println("Queue Length: " + tlc.getQueueLength());
        System.out.println("Average Waiting Time: " + tlc.getAverageWaitingTime());
    }
}
