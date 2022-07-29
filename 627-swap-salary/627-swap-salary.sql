# Write your MySQL query statement below
# UPDATE Salary set sex = if(sex='f','m','f');
update salary set sex = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex));