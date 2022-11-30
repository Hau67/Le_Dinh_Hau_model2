package TuHoc.Bai1.ss10.exception;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException() {
        super("Not found student in database");
    }
}
