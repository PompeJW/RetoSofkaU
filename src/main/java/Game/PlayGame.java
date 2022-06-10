package Game;

import models.Answers;
import java.util.Scanner;
import static Game.Methods.formListQuestion;
import static Game.Methods.getQuestionLevel;
import static utils.AddLoggerInFile.setHistory;
import static utils.Constants.NUMBER_ROUNDS;
import static utils.Constants.PRIZE_VALUE;

public class PlayGame {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego, tendrás que responder 5 preguntas, estas son las " +
                "indicaciones: " + "El juego constara de 5 preguntas, cada pregunta tiene un valor de 100 puntos " +
                "¡Animo¡");
        
        System.out.println("Ingresa tu nombre: ");
        String name = keyboard.next();
        
        int acum = 0;
        char correctAnswer;
        //Ejecuta las roondas
        for (int i = 1; i <= NUMBER_ROUNDS; i++) {
            correctAnswer = 'N';

            System.out.println("Nivel # " + i);
            //Obtiene la pregunta segun el nivel
            Object variable = getQuestionLevel(String.valueOf(i));
            System.out.println(variable + " (Ingresa sólo la letra)");

            Answers[] list = formListQuestion(String.valueOf(i)).get(variable);
            //Obtiene las respuestas de la pregunta seleccionada
            for (int y = 0; y < list.length; y++) {
                System.out.println(list[y].getLetra() + ": " + list[y].getRespuesta());
                if (list[y].getCorrecta()) {
                    correctAnswer = list[y].getLetra();
                }
            }

            char answerChosen = keyboard.next().toUpperCase().charAt(0);
            //Realiza las validaciones de las respuestas
            if (answerChosen == correctAnswer) {
                System.out.println("¡FELICITACIONES! , PASASTE LA RONDA");
                acum = acum + PRIZE_VALUE;
                System.out.println("HAS GANADO " + PRIZE_VALUE + " PUNTOS");
                System.out.println("TU ACUMULADO ES " + acum);
                if (i!=NUMBER_ROUNDS) {
                    System.out.println("¿DESEAS CONTINUAR CON EL JUEGO? S/N");
                } else {
                    System.out.println("INGRESA CUALQUIER LETRA PARA TERMINAR EL JUEGO");
                }
                String continueGame = keyboard.next().toUpperCase();
                if (continueGame.equalsIgnoreCase("N")) {
                    System.out.println("HAS FINALIZADO EL JUEGO VOLUNTARIAMENTE");
                    i = NUMBER_ROUNDS;
                }
            } else if (answerChosen != 'A' && answerChosen != 'B' && answerChosen != 'C' && answerChosen != 'D') {
                System.out.println("DEBE SELECCIONAR UNA OPCIÓN VÁLIDA (A,B,C,D)");
                i = i - 1;
            } else {
                System.out.println("FALLASTE, PERDISTE LA OPORTUNIDAD Y TUS PUNTOS");
                acum = 0;
                i = NUMBER_ROUNDS;
            }

        }
        System.out.println("VALOR ACUMULADO " + acum + " PUNTOS");
        setHistory(name,String.valueOf(acum));
    }
}
