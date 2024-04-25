<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Sign Up</title>
</head>
<body>
<div class="full" >

	<div class="intro">

		<hi class="sign">Sign Up</hi>

	</div>

	<form class="search-form" method="POST" action="/api/register/">
		<fieldset class="serach-form__wrap">
			<p class="search-form__info">
			<p class="login">login</p>
			<input name="login" type="text" class="logpass_field" placeholder="Insert login">
			<p class="pass">password</p>
			<input name="pass" type="password" class="logpass_field" placeholder="Insert password">
			<p class="pass">re-pass</p>
			<input name="repass" type="password" class="logpass_field" placeholder="Insert re-pass">
			<p class="signup"><input type="submit" class="but-signup" value="Sign Up"></p>
			<a href="./login" class="cancel"><input type="button" class="but-cancel" value="Cancel"></a>
			</p>
		</fieldset>
	</form>
</div>
</body>
</html>