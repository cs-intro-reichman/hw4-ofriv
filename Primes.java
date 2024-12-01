public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[N + 1];

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = false;
            } else {
                arr[i] = true;
            }
        }

        for (int j = 2; j < arr.length; j++) {
            if (arr[j] == true) {
                for (int i = j * 2; i < arr.length; i += j) {
                    arr[i] = false; 
                }
            }
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        int percentP = (count * 100) / (arr.length - 1) ;
        
        System.out.println("There are " + count + " primes between 2 and " + (arr.length - 1) + " ("+ percentP + "% are primes)");
    }
}