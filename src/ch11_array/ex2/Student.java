package ch11_array.ex2;

public class Student {
    /**
     * 필드
     * 관리번호(id)
     * 이름(studentName)
     * 학번(studentNumber)
     * 학과(studentMajor)
     * 전화번호(studedntMobile)
     *
     * getter/setter
     *
     * 생성자 2가지
     *
     * toString
     */
    private Long id;
    private String studentName;
    private String studentNumber;
    private String studedntMajor;
    private String studedntMobile;

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

    public String getStudedntMajor() {
        return studedntMajor;
    }

    public void setStudedntMajor(String studedntMajor) {
        this.studedntMajor = studedntMajor;
    }

    public String getStudedntMobile() {
        return studedntMobile;
    }

    public void setStudedntMobile(String studedntMobile) {
        this.studedntMobile = studedntMobile;
    }

    public Student(){

    }
    public Student(Long id, String studentName, String studentNumber, String studedntMajor, String studedntMobile){
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studedntMajor = studedntMajor;
        this.studedntMobile = studedntMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studedntMajor='" + studedntMajor + '\'' +
                ", studedntMobile='" + studedntMobile + '\'' +
                '}';
    }
}
