package ch14_Inheritance.ex01;

public class ChildClass extends  ParentClass{
    public ChildClass(){
        System.out.println("자식 기본 생성자");
    }
    ChildClass childClass = new ChildClass();
    //메서드 재정의
    @Override
    public void hello(){
        System.out.println("childClass.hello");
    }


}
