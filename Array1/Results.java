public class Results {

  public void sum(int[] array, int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum = sum + array[i];
    }
    System.out.println("Sum:" + sum);
  }

  public void average(int[] array, int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum = sum + array[i];
    }
    int average = sum / size;
    System.out.println("Average:" + average);
  }

  public void smallestElem(int[] array, int size) {
    int temp = array[0];
    for (int i = 0; i < size; i++) {
      if (array[i] < temp) {
        temp = array[i];
      }
    }
    System.out.println("Smallest Element: " + temp);
  }

  public void largestElem(int[] array, int size) {
    int large = array[0];
    for (int i = 0; i < size; i++) {
      if (array[i] > large) {
        large = array[i];
      }
    }
    System.out.println("Largest Element: " + large);
  }

  public void primeNumbers(int[] array, int size) {
    int j, p;
    System.out.print("Prime Numbers: ");
    for (int i = 0; i < size; i++) {
      j = 2;
      p = 1;
      while (j < array[i]) {
        if (array[i] % j == 0) {
          p = 0;
          break;
        }
        j++;
      }
      if (p == 1) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();
  }

  public void reverseElem(int[] array, int size) {
    System.out.print("Reverse order: ");
    for (int i = size - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public void ascendingOrder(int[] array, int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        int temp = 0;
        if (newArray[i] > newArray[j]) {
          temp = newArray[i];
          newArray[i] = newArray[j];
          newArray[j] = temp;
        }
      }
    }
    System.out.print("Ascending order: ");
    for (int i = 0; i < size; i++) {
      System.out.print(newArray[i] + " ");
    }
  }
}
