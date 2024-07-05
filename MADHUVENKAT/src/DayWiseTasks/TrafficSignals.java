package DayWiseTasks;

public class TrafficSignals {
        public static void main(String[] args) {
            // Initialize variables
            String[] lights = {"RED", "YELLOW", "GREEN"};
            int currentLightIndex = 0;
            int greenDuration = 10; // Duration of green light in seconds
            int yellowDuration = 3; // Duration of yellow light in seconds
            int redDuration = 10; // Duration of red light in seconds

//            long limit = System.currentTimeMillis();
//            long seconds = limit/1000;
//            System.out.println("limit "+ seconds);

            // Simulation loop
            while (true) {
                // Display current light
                System.out.println("Current light: " + lights[currentLightIndex]);

                // Determine the duration for which the current light should stay on
                int duration;
                switch (currentLightIndex) {
                    case 0: // RED light
                        duration = redDuration;
                        break;
                    case 1: // YELLOW light
                        duration = yellowDuration;
                        break;
                    case 2: // GREEN light
                        duration = greenDuration;
                        break;
                    default:
                        duration = 0;
                        break;
                }

                // Wait for the specified duration
                try {
                    Thread.sleep(duration * 1000); // Convert seconds to milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Move to the next light
                currentLightIndex = (currentLightIndex + 1) % lights.length;
            }
        }
    }


