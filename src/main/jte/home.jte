<!DOCTYPE html>

@param org.example.User user

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<div class="table">
    <table class="tab">

        <tr>
            <td>Name: </td>
        </tr>
        <tr>
            <td>ID: ${user.getId()}</td>
        </tr>
        <tr>
            <td>Balance: ${user.getBalance()}</td>
        </tr>

    </table>
    <form class="search-form" method="POST" action="/api/transfer/">
        <fieldset class="serach-form__wrap">
            <p class="login">id</p>
            <input name="id" type="text" class="logpass_field" placeholder="Insert id">
            <p class="pass">Amount</p>
            <input name="amount" type="text" class="logpass_field" placeholder="Insert amount">
            <p class="signup"><input type="submit" class="but-signup" value="Send"></p>
        </fieldset>
    </form>
</div>
</body>
</html>