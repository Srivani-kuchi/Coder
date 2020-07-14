package LC;

public class Clock {

    public static void main(String[] args){
        System.out.println(angleClock(12,30));
    }

    public static double angleClock(int hour, int minutes) { // 12.30
        final double totalMinutes = 60;
        final double degPerHour = 30; //360/12 = 1hr = 30deg
        final double degPerMin = 6; // 1min = 6deg

        // degrees covered by hour hand
        double minuteAngle = degPerMin*minutes; // 30*6 = 180deg
       // System.out.println(minuteAngle);
        double hourAngle = degPerHour*(hour%12) + ((minutes/totalMinutes)*degPerHour); // 15
       // System.out.println(hourAngle);
        // asking for difference
        double difference = Math.abs(minuteAngle - hourAngle); // 180-15 = 165
        if(difference > 180){
            return 360 - difference;
        }
        return difference;




    }
}
