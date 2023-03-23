mysql> DELETE FROM PackAnimals
    -> where name='camel 1';
Query OK, 1 row affected (0,01 sec)

mysql> select * from PackAnimals;
+----+----------+------------+----------------------+
| id | name     | birthday   | command              |
+----+----------+------------+----------------------+
|  1 | Horses 1 | 2019-02-21 | run, sit, igogo, eat |
|  3 | donkey 1 | 2018-09-25 | run, sit, eat        |
+----+----------+------------+----------------------+
2 rows in set (0,00 sec)

mysql>