package Praktikum03;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setMerek("Yamaha");
        motor1.setStatusMesin(true);
        motor1.setKecepatan(-10); // Nilai negatif
        motor1.displayInfo(); // Kecepatan harus 0

        Motor motor2 = new Motor();
        motor2.setMerek("Honda");
        motor2.setStatusMesin(false);
        motor2.setKecepatan(50); // Mesin off, kecepatan harus 0
        motor2.displayInfo(); // Kecepatan harus 0

        Motor motor3 = new Motor();
        motor3.setMerek("Suzuki");
        motor3.setStatusMesin(true);
        motor3.setKecepatan(120); // Melebihi batas maksimal
        motor3.displayInfo(); // Kecepatan harus 100
    }
}


