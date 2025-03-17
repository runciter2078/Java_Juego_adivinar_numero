# Java - Juego adivinar número

Este proyecto es un juego sencillo en Java en el que el usuario debe adivinar un número secreto generado aleatoriamente entre 1 y 100. El juego ofrece 5 intentos para acertar, proporcionando pistas tras cada intento fallido, y una pista adicional en el tercer intento.

## Características

- **Juego interactivo:** El usuario tiene 5 intentos para adivinar el número secreto.
- **Pistas progresivas:** Tras cada intento fallido se indica si el número secreto es mayor o menor que la conjetura. Además, en el tercer intento se revela la primera cifra del número secreto como ayuda.
- **Código limpio y modular:** La implementación es sencilla y fácil de entender, lo que facilita futuras modificaciones o mejoras.

## Requisitos

- Java JDK 8 o superior.

## Instalación y Ejecución

1. Clona el repositorio:

   ```bash
   git clone https://github.com/runciter2078/Java_Juego_adivinar_numero.git
   ```

2. Navega al directorio del proyecto:

   ```bash
   cd Java_Juego_adivinar_numero
   ```

3. Compila el código:

   ```bash
   javac NumberGuessingGame.java
   ```

4. Ejecuta el juego:

   ```bash
   java NumberGuessingGame
   ```

## Descripción del Juego

El objetivo del juego es adivinar un número secreto generado aleatoriamente entre 1 y 100. El usuario dispone de 5 intentos. En cada intento se le informa si el número secreto es mayor o menor que el número introducido. Si el usuario falla en el tercer intento, se le ofrece una pista adicional indicando la primera cifra del número secreto. Si se agotan los intentos sin adivinar, se muestra el número secreto.

## Licencia

Este proyecto se distribuye bajo la [Licencia MIT](LICENSE).
