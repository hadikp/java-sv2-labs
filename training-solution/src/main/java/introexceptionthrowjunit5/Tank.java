package introexceptionthrowjunit5;

public class Tank {
    private int angle; //lövegcső állása fokban

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;

        if (angle < -80 || angle > 80) {
            throw new IllegalArgumentException("Nem jó a szám amit megadtál! Ennyit nem fordul az ágyú.");
        }
    }

    public int getAngle() {
        return angle;
    }
}
