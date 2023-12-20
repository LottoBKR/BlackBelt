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
            <form:form action="/users/new" method="POST" modelAttribute="user">

                <h2>Registrate</h2>

                <div class="row">
                    <form:label path="name">Name:</form:label>
                    <form:input type="text" class="form-control" path="name"/>
                </div>
                <form:errors path="name" class="text-danger"/>
            </form:form>
        </div>
        <div class="col-6">
            
        </div>
    </div>
</body>
</html>