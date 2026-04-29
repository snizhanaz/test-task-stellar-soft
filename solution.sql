--Отримати користувачів, зареєстрованих за останні 30 днів

sql:
SELECT first_name, last_name
FROM users
WHERE creation_date >= CURRENT_DATE - INTERVAL '30 days';

MySQL:  
SELECT first_name, last_name
FROM users
WHERE creation_date >= CURDATE() - INTERVAL 30 DAY;

SQL Server: 
SELECT first_name, last_name
FROM users
WHERE creation_date >= DATEADD(DAY, -30, GETDATE());
