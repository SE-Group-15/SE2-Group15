/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Ahmed
 */
public class InService {
        private float reading;

    // Constructor
    public InService(float reading) {
        this.reading = reading;
    }

    // Setter and Getter for reading
    public void setReading(float reading) {
        this.reading = reading;
    }

    public float getReading() {
        return reading;
    }

    // Function to update reading
    public void update(float newReading) {
        this.reading = newReading;
    }
}
