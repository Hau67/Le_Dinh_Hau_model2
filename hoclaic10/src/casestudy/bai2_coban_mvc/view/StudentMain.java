package casestudy.bai2_coban_mvc.view;

import casestudy.bai2_coban_mvc.exception.IsExistedPhoneNumber;

import java.io.IOException;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        StudentView studentView = new StudentView();
        try {
            studentView.displayView();
        } catch (IsExistedPhoneNumber e) {
            throw new RuntimeException(e);
        }
    }
}
