package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Cart;
import java.util.Map;
import model.Item;
import model.Item;

public final class confirmBill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>confirm</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Cart cart = (Cart) session.getAttribute("cart");
            if(cart == null)
            {
                cart = new Cart();
                session.setAttribute("cart",cart);
                
            }
        
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div class=\"container\">\n");
      out.write("\t<div class=\"check\">\t \n");
      out.write("\t\t<div class=\"col-md-9 cart-items\">\n");
      out.write("\t\t\t <h1>Chi tiết đơn hàng </h1>\n");
      out.write("\t\t\t");

                            for(Map.Entry<String,Item> list : cart.getCartItem().entrySet()){
                            
                        
      out.write("\n");
      out.write("\t\t\t <div class=\"cart-header\">\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\t <div class=\"cart-sec simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t    <div class=\"cart-item-info\">\n");
      out.write("\t\t\t\t\t\t<h3><a href=\"#\"></a><span>");
      out.print(list.getValue().getProduct().getProductName());
      out.write("</span></h3>\n");
      out.write("\t\t\t\t\t\t<ul class=\"qty\">\n");
      out.write("\t\t\t\t\t\t\t<li><p>Giá : ");
      out.print(list.getValue().getProduct().getProductPrice());
      out.write("<p></li>\n");
      out.write("                                                        <li><p>Số lượng : ");
      out.print(list.getValue().getQuantity());
      out.write("<p></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t </div>\t\n");
      out.write("                        ");

                           }
                        
      out.write("\n");
      out.write("                        <div class=\"price-details\">\n");
      out.write("\t\t\t\t <h3>Chi tiết hóa đơn</h3>\n");
      out.write("\t\t\t\t <span>Tổng tiền</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">");
      out.print(cart.totalPriceCart());
      out.write("</span>\n");
      out.write("\t\t\t\t <span>Giảm giá</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">---</span>\n");
      out.write("\t\t\t\t <span>Phí vận chuyển</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">");
      out.print(cart.countItem()*20000 );
      out.write("</span>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\t\t\t\t \n");
      out.write("\t\t\t </div>\n");
      out.write("         \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
