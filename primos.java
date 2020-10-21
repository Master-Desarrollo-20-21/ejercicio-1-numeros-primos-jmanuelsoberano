public class primos {

	public static void main(String[] args) {
    System.out.println("La suma de los números primos que hay entre los 50 primeros números: " + sumPrimeNumbersFirstFiftyNumbers());
		System.out.println();
		System.out.println("La suma de los 50 primeros números primos: " + sumFirstFiftyPrimeNumbers());
	}
  
  public static int sumPrimeNumbersFirstFiftyNumbers() {
    int sum = 0;
    for (int i=1; i <= 50; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }
  
  public static int sumFirstFiftyPrimeNumbers() {
    int i = 0, sum = 0, counter = 1;
    while (i < 50) {
      if (isPrime(counter)) {
        sum += counter;
        i++;
      }
      counter++;      
    }
    return sum;
  }

  public static boolean isPrime(int numero) {
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)) {
      if (numero % contador == 0) {
        primo = false;        
      }
      contador++;
    }
    return primo;
  }

}
