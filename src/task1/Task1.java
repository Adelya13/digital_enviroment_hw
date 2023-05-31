package task1;

import task1.entity.Answer;
import task1.entity.Module;
import task1.entity.Question;
import task1.entity.ValueQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    private static ArrayList<Module> modules = new ArrayList<>();
    public static void main(String[] args) {
        addAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = sc.nextLine();

        System.out.println("____________");

        System.out.println("Приветсвуем " + name);
        System.out.println("Пройдите тест и получите оценку");
        System.out.println("В ответах пишите одно число!");

        boolean done = false;
        while (!done){
            for (Module module : modules) {
                ArrayList<ValueQuestion> valueQuestions = module.getValueQuestions();

                for (ValueQuestion valueQuestion : valueQuestions) {
                    System.out.println(valueQuestion.getQuestion().getName());

                    for (int i = 0; i < valueQuestion.getQuestion().getAnswers().size(); i++) {
                        Answer answer = valueQuestion.getQuestion().getAnswers().get(i);
                        System.out.println(answer.getId() + " " + answer.getName());
                    }
                    int userAnswer = sc.nextInt();
                    if (userAnswer == valueQuestion.getQuestion().getRightAnswer()) {
                        valueQuestion.setMark(1.0);
                    }
                }
            }

            for (Module module : modules) {

                Double moduleResult = 0.0;
                for (ValueQuestion valueQuestion : module.getValueQuestions()) {
                    moduleResult += valueQuestion.getMark();
                }
                if (moduleResult > moduleResult / 2) {
                    done = true;
                }

                System.out.print(module.getName() + " : " + moduleResult);
                if (done) {
                    System.out.print(" , поздравляю, вы прошли\n");
                } else System.out.print(" , к сожалению вы не прошли, попробуйте заново\n");
                module.setDone(done);
            }
        }

    }



    private static void addAll(){
        ArrayList<ValueQuestion> questions = new ArrayList<>();
        ArrayList<Answer> answers = new ArrayList<>();

        answers.add(new Answer(
                1,
                "любимые ПРОФЕССОРА"
        ));
        answers.add(new Answer(
                2,
                "НАИБОЛЕЕ РЕШИТЕЛЬНО поступил"
        ));
        answers.add(new Answer(
                3,
                "в ДВУХСТАХ метрах"
        ));
        answers.add(new Answer(
                4,
                "на ИХ территории"
        ));
        answers.add(new Answer(
                5,
                "ОБГРЫЗАННОЕ яблоко"
        ));

        questions.add(new ValueQuestion (new Question(
                1,
                "В одном из выделенных ниже слов допущена ошибка в образовании формы слова. Напишите номер этого слова",
                 answers,
                5
        ), 0.0));
        answers.clear();
        answers.add( new Answer(
              1,
            "несколько НОЖНИЦ"
        ));
        answers.add( new Answer(
              2,
            "умелые ПОВАРА"
        ));

        answers.add( new Answer(
              3,
            "быстро ВЫЗДОРОВИТ"
        ));

        answers.add( new Answer(
              4,
            "в ПОЛУТОРА часах"
        ));
        answers.add( new Answer(
              5,
            "ПЯТЬ барышень"
        ));

        questions.add(new ValueQuestion (new Question(
                2,
                "В одном из выделенных ниже слов допущена ошибка в образовании формы слова. Напишите номер этого слова.",
                 answers,
                3
        ), 0.0));

        answers.clear();

        answers.add( new Answer(
              1,
            "несколько ЯБЛОК"
        ));
        answers.add( new Answer(
              2,
            "лежит на ШКАФЕ"
        ));

        answers.add( new Answer(
              3,
            "до тысяча восемьсот ДВЕНАДЦАТОГО года"
        ));

        answers.add( new Answer(
              4,
            "БОГАТЕЙШИЙ выбор"
        ));
        answers.add( new Answer(
              5,
            "БОГАТЕЙШИЙ выбор"
        ));

        questions.add(new ValueQuestion ( new Question(
                3,
                "В одном из выделенных ниже слов допущена ошибка в образовании формы слова. Напишите номер этого слова",
                 answers,
                2
        ), 0.0));

        modules.add(new Module(
                "Морфологические нормы",
                questions
        ));

        questions.clear();

        answers.clear();

        answers.add( new Answer(
                1,
                "Отправляясь на охоту, он надел ветровку БОЛОТНОГО цвета."
        ));
        answers.add( new Answer(
                2,
                "Зимой в ЛЕДЯНОМ дворце часто проходят соревнования по фигурному катанию."
        ));

        answers.add( new Answer(
                3,
                "Петр — человек мягкий, тонкий, весьма ДИПЛОМАТИЧНЫЙ."
        ));

        answers.add( new Answer(
                4,
                "Вон уж в окно смотрит ВЫСОКИЙ месяц."
        ));
        answers.add( new Answer(
                5,
                "ЛИЧНОСТНЫЙ рост — это процесс, который позволяет развивать свою личность в направлении самореализации и самопознания."
        ));

        questions.add(new ValueQuestion ( new Question(
                4,
                "В каком из приведённых ниже предложений НЕВЕРНО употреблено выделенное слово. ",
                answers,
                2
        ), 0.0));

        answers.clear();

        answers.add( new Answer(
                1,
                "Различные ИНФОРМАЦИОННЫЕ источники предлагали весьма противоречивые сведения."
        ));
        answers.add( new Answer(
                2,
                "В новом коллективе я ощущал себя достаточно КОМФОРТНО."
        ));

        answers.add( new Answer(
                3,
                "До глубокой старости он оставался таким же словоохотливым, ПАМЯТНЫМ и энергичнымЙ."
        ));

        answers.add( new Answer(
                4,
                "Эксперты работали с УДВОЕННОЙ энергией, чтобы успеть к сроку."
        ));
        answers.add( new Answer(
                5,
                "Участникам соревнования были вручены ПАМЯТНЫЕ значки."
        ));

        questions.add(new ValueQuestion ( new Question(
                5,
                "В каком из приведённых ниже предложений НЕВЕРНО употреблено выделенное слово. ",
                 answers,
                3
        ), 0.0));

        answers.clear();

        answers.add( new Answer(
                1,
                "Его ПОПУЛЯРНЫЕ взгляды были хорошо известны и не пользовались поддержкой коллег."
        ));
        answers.add( new Answer(
                2,
                "ЗАПЛАТИТЬ за лечение не было возможности."
        ));

        answers.add( new Answer(
                3,
                "Со мною в гостинице жил ДИПЛОМАНТ конкурса молодых исполнителей."
        ));

        answers.add( new Answer(
                4,
                "ГУМАНИТАРНАЯ помощь была доставлена в районы стихийного бедствия."
        ));
        answers.add( new Answer(
                5,
                "Перед комбинатом стояла практически невыполнимая задача — НАРАЩИВАНИЕ мощности при отсутствии материальной базы."
        ));

        questions.add(new ValueQuestion ( new Question(
                5,
                "В каком из приведённых ниже предложений НЕВЕРНО употреблено выделенное слово. ",
                 answers,
                1
        ), 0.0));

        modules.add(new Module(
                "Употребление паронимов",
                questions
        ));

    }
}
