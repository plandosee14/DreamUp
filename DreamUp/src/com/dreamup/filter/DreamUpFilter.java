package com.dreamup.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DreamUpFilter implements Filter {

   private String encType;

   @Override
   public void init(FilterConfig config) throws ServletException {
//      System.out.println("DreamUpFilter_init() =  encType�� ���ɴϴ�.");
      encType = config.getInitParameter("encType");
//      System.out.println("encType : " + encType);
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
         throws IOException, ServletException {
//      System.out.println("Filter_doFilter =  CharacterEncoding : UTF-8 (�ѱۼ���)����");
      if (encType != null) {
         request.setCharacterEncoding(encType);
//         System.out.println("dofilter : " + encType);
      } else {// web.xml�� encType�� ���ǵ��� �ʾҴٸ�
         request.setCharacterEncoding("UTF-8");
      }
      chain.doFilter(request, response);
   }

   @Override
   public void destroy() {
      // TODO Auto-generated method stub

   }
}