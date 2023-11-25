# Create new data base
IF NOT EXISTS (
      SELECT name
      FROM sys.databases
      WHERE name = N'employees'
      )
   CREATE DATABASE [employees];
GO

IF SERVERPROPERTY('ProductVersion') > '12'
   ALTER DATABASE [employees] SET QUERY_STORE = ON;
GO

# insert statements

    SET IDENTITY_INSERT [dbo].[employees] ON;
    ---
  INSERT INTO [dbo].[employees] (id, email_address, first_name, last_name)
  VALUES (1,'ABC.COM','c','d');
    ---
   SET IDENTITY_INSERT [dbo].[address] ON;
    ---
  INSERT INTO [dbo].[address] (id, city, [state], employee_id)
  VALUES (1,'NOIDA','UP',1);
    ---
  SELECT e.first_name, ea.id, ea.city, ea.state FROM dbo.address ea join dbo.employeeS e on e.id = ea.employee_id where ea.employee_id=0;
    ---
  SELECT
        e.first_name,
        ea.id,
        ea.city,
        ea.state 
    FROM
        dbo.address ea 
    join
        dbo.employeeS e 
            on e.id = ea.employee_id 
    where
        ea.employee_id=0;