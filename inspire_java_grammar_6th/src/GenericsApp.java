import java.util.ArrayList;
import java.util.List;

import features.generics.ResponseTemplete;
import features.oop.sub.ManagerDTO;
import features.oop.sub.StudentDTO;
import features.oop.sub.TeacherDTO;
import features.oop.sup.PersonDTO;

// 8월 18일 실습 코드

public class GenericsApp {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("debug >>>> Generics App");

        // generic wildcard : extends vs super
        // 메서드의 매개변수 타입선언 및 리턴타입을 지정할 때 자주 사용하는 문법
        // extends : 읽기 전용(T의 하위 타입)
        // super : 쓰기 전용(T의 상위 타입)
        // List<? extends PersonDTO> personList = new ArrayList<PersonDTO>();
        // List<? super PersonDTO> personList = new ArrayList<PersonDTO>();

        // ResponseTemplete<Integer> errCode = new ResponseTemplete<>();
        // errCode.setCode(200);
        // System.out.println("code : " + errCode.getCode());

        // System.out.println();

        // ResponseTemplete<String> errMessage = new ResponseTemplete<>();
        // errMessage.setCode("리소스 생성완료");
        // System.out.println("message : " + errMessage.getCode());

        List<PersonDTO> personList = new ArrayList<PersonDTO>();

        StudentDTO student = StudentDTO.builder().name("inspire").build();
        TeacherDTO teacher = TeacherDTO.builder().name("jslim").build();
        ManagerDTO manger = ManagerDTO.builder().name("lgcns").build();

        personList.add(student);
        personList.add(teacher);
        personList.add(manger);

        // 입력성공 : 201, CREATED, xxxxDTO
        // ResponseTemplete<PersonDTO> response = new ResponseTemplete<PersonDTO>(201,
        // "CREATED", student);

        // 목록조회 : 200, OK, list

        ResponseTemplete<List<PersonDTO>> response = new ResponseTemplete<List<PersonDTO>>(200, "OK", personList);

        List<PersonDTO> lst = response.getData();
        for(int idx = 0; idx < lst.size(); idx++){
            PersonDTO person = lst.get(idx);
            System.out.println(((PersonDTO)person).personInfo());
        }
    }
}
