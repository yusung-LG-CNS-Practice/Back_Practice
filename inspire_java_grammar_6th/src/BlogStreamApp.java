import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import features.blogs.domain.dto.BlogResponseDTO;

// 8월 20일 실습 코드
public class BlogStreamApp {

    public static void main(String[] args) {

        ArrayList<BlogResponseDTO> blogs = new ArrayList<>(List.of(
                BlogResponseDTO.builder().BlogId(1).title("react").content("state").email("Na").viewCnt(10).build(),
                BlogResponseDTO.builder().BlogId(2).title("java").content("oop").email("kim").viewCnt(20).build(),
                BlogResponseDTO.builder().BlogId(3).title("spring").content("mybatis").email("lee").viewCnt(30).build(),
                BlogResponseDTO.builder().BlogId(4).title("docker").content("devops").email("park").viewCnt(40).build(),
                BlogResponseDTO.builder().BlogId(5).title("msa").content("kafka").email("lim").viewCnt(50).build()));

        /*
         * Q1번) 조회수가 30이상인 데이터만 추출할려면?
         */
        System.out.println();
        System.out.println("debug >>>> filter : 조건검색");

        // 내가 한 실습코드
        // for(int idx = 0; idx < blogs.size(); idx++){
        // if(idx.viewCnt >= 30){

        // }
        // }

        // 강사님이 한 실습 코드
        blogs.stream().filter(blog -> blog.getViewCnt() >= 30).forEach(System.out::println);
        // .forEach(blog -> System.out.println(blog)); 이렇게 해도 같은 결과

        System.out.println();
        System.out.println("debug >>>> map : 타입변환 용도");
        blogs.stream().filter(blog -> blog.getViewCnt() >= 30).map(BlogResponseDTO::getEmail)
                .forEach(System.out::println);
        // .map(blog -> blog.getEmail()) 이렇게 해도 같은결과

        /*
         * Q2번) 이메일 계정이 lim인 사용자만 추출해서 리스트로 반환해서 출력
         */
        System.out.println();
        System.out.println("debug >>>> collect : 리스트 반환");

        // 내가 한 코드
        // List<BlogResponseDTO> result = blogs.stream()
        // .filter(blog -> "lim".equals(blog.getEmail()))
        // .collect(Collectors.toList());

        // System.out.println(result);

        // 강사님이 한 코드
        List<BlogResponseDTO> result = blogs.stream().filter(blog -> blog.getEmail().equals("lim"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println();
        System.out.println("debug >>>> Collectors.groupingBy : 작성자별 그룹");
        Map<String, List<BlogResponseDTO>> map = blogs.stream()
                .collect(Collectors.groupingBy(BlogResponseDTO::getEmail));
        map.get("park").stream().forEach(System.out::println);

        /*
         * Q3번) 조회수의 평균을 확인하고 싶다면?
         */
        System.out.println();
        System.out.println("debug >>>> average : 조회수 평균");

        // 내가 한 코드
        // double avg = blogs.stream()
        // .mapToInt(BlogResponseDTO::getViewCnt)
        // .average()
        // .orElse(0.0);

        // System.out.println("조회수 평균 : " + avg);

        // 강사님이 한 코드
        double avg = blogs.stream().mapToInt(BlogResponseDTO::getViewCnt).average().orElse(0);
        System.out.println(avg);

        // 연습
        System.out.println();
        System.out.println("debug >>>> 이메일을 추출하는데 중복된 데이터는 한번만 출력하고 싶다면?");
        blogs.stream().map(BlogResponseDTO::getEmail).distinct().forEach(System.out::println);

        System.out.println();
        System.out.println("debug >>>> sort, reserved");
        blogs.stream().sorted(Comparator.comparing(BlogResponseDTO::getViewCnt).reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("debug >>>> anyMatch(존재여부 판단), allMatch(검증)");
        System.out.println("debug >>>> Q) 블로그 작성자(lim) 존재여부를 판단하고 싶다면?");
        boolean isEmail = blogs.stream().anyMatch(blog -> blog.getEmail().equals("lim"));
        System.out.println(isEmail);

        boolean isExists = blogs.stream().allMatch(blog -> blog.getViewCnt() >= 10);
        System.out.println(isExists);

        boolean isUnder = blogs.stream().noneMatch(blog -> blog.getViewCnt() < 10);
        System.out.println(isUnder);

        /*
        NullPointException 회피
        Optional
        - 메서드 호풀시 반환값을 확신할 수 없을 때 사용하는 문법
        - null.method() : null 값 처리를 놓쳐서 발생하는 예외를 피하고자 할 때
        - 메서드의 반환타입으로만 사용(전역변수, 매개변수)
        - 사용의도에 맞게 사용해야 함(null 할당 x)
        */

        Optional<String> optional = Optional.of("lgcns");
        // if(optional.isPresent()){
        //     System.out.println(optional.get());
        // }
        // optional.ifPresent(value -> System.out.println(value));
        optional.ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("값이 없습니다."));

        optional = Optional.empty();
        String err = optional.orElseThrow(() -> new RuntimeException("값이 없습니다"));
        System.err.println(err);
    }
}
