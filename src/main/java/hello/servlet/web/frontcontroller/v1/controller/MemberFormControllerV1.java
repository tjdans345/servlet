package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.domain.MemberRepository;
import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        // viewPath로 이동시켜줌 <디스패쳐>
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        // 서블릿에서 jsp를 호출하는 코드
        dispatcher.forward(request, response);
    }
}
