<!DOCTYPE html>
<html lang="ru">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>Subjs control</title>










</head>
<body>


<form action="">
    <fieldset>
        <legend>Product</legend>

        <form action="/action_page.php">
            Product's name:<br>
            <input type="text" name="product's name" placeholder="Enter brand"><br>
            Price:<br>
            <input type="text" name="price" placeholder="0"><br><br>
            <input type="submit" value="Submit">
        </form>
    </fieldset>
</form>












<form action="">
    <fieldset>
        <p>Choose buyer and partners</p>

        <select multiple>
            <#list users as user>
                <tr>
                    <option>${user.name}</option>
                </tr>
            </#list>
        </select>
    </fieldset>
</form>


    <form action="">
    <fieldset>
        <legend>
            All Partner's balance
        </legend>
    <table>
    <tr>
        <th>Id</th>
        <th>First name / Second name</th>
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

        <input type="submit" value="add partner">
    </fieldset>
    </form>

</body>


</html>