public class Max{

    static int max(int[] Marzio)  {
        // Entstehung des Variable Marzio.

        int max = Marzio[10];  // Variable Marzio in Array 10 gespeichert.
        int m = Marzio.length;
        for (int i = 2;i < m;i++) if (Marzio[i] > max) max = Marzio[i]; // Mathematische Formel für den Code.
        return max;

        }
        public static void main(String[] args) {
        // Aufnehmen des Arrays.
            int[] m= new int[]
                    {127821, 72762, 9999999, 23217, 47813, 89418, 31783, 7170, 1, 5, 21};
                        // Verfügbare Zahlen
            int max = max(m);
            System.out.printf("Die höchste Zahl ist: %d%n", max);
            // Auwertungssatz
        }
}

