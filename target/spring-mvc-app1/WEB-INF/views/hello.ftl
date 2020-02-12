
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




    <title>Subjs control</title>


    <style>
        /* Basic styling */
        body {
            font-family: sans-serif;
        }

        .container {
            box-sizing: border-box;
            margin: 0 auto;
            max-width: 500px;
            padding: 0 20px;
            width: 100%;
        }



        #okno {
            width: 300px;
            height: 50px;
            text-align: center;
            padding: 15px;
            border: 3px solid #0000cc;
            border-radius: 10px;
            color: #0000cc;
            display: none;
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            margin: auto;
            background-color: white;
        }

        #okno:target {display: block;}
        .close {
            display: inline-block;
            border: 1px solid #0000cc;
            color: #0000cc;
            padding: 0 12px;
            margin: 10px;
            text-decoration: none;
            background: #f2f2f2;
            font-size: 14pt;
            cursor:pointer;
        }
        .close:hover {background: #e6e6ff;}
    </style>
</head>
<body>

<form method="post" action="/hello">
    <fieldset>


        <legend>Product</legend>

        <div class="container" style="margin-left: 630px">

            Product's name:
           <br>

            <input type="text" name="name" placeholder="Enter brand" ><br>
            Price:<br>
            <input type="number" name="price" placeholder="0"><br><br>
        </div>
    </fieldset>



    <fieldset>
        <legend>Dual_list</legend>
        <div class="container">

                <select
                        required
                        multiple="multiple"
                        name="users"
                        id="selectUsers"
                >
                    <#list users as user>
                            <option value="${user.id}">${user.name}</option>
                    </#list>
                </select>

        </div>
        <br>
        <div class="container">
            <h2 style="margin-left: 130px">User to buy everything:</h2>
            <select required name="vip" id="selectVip">
            </select>
        </div>

<div style="margin-left: 620px">
        <script>
            var select = document.getElementById("selectUsers");
            multi(select, {
                enable_search: false
            });

            select.addEventListener('change', function (e) {
                var selectVip = document.getElementById('selectVip');
                for (var i = selectVip.options.length - 1; i >= 0; i--) {
                    selectVip.options.remove(i);
                }
                for (var i = 0; i < this.options.length; i++) {
                    var option = document.createElement('option');
                    if (!this.options[i].selected) {
                        continue;
                    }
                    option.label = this.options[i].label;
                    option.text = this.options[i].label;
                    option.value = this.options[i].value;

                    selectVip.add(option);
                }
            });

            select.change();
        </script>
</div>

        <br>
        <button type="submit" style="margin-left: 700px">Submit</button>

</form>


<form method="post" action="/gotoremittance">
<br>
    <button style="margin-left: 690px">Remittance</button>

</form>
    </fieldset>




    <fieldset>
        <legend>
            All Partner's balance
        </legend>

        <div class="container" style="margin-left: 600px">
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






<div class="container">

    <form method="post" action="/delete_user">
        <select name="deleteSelect">
            <#list users as user>
                <option value="${user.id}">${user.name}</option>
            </#list>
        </select>
        <button name="delete" value="DeleteUser">Delete</button>

    </form>

    <form method="post" action="/add_user">

        <button type="button" id="kek">Add user</button>

        <div id="okno">

            <input type="text" name="userFio" placeholder="Enter User's name">
            <button type="submit">Submit</button>
            <a href="hello" class="close">Close</a>
        </div>

        <script>
            document.getElementById("kek").addEventListener('click', function(){
                document.getElementById("okno").style.display="block";})
        </script>
    </form>
</div>
</fieldset>






</body>


</html>