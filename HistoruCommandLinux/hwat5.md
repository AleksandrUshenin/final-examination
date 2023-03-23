mysql> select * from Pets
    -> union select * from PackAnimals;
+----+------------+------------+----------------------+
| id | name       | birthday   | command              |
+----+------------+------------+----------------------+
|  1 | Dog 1      | 2020-03-21 | run, sit             |
|  2 | cat 1      | 2021-04-11 | run, sit             |
|  3 | hamsters 1 | 2022-08-15 | run, sit, eat        |
|  1 | Horses 1   | 2019-02-21 | run, sit, igogo, eat |
|  3 | donkey 1   | 2018-09-25 | run, sit, eat        |
+----+------------+------------+----------------------+
5 rows in set (0,01 sec)