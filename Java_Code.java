import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_ATTEMPTS = 5;
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        boolean acertado = false;

        System.out.println("El juego consiste en adivinar un número secreto entre 1 y 100.");
        System.out.println("Tienes " + MAX_ATTEMPTS + " intentos para acertar.");

        // Bucle de intentos
        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            // Mensaje especial en el último intento
            if (attempt == MAX_ATTEMPTS) {
                System.out.print("Oh, oh... ÚLTIMO intento, escribe un número entre 1 y 100: ");
            } else {
                System.out.print("Intento " + attempt + ". Escribe un número entre 1 y 100: ");
            }
            
            // Leer el número introducido
            guess = sc.nextInt();

            // Comprobamos si se ha acertado
            if (guess == secretNumber) {
                System.out.println("¡Felicidades, has acertado!");
                acertado = true;
                break;
            } else {
                // Si no se ha acertado y no es el último intento, se ofrecen pistas
                if (attempt < MAX_ATTEMPTS) {
                    if (secretNumber > guess) {
                        System.out.println("El número secreto es MAYOR que " + guess);
                    } else {
                        System.out.println("El número secreto es MENOR que " + guess);
                    }
                    
                    // Proporcionamos una pista extra en el tercer intento
                    if (attempt == 3) {
                        String secretStr = Integer.toString(secretNumber);
                        char primeraCifra = secretStr.charAt(0);
                        System.out.println("Pista: La primera cifra del número secreto es " + primeraCifra);
                    }
                } else {
                    // Último intento fallido: mostramos el número secreto
                    System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + secretNumber);
                }
            }
        }
        
        sc.close();
    }
}
