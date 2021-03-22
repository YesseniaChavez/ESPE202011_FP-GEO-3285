package ec.edu.espe.search;

public class BasicSearchLinear {
    public static float searchLinear(float component[], float a) {
        int n = component.length;
        for (int i = 0; i < n; i++) {
            if (component[i] == a) {
                return i;

            }
        }
        return -1;
    }

    public static float binarySearchlinear(float component[], float left, float rigth, float a) {
        if (rigth >= left) {
            int intermediate = (int) (left + (rigth - left) / 2);
            if (component[intermediate] == a) {
                return intermediate;
            }
            if (component[intermediate] > a) {
                return binarySearchlinear(component, left, intermediate - 1, a);
            }
            return binarySearchlinear(component, intermediate + 1, rigth, a);
        }
        return -1;
    }
}

