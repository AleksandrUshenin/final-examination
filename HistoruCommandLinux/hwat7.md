mysql>  insert Pets(name, birthday, command) values('Dog 2', '2015-03-23', 'run, sit, eat');
Query OK, 1 row affected (0,02 sec)

mysql>  insert Pets(name, birthday, command) values('Dog 3', '2022-03-23', 'run, sit, eat');
Query OK, 1 row affected (0,02 sec)

mysql>  insert Pets(name, birthday, command) values('Dog 4', '2021-03-23', 'run, sit, eat');
Query OK, 1 row affected (0,01 sec)

mysql>  insert PackAnimals(name, birthday, command) values('Horses 2', '2023-01-02', 'run, sit, eat, igogo');
Query OK, 1 row affected (0,02 sec)

mysql>  insert PackAnimals(name, birthday, command) values('Horses 3', '2022-11-02', 'run, sit, eat, igogo');
Query OK, 1 row affected (0,02 sec)

mysql>  insert PackAnimals(name, birthday, command) values('Horses 4', '2021-11-02', 'run, sit, eat, igogo');
Query OK, 1 row affected (0,02 sec)

mysql>  insert PackAnimals(name, birthday, command) values('Horses 5', '2020-11-02', 'run, sit, eat, igogo');
Query OK, 1 row affected (0,02 sec)


mysql> select * from Pets;
+----+------------+------------+---------------+
| id | name       | birthday   | command       |
+----+------------+------------+---------------+
|  1 | Dog 1      | 2020-03-21 | run, sit      |
|  2 | cat 1      | 2021-04-11 | run, sit      |
|  3 | hamsters 1 | 2022-08-15 | run, sit, eat |
|  4 | Dog 2      | 2015-03-23 | run, sit, eat |
|  5 | Dog 3      | 2022-03-23 | run, sit, eat |
|  6 | Dog 4      | 2021-03-23 | run, sit, eat |
+----+------------+------------+---------------+
6 rows in set (0,00 sec)

mysql> select * from PackAnimals;
+----+----------+------------+----------------------+
| id | name     | birthday   | command              |
+----+----------+------------+----------------------+
|  1 | Horses 1 | 2019-02-21 | run, sit, igogo, eat |
|  3 | donkey 1 | 2018-09-25 | run, sit, eat        |
|  4 | Horses 2 | 2023-01-02 | run, sit, eat, igogo |
|  5 | Horses 3 | 2022-11-02 | run, sit, eat, igogo |
|  6 | Horses 4 | 2021-11-02 | run, sit, eat, igogo |
|  7 | Horses 5 | 2020-11-02 | run, sit, eat, igogo |
+----+----------+------------+----------------------+
6 rows in set (0,00 sec)

mysql>


mysql> select * from YoungAnimals;
Empty set (0,00 sec)

mysql> insert into YoungAnimals select name, birthday, command from Pets where birthday <= '2022-01-01' and birthday >= '2020-01-01';
Query OK, 3 rows affected (0,01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> insert into YoungAnimals select name, birthday, command from PackAnimals where birthday <= '2022-01-01' and birthday >= '2020-01-01';
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from YoungAnimals;
+----------+------------+----------------------+
| name     | birthday   | command              |
+----------+------------+----------------------+
| Dog 1    | 2020-03-21 | run, sit             |
| cat 1    | 2021-04-11 | run, sit             |
| Dog 4    | 2021-03-23 | run, sit, eat        |
| Horses 4 | 2021-11-02 | run, sit, eat, igogo |
| Horses 5 | 2020-11-02 | run, sit, eat, igogo |
+----------+------------+----------------------+
5 rows in set (0,00 sec)

mysql>