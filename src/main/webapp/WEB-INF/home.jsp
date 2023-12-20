<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>TVDB</title>
</head>
<body class="container">
    <div class="row">
        <div class="col-6">
            <form:form action="/users/register" method="POST" modelAttribute="newUser">

                <h2>Registrate</h2>

                <div class="row">
                    <form:label path="name">Name:</form:label>
                    <form:input type="text" class="form-control" path="name"/>
                </div>
                <form:errors path="name" class="text-danger"/>

                <div>
                    <form:label path="email">Email:</form:label>
                    <form:input type="text" class="form-control" path="email"/>
                </div>
                <form:errors path="email" class="text-danger"/>

                <div>
                    <form:label path="password">Password:</form:label>
                    <form:input type="password" class="form-control" path="email"/>
                </div>
                <form:errors path="password" class="text-danger"/>

                <div>
                    <form:label path="passwordConfirm">Password Confirmation:</form:label>
                    <form:input type="password" class="form-control" path="passwordConfirm"/>
                </div>
                <form:errors path="passwordConfirm" class="text-danger"/>

                <input type="submit" value="Resgister" class="btn btn-dark">
            </form:form>

            <div class="col-6">

				<h2>Login</h2>
				<p class="text-danger">${error_login}</p>

				<form action="/login" method="post">
					<div>
						<label>E-mail</label>
						<input type="text" class="form-control" name="email" />
					</div>
					<div>
						<label>Password</label>
						<input type="password" class="form-control" name="password" />
					</div>
					<input type="submit" class="btn btn-info mt-3" value="Login" />
				</form>

			</div>
        </div>
    </div>
</body>
</html>