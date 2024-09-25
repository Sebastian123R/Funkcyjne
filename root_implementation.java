
public class root_implementation {
    static double eps(double x) {
        double epsilon = 0.000001;
        double pierwiastek = x;

        while (Math.abs(pierwiastek * pierwiastek * pierwiastek - x) > epsilon) {
            pierwiastek = (2.0 * pierwiastek + x / (pierwiastek * pierwiastek)) / 3.0;

        }
        return pierwiastek;
    }
    static double n_step(double x, double n) {
        double pierwiastek = x;

        for (int i = 0; i < n; i++) {
            pierwiastek=(2.0 * pierwiastek + x / (pierwiastek * pierwiastek)) / 3.0;
        }
        return pierwiastek;
    }
        public static void main (String[]args){
            System.out.println("Pierwiastek szescienny uzalezniony od epsilon wyosi: " + eps(27));
            System.out.println("Pierwiastek szescienny uzalezniony od ilosci krokow: " + n_step(27,10));
        }
    }