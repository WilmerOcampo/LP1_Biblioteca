/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.8
 * Generated at: 2023-06-02 14:50:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class listaEmpleados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Empleados</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-light\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Inicio del menu -->\r\n");
      out.write("      <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <!-- icono o nombre -->\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\" style=\"padding-left: 3rem; padding-right: 3rem;\">\r\n");
      out.write("            <i class=\"bi bi-book\" style=\"font-size: 2rem; color:#bbb\"></i>\r\n");
      out.write("            <span style=\"font-size: 2rem; color:#bbb\"><b>CiberBiblioteca</b></span>\r\n");
      out.write("          </a>  \r\n");
      out.write("            \r\n");
      out.write("        <!-- boton del menu -->\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#menu\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("          <!-- elementos del menu colapsable -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"menu\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto\" style=\"font-size: 20px\">\r\n");
      out.write("                  <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"ControladorLibros?listaLibros&instruccion=listar\">Libros</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"listaEmpleados.jsp\">Empleados</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"listaPrestamos.jsp\">Prestamos</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"ControladorAlumnos?listaAlumnos&instruccion=listar\">Alumnos</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                   <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"listaEditorial.jsp\">Editorial</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\" style=\"margin:0 0.5rem\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"listaCompras.jsp\">Compras</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                 </ul>\r\n");
      out.write("\r\n");
      out.write("          <hr class=\"d-md-none text-white-50\">\r\n");
      out.write("\r\n");
      out.write("         <!--boton Informacion -->\r\n");
      out.write("          <form class=\"d-flex\">\r\n");
      out.write("            <button class=\"btn btn-danger d-none d-md-inline-block \" type=\"submit\" style=\"font-size: 20px; font-weight:600\"><a href=\"login.jsp\" style=\"text-decoration: none; color: #fff\">Cerrar Sesion</a></button>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("    <h1 class=\"d-flex justify-content-center\" style=\"text-transform: uppercase;\"><strong>Lista de Empleados</strong></h1>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <form class=\"d-flex\" role=\"search\" style=\"margin-left: 9rem\">\r\n");
      out.write("                <input class=\"form-control me-4\" type=\"search\" placeholder=\"Ingese su búsqueda\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn btn-warning\" type=\"submit\" style=\"color: #fff; font-weight:600\">Buscar</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav><br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th scope=\"col\">Codigo</th>\r\n");
      out.write("                <th scope=\"col\">Nombre</th>\r\n");
      out.write("                <th scope=\"col\">Apellido</th>\r\n");
      out.write("                <th scope=\"col\">Direccion</th>\r\n");
      out.write("                <th scope=\"col\">Telefono</th>\r\n");
      out.write("                <th scope=\"col\">Email</th>\r\n");
      out.write("                <th scope=\"col\">Acciones</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td><a class=\"btn btn-outline-success\" href=\"editarEmpleado.jsp\">Editar</a>\r\n");
      out.write("                    <a class=\"btn btn-outline-danger\" href=\"#\" onclick=\"confirmarEliminacion()\">Eliminar</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"d-flex justify-content-center\">\r\n");
      out.write("            <input class=\"btn btn-primary\" type=\"button\" value=\"Crear Empleado\" style=\"color: #fff; font-weight:600\"\r\n");
      out.write("                onclick=\"window.location.href='registrarEmpleado.jsp'\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("<script>\r\n");
      out.write("	function confirmarEliminacion(codigo) {\r\n");
      out.write("		if (confirm(\"¿Estás seguro de que deseas eliminar este registro?\")) {\r\n");
      out.write("			window.location.href = \"ControladorClientes?instruccion=eliminar&codigo=\" + codigo;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("        \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
