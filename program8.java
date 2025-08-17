 class Program8 {
  public static void main(String args[]) {
    
    int arr[] = new  int[] {1, 2, 3, 4, 5};
     int evenSum = 0, i; 

    System.out.print("Array elements: ");
    for( i  = 0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    for(i = 0; i<arr.length; i++) {
      if(arr[i] % 2 == 0) {
        evenSum += arr[i];
      }
    }
    System.out.println("\nAll even number Sum: "+evenSum);
  }
}

