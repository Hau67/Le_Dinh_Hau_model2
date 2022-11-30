package TuHoc.Bai1.ss10.exception;

public class ExistedStudentException extends Exception {
    public ExistedStudentException() {
        super("The student is available");
    }
}
