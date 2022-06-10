package utils;

import models.Answers;
import models.Questions;

public class FeedBankQuestions {

        /**
         * Este metodo es para configurar las preguntas para el juego
         * @return
         */
    public static Questions[] getInfoQuestions() {
        Questions[] questions = {

                new Questions("1",
                        "¿Cuántos litros de sangre tiene una persona adulta?", new Answers[]{
                        new Answers(" Tiene 10 litros", 'A', false),
                        new Answers("Tiene entre 4 y 6 litros", 'B', true),
                        new Answers(" Tiene entre 2 y 4 litros", 'C', false),
                        new Answers(" Tiene 7 litros", 'D', false),
                }),
                new Questions("1",
                        "¿Quién es el autor de la frase 'Pienso, luego existo'?", new Answers[]{
                        new Answers("Platón", 'A', false),
                        new Answers("Galileo Galilei", 'B', false),
                        new Answers("Sócrates", 'C', false),
                        new Answers("Descartes", 'D', true),
                }),
                new Questions("1",
                        "¿Cuántos decimales tiene el número pi π?", new Answers[]{
                        new Answers(" Infinitos", 'A', true),
                        new Answers(" Cien", 'B', false),
                        new Answers(" Veinte", 'C', false),
                        new Answers(" Mil", 'D', false),
                }),
                new Questions("1",
                        "¿A quién se le atribuye la frase 'Solo sé que no sé nada'?", new Answers[]{
                        new Answers(" Sócrates", 'A', true),
                        new Answers(" Sófocles", 'B', false),
                        new Answers(" Nietszche", 'C', false),
                        new Answers(" Aristóteles", 'D', false),
                }),
                new Questions("1",
                        "¿Cuál es la montaña más alta del continente americano?", new Answers[]{
                        new Answers(" Monte Everest", 'A', false),
                        new Answers(" Pico Bolívar", 'B', false),
                        new Answers(" Aconcagua", 'C', true),
                        new Answers(" Monte Fuji", 'D', false),
                }),
                new Questions("2",
                        "La frase 'A las mujeres no las entiende nadie' se utiliza porque…", new Answers[]{
                        new Answers("Joden mucho", 'A', false),
                        new Answers("No saben expresar lo que sienten", 'B', true),
                        new Answers("Tienen hambre", 'C', false),
                        new Answers("Todas las anteriores", 'D', false),
                }),
                new Questions("2",
                        "La frase 'Todos los hombres son perros' se usa porque...", new Answers[]{
                        new Answers("Los hombres son mujeriegos por naturaleza", 'A', false),
                        new Answers("Las mujeres dan con el mas perro", 'B', false),
                        new Answers("Ninguna de las anteriores", 'C', false),
                        new Answers("Los hombres no valoran lo que tienen en casa", 'D', true),

                }),
                new Questions("2",
                        "En los brasieres de las mujeres ¿Cómo se identifica su tallaje?", new Answers[]{
                        new Answers("Numeros", 'A', true),
                        new Answers("Letras", 'B', false),
                        new Answers("Numeros & Letras", 'C', false),
                        new Answers("Depende el tamaño", 'D', false),
                }),
                new Questions("2",
                        "¿En que año fue la primera liberacion femenina?", new Answers[]{
                        new Answers("1914", 'A', false),
                        new Answers("1600", 'B', false),
                        new Answers("1960", 'C', true),
                        new Answers("2005", 'D', false),
                }),
                new Questions("2",
                        "¿una buena mujer que busca en un hombre para comprometerce?", new Answers[]{
                        new Answers("un hombre trabajador, respetuoso, amoroso y detallista", 'A', true),
                        new Answers("Un hombre con plata, que le guste las fiestasy tomar", 'B', false),
                        new Answers("Un hombre agresivo, golpeador, fumadory patan", 'C', false),
                        new Answers("El mas ñero del barrio", 'D', false),
                }),
                new Questions("3",
                        "¿Cuál es la película más taquilllera de la historia?", new Answers[]{
                        new Answers("Avatar", 'A', false),
                        new Answers("Avengers", 'B', true),
                        new Answers("Dragon Ball", 'C', false),
                        new Answers("Bamby", 'D', false),
                }),
                new Questions("3",
                        "¿Quién dirigió la película Origen en el 2010?", new Answers[]{
                        new Answers("Leonardo Davinchi", 'A', false),
                        new Answers("Adam Sander", 'B', false),
                        new Answers("Christopher Nolan.", 'C', true),
                        new Answers("David Hasselhoff", 'D', false),
                }),
                new Questions("3",
                        "¿Qué padre e hijo protagonizaron la película En Busca de la Felicidad?", new Answers[]{
                        new Answers("Willy Smith y su hijo Jadeny Smith.", 'A', false),
                        new Answers("El oso Yogui y su hijo Bubu", 'B', false),
                        new Answers("Ninguna de las anteriores", 'C', false),
                        new Answers("Will Smith y su hijo Jaden Smith.", 'D', true),

                }),
                new Questions("3",
                        "¿Por qué película ganó Leonardo DiCaprio su primer Óscar?", new Answers[]{
                        new Answers("El renacido", 'A', true),
                        new Answers("Titanic", 'B', false),
                        new Answers("El lobo de walt strep", 'C', false),
                        new Answers("¿Que paso ayer?", 'D', false),
                }),
                new Questions("3",
                        "¿En qué película podemos encontrar a un payaso asesino llamado Pennywise?", new Answers[]{
                        new Answers("Mi villano favorito", 'A', false),
                        new Answers("IT", 'B', true),
                        new Answers("Metegol", 'C', false),
                        new Answers("Los simpson", 'D', false),
                }),
                new Questions("4",
                        "¿Cómo se escribe el nombre de Dios Traducido de su idioma natal?", new Answers[]{
                        new Answers("YHWH", 'A', true),
                        new Answers("Yave", 'B', false),
                        new Answers("Señor", 'C', false),
                        new Answers("Zorg", 'D', false),
                }),
                new Questions("4",
                        "¿Qué dia nacio Jesus?", new Answers[]{
                        new Answers("el 24 de Diciembre", 'A', false),
                        new Answers("No se registra en la historia", 'B', true),
                        new Answers("El 25 de enero", 'C', false),
                        new Answers("en Navidad", 'D', false),
                }),
                new Questions("4",
                        "¿Cuántos Apostoles en total hubieron?", new Answers[]{
                        new Answers("13", 'A', false),
                        new Answers("11", 'B', false),
                        new Answers("15", 'C', false),
                        new Answers("12", 'D', true),
                }),
                new Questions("4",
                        "¿Cómo se llama el angel que anuncio el nacimiento de jesus?", new Answers[]{
                        new Answers("Matuzalem", 'A', false),
                        new Answers("Miguel", 'B', true),
                        new Answers("Judas", 'C', false),
                        new Answers("Caifaz", 'D', false),
                }),
                new Questions("4",
                        "¿De que edad murio Jesus?", new Answers[]{
                        new Answers("40", 'A', false),
                        new Answers("23", 'B', false),
                        new Answers("33", 'C', true),
                        new Answers("28", 'D', false),
                }),
                new Questions("5",
                        "¿Cómo se llama el Festival mas grande realizado todos los años?", new Answers[]{
                        new Answers("Rock al parke", 'A', false),
                        new Answers("Metalica", 'B', false),
                        new Answers("Tomorrowland", 'C', true),
                        new Answers("Carnabal de Barranquilla", 'D', false),
                }),
                new Questions("5",
                        "¿En que año nacio la Electronica?", new Answers[]{
                        new Answers("Finales de los 80", 'A', false),
                        new Answers("Finales de los 70", 'B', true),
                        new Answers("Finales de 2000", 'C', false),
                        new Answers("No se sabe", 'D', false),
                }),
                new Questions("5",
                        "¿La cancion 'Du hast' fue creada por?..", new Answers[]{
                        new Answers("Kongos", 'A', false),
                        new Answers("Mago de oz", 'B', false),
                        new Answers("Los norteños", 'C', false),
                        new Answers("Rammstein", 'D', true),

                }),
                new Questions("5",
                        "ED Sheeran es un compositor del genero..", new Answers[]{
                        new Answers("Pop", 'A', true),
                        new Answers("Romantica", 'B', false),
                        new Answers("Metalica", 'C', false),
                        new Answers("Disco", 'D', false),
                }),
                new Questions("5",
                        "¿Qué tipo de genero es el Trap", new Answers[]{
                        new Answers("un genero para hacer aseo", 'A', false),
                        new Answers("un genero sexual", 'B', false),
                        new Answers("Un genero mas grosero directo y denigrante", 'C', true),
                        new Answers("Musica para niños", 'D', false),
                })
        };
        return questions;
    }
}
