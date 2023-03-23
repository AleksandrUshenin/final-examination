mysql> show tables;
+------------------------+
| Tables_in_HumanFriends |
+------------------------+
| PackAnimals            |
| Pets                   |
+------------------------+
2 rows in set (0,00 sec)

mysql> select * from Pets;
+----+------------+------------+---------------+
| id | name       | birthday   | command       |
+----+------------+------------+---------------+
|  1 | Dog 1      | 2020-03-21 | run, sit      |
|  2 | cat 1      | 2021-04-11 | run, sit      |
|  3 | hamsters 1 | 2022-08-15 | run, sit, eat |
+----+------------+------------+---------------+
3 rows in set (0,00 sec)

mysql> select * from PackAnimals;
+----+----------+------------+----------------------+
| id | name     | birthday   | command              |
+----+----------+------------+----------------------+
|  1 | Horses 1 | 2019-02-21 | run, sit, igogo, eat |
|  2 | camel 1  | 2018-03-23 | run, sit, eat        |
|  3 | donkey 1 | 2018-09-25 | run, sit, eat        |
+----+----------+------------+----------------------+
3 rows in set (0,00 sec)

mysql>