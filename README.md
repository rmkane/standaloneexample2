# Standalone Example 2

The following application combines Spring, Hibernate, and MySQL to allow a user to access a database without a server.

## Preamble

This project extends my prevoius project.

>[ryankane/standaloneexample](https://github.com/ryankane/standaloneexample)

Instead of a SessionFactory, I will be using an EntityManagerFactory.

## About

The application heavily uses autowiring to inject beans. The SERVICE layer is used to map DTO objects to their ENTITY counterparts which will then be sent to the DAO layer where the session manager will control the DATABASE CRUD operations.

### Project Dependencies

* Spring 3.2.3.RELEASE
* Hibernate 4.2.2.Final
* MySQL