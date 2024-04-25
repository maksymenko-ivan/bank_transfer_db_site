package gg.jte.generated;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {44,44,44,44,44,44};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html>\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>First National Bank</title>\n</head>\n<body>\n\n<main class=\"main\">\n    <!-- Intro start -->\n    <div class=\"intro\">\n        <div class=\"wrapper\">\n            <div class=\"titli_subtitle\">\n                <h1 class=\"intro__title\">\n                    First National Bank\n                </h1>\n                <p class=\"intro__subtitle\">\n                    Welcome to the online portal of First National Bank, where your financial needs are just a click away. Our website is designed with simplicity and security in mind, ensuring that managing your finances online is convenient and worry-free.\n                    With our user-friendly interface, you can easily navigate through various banking services such as checking and savings accounts, loans, investments, and more. Whether you're at home, in the office, or on the go, our website is accessible 24/7, allowing you to bank whenever and wherever it's convenient for you.\n                </p>\n            </div>\n            <form class=\"search-form\" method=\"POST\" action=\"/api/auth/\">\n                <fieldset class=\"serach-form__wrap\">\n                    <p class=\"search-form__info\">\n                    <h1 class=\"SignIn\">Sign In</h1>\n                    <p class=\"login\">login</p>\n                    <input name=\"login\" type=\"text\" class=\"logpass_field\" placeholder=\"Insert login\">\n                    <p class=\"pass\">password</p>\n                    <input name=\"pass\" type=\"password\" class=\"logpass_field\" placeholder=\"Insert password\">\n                    <p class=\"button-signin\"><input class=\"but-signin\" type=\"submit\" value=\"Log In\"></p>\n                    <a href=\"./registration\" class=\"button-signup\"><input  class=\"but-signup\" type=\"button\" value=\"Sign Up\"></a>\n                    </p>\n                </fieldset>\n            </form>\n\n        </div>\n        <div class=\"textunder\">\n            <h1 class=\"undertext\" >2020, Ivan Maksymenko</h1>\n        </div>\n    </div>\n    <!-- Intro end -->\n</main>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
