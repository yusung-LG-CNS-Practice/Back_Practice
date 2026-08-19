package features.blogs.repository;

import java.util.ArrayList;
import java.util.List;

import features.blogs.domain.dto.BlogResponseDTO;

public class BlogReactDao {

    private List<BlogResponseDTO> blogs;

    public BlogReactDao(){
        blogs = new ArrayList<>(List.of(
            BlogResponseDTO.builder().BlogId(1).title("react").content("state").email("Na").viewCnt(10).build(),
            BlogResponseDTO.builder().BlogId(2).title("java").content("oop").email("kim").viewCnt(20).build(),
            BlogResponseDTO.builder().BlogId(3).title("spring").content("mybatis").email("lee").viewCnt(30).build(),
            BlogResponseDTO.builder().BlogId(4).title("docker").content("devops").email("park").viewCnt(40).build(),
            BlogResponseDTO.builder().BlogId(5).title("msa").content("kafka").email("lim").viewCnt(50).build()
        ));
    }

    public List<BlogResponseDTO> findByAll(){
        System.out.println("debug >>>> blog dao findByAll()");
        return blogs;
    }
}
