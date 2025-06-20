import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java
        Scanner scanner = new Scanner(System.in);

        int puntos = 0;
        System.out.println("Bienvenide al juego! Serán 4 preguntas sobre las coders del mundo. Tienes que escribir solo la letra correcta según tu opinión.\n");
        System.out.println("La primera pregunta es:\n 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
       
        String userAnswer1 = scanner.nextLine();
        
        if (userAnswer1.equals("b")) {
         puntos +=5;
        }
       

        System.out.println("La segunda pregunta es:\n 2. ¿Quién es Fuencisla Clemares?");
        String userAnswer2 = scanner.nextLine();
        if (userAnswer2.equals("c")) {
         puntos +=5;
        }

        System.out.println("La tercera pregunta es:\n 3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        String userAnswer3 = scanner.nextLine();
        if (userAnswer3.equals("b") || userAnswer3.equals("d")) {
         puntos +=5;
        }
        
        System.out.println("La cuarta pregunta es:\n 4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        String userAnswer4 = scanner.nextLine();
        if (userAnswer4.equals("a")) {
         puntos +=5;
        }
        System.out.println("Tu puntaje es: " + puntos + "/20");
        if (puntos >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (puntos >= 5) {
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }   

         scanner.close();
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }
    
}