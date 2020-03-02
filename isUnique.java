//Write a method named isUnique//

public static boolean isUnique(int[] array) {

    for (int i = 0; i < array.length; i++) {

        int min = array[i];

        

        for (int j = i + 1; j < array.length; j++) {

            if (min > array[j]) {

                array[i] = array[j];

                array[j] = min;

                min = array[i];

            }

        }
    }
    

    for (int i = 0; i < array.length - 1; i++) {

        if (array[i] == array[i + 1]) {

            return false;

        }

    }

    

    return true;

}