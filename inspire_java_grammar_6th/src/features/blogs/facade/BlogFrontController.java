package features.blogs.facade;

import java.util.List;

import features.blogs.controller.ListController;
import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.factory.BlogBeanFactory;

// 8월 19일 실습 코드
public class BlogFrontController {

    private BlogBeanFactory factory;

    public BlogFrontController() {
        factory = BlogBeanFactory.getInstance();
    }

    public List<BlogResponseDTO> list(String endPoint) {
        System.out.println("debug >>>> front controller endPoint : " + endPoint);
        Object controller = factory.getBean(endPoint);
        return ((ListController) controller).list();
    }
}
