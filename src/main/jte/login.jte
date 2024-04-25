<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First National Bank</title>
</head>
<body>

<main class="main">
    <!-- Intro start -->
    <div class="intro">
        <div class="wrapper">
            <div class="titli_subtitle">
                <h1 class="intro__title">
                    First National Bank
                </h1>
                <p class="intro__subtitle">
                    Welcome to the online portal of First National Bank, where your financial needs are just a click away. Our website is designed with simplicity and security in mind, ensuring that managing your finances online is convenient and worry-free.
                    With our user-friendly interface, you can easily navigate through various banking services such as checking and savings accounts, loans, investments, and more. Whether you're at home, in the office, or on the go, our website is accessible 24/7, allowing you to bank whenever and wherever it's convenient for you.
                </p>
            </div>
            <form class="search-form" method="POST" action="/api/auth/">
                <fieldset class="serach-form__wrap">
                    <p class="search-form__info">
                    <h1 class="SignIn">Sign In</h1>
                    <p class="login">login</p>
                    <input name="login" type="text" class="logpass_field" placeholder="Insert login">
                    <p class="pass">password</p>
                    <input name="pass" type="password" class="logpass_field" placeholder="Insert password">
                    <p class="button-signin"><input class="but-signin" type="submit" value="Log In"></p>
                    <a href="./registration" class="button-signup"><input  class="but-signup" type="button" value="Sign Up"></a>
                    </p>
                </fieldset>
            </form>

        </div>
        <div class="textunder">
            <h1 class="undertext" >2020, Ivan Maksymenko</h1>
        </div>
    </div>
    <!-- Intro end -->
</main>
</body>
</html>