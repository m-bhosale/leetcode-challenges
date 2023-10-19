package challenges;

/*
    You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
    Check if these points make a straight line in the XY plane.
 */
public class CheckStraightLine {

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) {
            return true;
        }

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            if ((y1 - y0) * (xi - x0) != (yi - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean output = checkStraightLine(coordinates);
        System.out.println("Output : " + output);
    }

}
