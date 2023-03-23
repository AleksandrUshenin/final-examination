mysql> insert into YoungAnimals select * from Pets where birthday <= '2022-01-01' and birthday >= '2020-01-01';
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into YoungAnimals select name, birthday, command from Pets where birthday <= '2022-01-01' and birthday >= '2020-01-01';
Query OK, 2 rows affected (0,01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> insert into YoungAnimals select name, birthday, command from PackAnimals where birthday <= '2022-01-01' and birthday >= '2020-01-01';
Query OK, 0 rows affected (0,00 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from Y
Y                      YEAR_MONTH             YoungAnimals           YoungAnimals.command   YoungAnimals.name
YEAR                   YEARWEEK               YoungAnimals.birthday  YoungAnimals.id
mysql> select * from Y
Y                      YEAR_MONTH             YoungAnimals           YoungAnimals.command   YoungAnimals.name
YEAR                   YEARWEEK               YoungAnimals.birthday  YoungAnimals.id
mysql> select * from YoungAnimals;
+-------+------------+----------+
| name  | birthday   | command  |
+-------+------------+----------+
| Dog 1 | 2020-03-21 | run, sit |
| cat 1 | 2021-04-11 | run, sit |
+-------+------------+----------+
2 rows in set (0,00 sec)

mysql>