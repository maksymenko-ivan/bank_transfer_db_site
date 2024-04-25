package gg.jte.generated;
public final class JtehomeGenerated {
	public static final String JTE_NAME = "home.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,18,18,18,18,21,21,21,36};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, org.example.User user) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Document</title>\n</head>\n<body>\n<div class=\"table\">\n    <table class=\"tab\">\n\n        <tr>\n            <td>Name: </td>\n        </tr>\n        <tr>\n            <td>ID: ");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(user.getId());
		jteOutput.writeContent("</td>\n        </tr>\n        <tr>\n            <td>Balance: ");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(user.getBalance());
		jteOutput.writeContent("</td>\n        </tr>\n\n    </table>\n    <form class=\"search-form\" method=\"POST\" action=\"/api/transfer/\">\n        <fieldset class=\"serach-form__wrap\">\n            <p class=\"login\">id</p>\n            <input name=\"id\" type=\"text\" class=\"logpass_field\" placeholder=\"Insert id\">\n            <p class=\"pass\">Amount</p>\n            <input name=\"amount\" type=\"text\" class=\"logpass_field\" placeholder=\"Insert amount\">\n            <p class=\"signup\"><input type=\"submit\" class=\"but-signup\" value=\"Send\"></p>\n        </fieldset>\n    </form>\n</div>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		org.example.User user = (org.example.User)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
