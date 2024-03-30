public class Main {
    public static void main(String[] args) {
        double V = 10.0;
        double alpha = 45.0;
        double dt = 0.1;
        double m = 1.0;
        double gx = 0.0;
        double gy = -9.8;
        double k = 0.1;
        euler(V, alpha, dt, m, gx, gy, k);
        midpoint(V, alpha, dt, m, gx, gy, k);
    }

    public static void euler(double V, double alpha, double dt, double m, double gx, double gy, double k){
        double t = 0.0;
        double x = 0.0;
        double y = 0.0;
        double ax = 0.0;
        double ay = 0.0;
        double vx = V * Math.cos(alpha);
        double vy = V * Math.sin(alpha);
        while (y >= 0.0){
            ax = gx - k * vx / m;
            ay = gy - k * vy / m;
            vx = vx + ax * dt;
            vy = vy + ay * dt;
            x = x + vx * dt;
            y = y + vy * dt;
            t = t + dt;
            System.out.println(t + " " + x + " " + y);
        }
    }

    public static void midpoint(double V, double alpha, double dt, double m, double gx, double gy, double k){
        double t = 0.0;
        double x = 0.0;
        double y = 0.0;
        double ax = 0.0;
        double ay = 0.0;
        double vx = V * Math.cos(alpha);
        double vy = V * Math.sin(alpha);
        while (y >= 0.0){
            ax = gx - k * vx / m;
            ay = gy - k * vy / m;
            double vxMid = vx + ax * dt / 2;
            double vyMid = vy + ay * dt / 2;
            double axMid = gx - k * vxMid / m;
            double ayMid = gy - k * vyMid / m;
            vx = vx + axMid * dt;
            vy = vy + ayMid * dt;
            x = x + vxMid * dt;
            y = y + vyMid * dt;
            t = t + dt;
            System.out.println(t + " " + x + " " + y);
        }
    }
}