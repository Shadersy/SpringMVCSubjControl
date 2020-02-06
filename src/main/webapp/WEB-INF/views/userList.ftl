<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>


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


<h1>Product</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Product</th>
        <th>Cost</th>
    </tr>

    <#list products as product>
        <tr>
        <td>${product.id}</td>
        <td>${product.productName}</td>
        <td>${product.cost}</td>
        </tr>
    </#list>
</table>


<h1>Purchase</h1>
<table>
    <tr>
        <th>Id</th>
        <th>date</th>
    </tr>

    <#list purchases as purchase>
    <tr>
        <td>${purchase.id}</td>
        <td>${purchase.date}</td>

    </#list>
</table>



</body>
</html>