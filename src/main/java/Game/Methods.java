package Game;

import models.Answers;

import java.util.HashMap;
import java.util.Random;

import static utils.FeedBankQuestions.getInfoQuestions;

public class Methods {

    /**
     * Este método obtiene una pregunta aleatoria según el nivel del juego
     * @param level
     * @return
     */
    public static Object getQuestionLevel(String level){
        Random generator = new Random();
        Object[] values = formListQuestion(level).keySet().toArray();

        return values[generator.nextInt(values.length)];
    }

    /**
     * Caracteriza las preguntas por nivel
     * @param level
     * @return
     */
    public static HashMap<String, Answers[]> formListQuestion(String level){

        HashMap<String, Answers[]> groupQuestions = new HashMap<String, Answers[]>();
        for (int i=0;i<25;i++) {
            if (getInfoQuestions()[i].getLevel().equals(level)) {
                groupQuestions.put(getInfoQuestions()[i].getDescription(),getInfoQuestions()[i].getAnswers());
            }
        }
        return groupQuestions;
    }
}
