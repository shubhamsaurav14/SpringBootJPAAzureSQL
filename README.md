# Configure Microsoft SQL Server using Docker and Azure data studio
https://bigboxcode.com/configure-microsoft-sql-server-using-docker-and-azure-data-studio

# Spring Boot + Spring Data JPA + Microsoft SQL Server

https://www.javaguides.net/2019/08/spring-boot-spring-data-jpa-microsoft-server.html

added validation dependency as well.

C:\Program Files\Java\jdk-17

# problem while connecting to DB

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=employees;encrypt=true;trustServerCertificate=true;authenticationScheme=NTLM

added authenticationScheme=NTLM
remove integratedSecurity=true

ERROR:
com.microsoft.sqlserver.jdbc.SQLServerException: This driver is not configured for integrated authentication. ClientConnectionId:dd8cffbb-15e7-4627-86ea-fac2b077b6ea
references:
https://stackoverflow.com/questions/6087819/jdbc-sqlserverexception-this-driver-is-not-configured-for-integrated-authentic

added authenticationScheme=NTLM

ERROR:
com.microsoft.sqlserver.jdbc.SQLServerException: Login failed. The login is from an untrusted domain and cannot be used with Integrated authentication. ClientConnectionId:e657f2f0-0b3c-4a55-b5eb-ab47e6d3c31d
references:
https://stackoverflow.com/questions/18603696/trouble-connecting-to-sql-server-login-failed-the-login-is-from-an-untrusted-d

remove integratedSecurity=true




# creating DATABASE in mssql usinf Azure data studio << here databse created name: employees>>

USE master;
GO

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

GS:
create a db in mssql using azure data studio
Reference:
https://learn.microsoft.com/en-us/azure-data-studio/quickstart-sql-server

# how to achive native query with spring-boot jpa

https://www.youtube.com/watch?v=FQNxZD2dbaA
