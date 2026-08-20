package features.blogs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import features.blogs.domain.dto.BlogRequestDTO;
import features.blogs.domain.dto.BlogResponseDTO;

public class BlogReactDao {

    private List<BlogResponseDTO> blogs;

    public BlogReactDao() {
        blogs = new ArrayList<>(List.of(
                BlogResponseDTO.builder().BlogId(1).title("react").content("state").email("Na").viewCnt(10).build(),
                BlogResponseDTO.builder().BlogId(2).title("java").content("oop").email("kim").viewCnt(20).build(),
                BlogResponseDTO.builder().BlogId(3).title("spring").content("mybatis").email("lee").viewCnt(30).build(),
                BlogResponseDTO.builder().BlogId(4).title("docker").content("devops").email("park").viewCnt(40).build(),
                BlogResponseDTO.builder().BlogId(5).title("msa").content("kafka").email("lim").viewCnt(50).build()));
    }

    public List<BlogResponseDTO> findByAll() {
        System.out.println("debug >>>> blog dao findByAll()");
        return blogs;
    }

    // 8월 20일 실습 코드
    public Optional<BlogResponseDTO> findById(int blogId) {
        /*
         * Q4-1번) stream을 이용해서 filter 해서 찾은 객체를 반환
         */

        // 내가 한 코드
        System.out.println("debug >>>> blog dao findById() params" + blogId);

        // return blogs.stream()
        // .filter(blog -> blog.getBlogId() == blogId)
        // .findFirst();

        // 강사님이 한 코드
        return blogs.stream().filter(blog -> blog.getBlogId() == blogId).findAny();
    }

    public List<BlogResponseDTO> findByKeyword(BlogRequestDTO request) {
        System.out.println("debug >>>> blog dao findByKeyword params : " + request);

        return blogs.stream().filter(blog -> blog.getTitle().contains(request.getKeyword())
                || blog.getContent().contains(request.getKeyword()))
                .toList();
    }

    public int save(BlogRequestDTO request){
        System.out.println("debug >>>> blog dao save params : " + request);

        // blogs.add(request)

        return 0;
    }
}
