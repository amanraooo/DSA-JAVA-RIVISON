public class wateringPlants_II {
    public static void main(String[] args) {
       int plants[] = {2,2,3,3}; int capacityA = 5; int capacityB = 5;

       System.out.println(minimumRefill(plants,capacityA,capacityB));
    }
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int start = 0;
        int end = plants.length - 1;

        int cntRefil = 0;

        int capA = capacityA;
        int capB = capacityB;

        while (start < end) {
            // Alice
            if (plants[start] <= capA) {
                capA -= plants[start];
            } else {
                cntRefil++;
                capA = capacityA - plants[start];
            }
            start++;
            // Bob
            if (plants[end] <= capB) {
                capB -= plants[end];
            } else {
                cntRefil++;
                capB = capacityB - plants[end];
            }
            end--;
        }

        // Same plant left
        if (start == end) {
            if (capA >= capB) {
                if (capA < plants[start]) {
                    cntRefil++;
                }
            } else {
                if (capB < plants[start]) {
                    cntRefil++;
                }
            }
        }
        return cntRefil;
    }
}
