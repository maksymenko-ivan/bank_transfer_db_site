package gg.jte.generated;
public final class JteregistGenerated {
	public static final String JTE_NAME = "regist.jte";
	public static final int[] JTE_LINE_INFO = {32,32,32,32,32,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html>\n<head>\n\t<meta charset=\"UTF-8\">\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\t<title>Sign Up</title>\n</head>\n<body>\n<div class=\"full\" >\n\n\t<div class=\"intro\">\n\n\t\t<hi class=\"sign\">Sign Up</hi>\n\n\t</div>\n\n\t<form class=\"search-form\" method=\"POST\" action=\"/api/register/\">\n\t\t<fieldset class=\"serach-form__wrap\">\n\t\t\t<p class=\"search-form__info\">\n\t\t\t<p class=\"login\">login</p>\n\t\t\t<input name=\"login\" type=\"text\" class=\"logpass_field\" placeholder=\"Insert login\">\n\t\t\t<p class=\"pass\">password</p>\n\t\t\t<input name=\"pass\" type=\"password\" class=\"logpass_field\" placeholder=\"Insert password\">\n\t\t\t<p class=\"pass\">re-pass</p>\n\t\t\t<input name=\"repass\" type=\"password\" class=\"logpass_field\" placeholder=\"Insert re-pass\">\n\t\t\t<p class=\"signup\"><input type=\"submit\" class=\"but-signup\" value=\"Sign Up\"></p>\n\t\t\t<a href=\"./login\" class=\"cancel\"><input type=\"button\" class=\"but-cancel\" value=\"Cancel\"></a>\n\t\t\t</p>\n\t\t</fieldset>\n\t</form>\n</div>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
