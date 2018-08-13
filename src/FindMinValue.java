public class FindMinValue {
    public static int minValue(int[] array) {
        int min = array[0];
        int index =0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8};
        int index = minValue(arr);
        System.out.println("giá trị nhỏ nhất trong mảng: "+ arr[index]);

    }
}
