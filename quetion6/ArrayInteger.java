package quetion6;

public class ArrayInteger {

        public static void main(String[] args) {
            int[] array = {3, 7, 1, 9, 4};
            int index = 2;

            int[] modifiedArray = deleteElement(array, index);

            System.out.println("Modified Array:");
            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }
        }

        public static int[] deleteElement(int[] array, int index) {
            if (index < 0 || index >= array.length) {
                System.out.println("Invalid index.");
                return array;
            }

            int[] modifiedArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    modifiedArray[j] = array[i];
                    j++;
                }
            }

            return modifiedArray;
        }
    }

