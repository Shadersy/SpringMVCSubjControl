<!DOCTYPE html>
<html lang="ru">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">



    <link rel="stylesheet" href="/resources/src/multi.css">
    <link rel="stylesheet" href="/resources/dist/multi.min.css">

    <script src="/resources/dist/multi.min.js"></script>
    <script src="/resources/dist/multi-es6.min.js"></script>
    <script src="/resources/src/es6-export.js"></script>
    <script src="resources/src/multi.js"></script>


    <style>
        /* Basic styling */
        body {
            font-family: sans-serif;
        }

        .container {
            box-sizing: border-box;
            margin: 0 auto;
            max-width: 300px;
            padding: 0 20px;
            width: 100%;
        }




    </style>
</head>


<body>
<form method="post">


    <div class="container">

<h2>PerevodFrom:</h2>


<select required name="perevodFrom" id="perevodFromId">
    <#list users as user>
        <option value="${user.id}">${user.name}</option>
    </#list>
</select>

<br>
</br>
        <br>
        </br>

        <input type="number" name="inputCost" placeholder="Enter sum"><br>


<h2>PerevodTo:</h2>
<select required name="perevodTo" id="perevodToId">
    <#list users as user>
        <option value="${user.id}">${user.name}</option>
    </#list>
</select>


    <br>
    </br>
    <button type="submit">Submit</button>





    <h1>User list</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Balance</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.balance}</td>
            </tr>
        </#list>
    </table>


</form>
</div>




<form method="post" action="/gotohello">
    <div class="kek" style="margin-left: 700px">
        <button>Back to Purchase</button>
    </div>
</form>
</body>
</html>