public class  Sort{
    public static void sorter (int[] array) {
        boolean isSorter = false;
        int bufferr;
        while (!isSorter) {
            isSorter = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i]>array[i + 1]) {
                    bufferr = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bufferr;
                    isSorter = false;
                }
            }
        }
    }
    }



