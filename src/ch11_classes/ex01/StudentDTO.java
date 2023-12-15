package ch11_classes.ex01;

public class StudentDTO {
    private Long id;
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public StudentDTO() {
    }

    private static Long idValue = 1L;
    public StudentDTO(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.id = idValue++;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
    
    // DTO : 단순히 데이터를 옮기기 위한 객체를 생성하는 용도만 만드는 클래스
    // Main : 실행 시 무조건 Main클래스의 main메소드 실행, 화면에 보여지는 부분
    // Repsitory : 데이터를 옮기는 DTO를 리스트로 저장하는 클래스
    // Service : Main에서 사용할 기능들(메소드)를 모아놓은 클래스
}



