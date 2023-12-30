package First;

import java.util.Scanner;

public class T17E__PhysicsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the initial velocity and time
        System.out.print("Enter the initial velocity (m/s): ");
        double initialVelocity = scanner.nextDouble();

        System.out.print("Enter the time (s): ");
        double time = scanner.nextDouble();

        // Calculate the final position using the formula:
        // final_position = initial_velocity * time + (1/2) * acceleration * time^2
        double acceleration = 9.8; // Acceleration due to gravity (m/s^2)
        double finalPosition = initialVelocity * time + (0.5 * acceleration * Math.pow(time, 2));

        // Check if the object is above the ground (final position > 0)
        boolean isAboveGround = finalPosition > 0;

        // Check if the object is at rest (final velocity = 0)
        boolean isAtRest = initialVelocity + (acceleration * time) == 0;

        // Output the results
        System.out.println("Final position: " + finalPosition + " m");
        System.out.println("Is above ground: " + isAboveGround);
        System.out.println("Is at rest: " + isAtRest);
    }
}
