import com.belhard.exception.StudentException;
import com.belhard.exception.TeacherException;

public class AgeUtil {

    public static void checkAge (int age) {
        try {
            checkAgeTeacher(age);
            checkAgeStudent(age);


        } catch (TeacherException | StudentException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Конец");
        }
    }
    private static void checkAgeTeacher ( int age) throws TeacherException {
        if (age > 70) {
            throw new TeacherException("Пенсионный возраст");
        }
    }
    private static void checkAgeStudent ( int age) throws StudentException {
        if (age > 16) {
            throw new StudentException("Поступающий абитуриент");
        }
    }
}
