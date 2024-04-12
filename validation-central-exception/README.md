# validation-exception-handling
Spring Request validation &amp; Exception Handling <br>
1). Add few users and check by following in POSTMAN<br>
a). http://localhost:9292/api/users<br>
{
 "userId": 1,
 "name": "Steve",
 "email": "steve@gmail.com",
 "mobile": "4162863799",
 "gender": "M",
 "age": 54,
 "nationality": "Canadian"
}<br>
b). Find all users by (postman)<br>
http://localhost:9292/api/users<br>
c). Check specific user<br>
http://localhost:9292/api/users/1
2). Check in DB (Application is build with H2 DB )<br>
http://localhost:9292/h2-console (use JDBC url as jdbc:h2:mem:testdb according to application config)<br>

3). Test excepiton (not in db)<br>
http://localhost:9292/api/users/5
