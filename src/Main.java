public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        int[] array = new int[100000];
        for (int i = 0; i <array.length;i++){
            array[i] = (int) Math.floor(Math.random());
        }

        for (int i =0; i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopwatch.stop();

        System.out.println("Start time: " + stopwatch.start());
        System.out.println("End time: " + stopwatch.stop());
        System.out.println("Time to operate: " + stopwatch.getElapsedTime());

    }
}
