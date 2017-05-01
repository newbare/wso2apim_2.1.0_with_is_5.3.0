/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-05-01 05:42:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.client.ApiException;
import org.wso2.carbon.identity.mgt.endpoint.client.api.UsernameRecoveryApi;
import org.wso2.carbon.identity.mgt.endpoint.client.model.Claim;
import java.util.List;

public final class username_002drecovery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (!Boolean.parseBoolean(application.getInitParameter(
            IdentityManagementEndpointConstants.ConfigConstants.ENABLE_EMAIL_NOTIFICATION))) {
        response.sendError(HttpServletResponse.SC_FOUND);
        return;
    }

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));

    boolean isFirstNameInClaims = false;
    boolean isLastNameInClaims = false;
    boolean isEmailInClaims = false;
    List<Claim> claims;
    UsernameRecoveryApi usernameRecoveryApi = new UsernameRecoveryApi();
    try {
        claims = usernameRecoveryApi.claimsGet(null);
    } catch (ApiException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", e.getMessage());
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    if (claims == null || claims.size() == 0) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", "No recovery supported claims found");
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    for (Claim claim : claims) {
        if (StringUtils.equals(claim.getUri(),
                IdentityManagementEndpointConstants.ClaimURIs.FIRST_NAME_CLAIM)) {
            isFirstNameInClaims = true;
        }
        if (StringUtils.equals(claim.getUri(), IdentityManagementEndpointConstants.ClaimURIs.LAST_NAME_CLAIM)) {
            isLastNameInClaims = true;
        }
        if (StringUtils.equals(claim.getUri(),
                IdentityManagementEndpointConstants.ClaimURIs.EMAIL_CLAIM)) {
            isEmailInClaims = true;
        }
    }


      out.write("\n");
      out.write("<fmt:bundle basename=\"org.wso2.carbon.identity.mgt.endpoint.i18n.Resources\">\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>WSO2 Identity Server</title>\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("        <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <!-- header -->\n");
      out.write("    <header class=\"header header-default\">\n");
      out.write("        <div class=\"container-fluid\"><br></div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"images/logo-inverse.svg\" alt=\"wso2\" title=\"wso2\" class=\"logo\">\n");
      out.write("\n");
      out.write("                    <h1><em>Identity Server</em></h1>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- page content -->\n");
      out.write("    <div class=\"container-fluid body-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- content -->\n");
      out.write("            <div class=\"col-xs-12 col-sm-10 col-md-8 col-lg-5 col-centered wr-login\">\n");
      out.write("                <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">Recover\n");
      out.write("                    Username\n");
      out.write("                </h2>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"boarder-all \">\n");
      out.write("\n");
      out.write("                    ");
 if (error) { 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"server-error-msg\">\n");
      out.write("                        ");
      out.print( Encode.forHtmlContent(errorMsg) );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"error-msg\" hidden=\"hidden\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"padding-double font-large\">Enter below details to recover your username</div>\n");
      out.write("                    <div class=\"padding-double\">\n");
      out.write("                        <form method=\"post\" action=\"verify.do\" id=\"recoverDetailsForm\">\n");
      out.write("                            ");
 if (isFirstNameInClaims) { 
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 \">\n");
      out.write("                                <label class=\"control-label\">First Name</label>\n");
      out.write("                                <input id=\"first-name\" type=\"text\" name=\"http://wso2.org/claims/givenname\"\n");
      out.write("                                       class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            ");
 if (isLastNameInClaims) { 
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 \">\n");
      out.write("                                <label class=\"control-label\">Last Name</label>\n");
      out.write("                                <input id=\"last-name\" type=\"text\" name=\"http://wso2.org/claims/lastname\"\n");
      out.write("                                       class=\"form-control \">\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                String callback = Encode.forHtmlAttribute
                                        (request.getParameter("callback"));

                                if (StringUtils.isBlank(callback)) {
                                    callback = IdentityManagementEndpointUtil.getUserPortalUrl(
                                            application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL));
                                }

                                if (callback != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"callback\" value=\"");
      out.print(callback );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }

                             if (isEmailInClaims) { 
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 \">\n");
      out.write("                                <label class=\"control-label\">Email</label>\n");
      out.write("                                <input id=\"email\" type=\"email\" name=\"http://wso2.org/claims/emailaddress\"\n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       data-validate=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 \">\n");
      out.write("                                <label class=\"control-label\">Tenant Domain</label>\n");
      out.write("                                <input id=\"tenant-domain\" type=\"text\" name=\"tenantDomain\"\n");
      out.write("                                       class=\"form-control \">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <td>&nbsp;&nbsp;</td>\n");
      out.write("                            <input type=\"hidden\" , id=\"isUsernameRecovery\" , name=\"isUsernameRecovery\" value=\"true\">\n");
      out.write("\n");
      out.write("                            ");
 for (Claim claim : claims) {
                                if (claim.getRequired() &&
                                        !StringUtils.equals(claim.getUri(),
                                                IdentityManagementEndpointConstants.ClaimURIs.FIRST_NAME_CLAIM) &&
                                        !StringUtils.equals(claim.getUri(),
                                                IdentityManagementEndpointConstants.ClaimURIs.LAST_NAME_CLAIM) &&
                                        !StringUtils.equals(claim.getUri(),
                                                IdentityManagementEndpointConstants.ClaimURIs.EMAIL_CLAIM)) {
                            
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group\">\n");
      out.write("                                <label class=\"control-label\">");
      out.print( Encode.forHtmlContent(claim.getDisplayName()));
      out.write("\n");
      out.write("                                </label>\n");
      out.write("                                <input type=\"text\" name=\"");
      out.print( Encode.forHtmlAttribute(claim.getUri()) );
      out.write("\"\n");
      out.write("                                       class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-actions\">\n");
      out.write("                                <table width=\"100%\" class=\"styledLeft\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                    <tr class=\"buttonRow\">\n");
      out.write("                                        <td>\n");
      out.write("                                            <button id=\"recoverySubmit\"\n");
      out.write("                                                    class=\"wr-btn grey-bg col-xs-12 col-md-12 col-lg-12 uppercase font-extra-large\"\n");
      out.write("                                                    type=\"submit\">Submit\n");
      out.write("                                            </button>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>&nbsp;&nbsp;</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <button id=\"recoveryCancel\"\n");
      out.write("                                                    class=\"wr-btn grey-bg col-xs-12 col-md-12 col-lg-12 uppercase font-extra-large\"\n");
      out.write("                                                    type=\"button\"\n");
      out.write("                                                    onclick=\"location.href='");
      out.print(Encode.forJavaScript(IdentityManagementEndpointUtil.getUserPortalUrl(
                                                        application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL))));
      out.write("';\">\n");
      out.write("                                                Cancel\n");
      out.write("                                            </button>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /content/body -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <p>WSO2 Identity Server | &copy;\n");
      out.write("                <script>document.write(new Date().getFullYear());</script>\n");
      out.write("                <a href=\"http://wso2.com/\" target=\"_blank\"><i class=\"icon fw fw-wso2\"></i> Inc</a>. All Rights Reserved.\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("    <script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("</fmt:bundle>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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