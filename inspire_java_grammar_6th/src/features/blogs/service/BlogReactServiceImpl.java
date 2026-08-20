package features.blogs.service;

import java.util.List;
import java.util.Optional;

import features.blogs.domain.dto.BlogRequestDTO;
import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.repository.BlogReactDao;

// 8월 19일 실습 코드
public class BlogReactServiceImpl implements BlogReactService {

    private BlogReactDao dao;

    public BlogReactServiceImpl() {

    }

    public BlogReactServiceImpl(BlogReactDao dao) {
        this.dao = dao;
    }

    @Override
    public List<BlogResponseDTO> list() {

        System.out.println("debug >>>> blog service list");
        return dao.findByAll();

    }

    @Override
    public BlogResponseDTO read(int blogId) {
        System.out.println("debug >>>> blog service read params : " + blogId);
        // Q4-2번) dao findById() 메서드 호출을 통해서 전달된 Optional을 확인하고 객체 또는 null 반환하는 구현
        // 내가 한 코드
        // Optional<BlogResponseDTO> result = dao.findById(blogId);

        // return result.orElse(null);

        // 강사님이 한 코드
        // case 1
        // return dao.findById(blogId).orElse(null);
        
        // case 2
        // Optional<BlogResponseDTO> result = dao.findById(blogId);
        // if(result.isPresent()){
        //     return result.get();
        // }
        // return null;

        // case 3
        return dao.findById(blogId).orElseThrow(() -> new RuntimeException(blogId + "정보를 찾을 수 없습니다."));
    }

    @Override
    public int insert(BlogRequestDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public int update(BlogRequestDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(int blogId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<BlogResponseDTO> search(BlogRequestDTO request) {
        System.out.println("debug >>>> blog service search params : " + request);

        return dao.findByKeyword(request);
    }

}
