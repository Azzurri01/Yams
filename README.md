YAMS
========

Yet another Asset Management System (YAMS), the IT asset management application programmable interface (API) Asterisk for Java.

Description
-----------

Acids is an IT asset management (ITAM) interface available on Github that lets you add assets to a mysql relational database. Organizations often lack visibility of IT assets’ locations, and the users that use them. This lack of visibility can lead to hardware assets being lost or stolen without anyone being held accountable.

The application that I will be developing will be an application programmable interface (API) for an IT asset management (ITAM), this will improve the visibility and accountability of hardware IT assets in an organization.

## UML

![name](https://github.com/jmtheron/acids/blob/master/acidsUML-2019-04-15.png)

### Editing UML

The UML below *fig.1* was created in [Draw.io](https://www.draw.io), to edit it download the file.

## Stakeholders

+ Customer
+ Supplier
+ Asset manager
+ System analyst
+ System designer

## Additional files and folders

Source files for diagrams are stored in the diagrams directory

Images used in README.md

## Classes

1. Address
2.  Asset
3.  Brand
4.  Checkout
5.  City
6.  Company
7.  Country
8.  Currency
9.  Customer
10.  Department
11.  Employee
12.  Event
13.  Lease
14.  Location
15.  Maintenance
16.  Misc
17.  Model
18.  Note
19.  PurchaceOrder
20.  Site
21.  State
22.  Status
23.  Supplier
24.  User
25.  Warranty

Similar & Interesting projects
------------------------------

* Ralph - https://github.com/allegro/ralph
* Snipe-it - https://github.com/snipe/snipe-it
* Binstack - https://source.netsyms.com/Business/BinStack

# Todo
Devide the classes into 

## Value objects
+ Asset
+ User
+ Customer
+ Staff

## Entities
### Asset
+ id
+ name
 

Not all classes are value objects
Entities don't usually have Id's
Generate Hash for Values objects, this is used to uniquly identify objects by them.
You'll also implement comparable<class> in the repository.


## For example
### Student - Class is a value object
private Name name = NameFactory.getName();

### Name - Class is a Entity
+ firstname
+ lastName

Contact
+ Address
+ Phone


Link them using composition

