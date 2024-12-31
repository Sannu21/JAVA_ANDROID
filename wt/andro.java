Android :-
======== Android is a linux based os, firstly it is developed by android inc. but in year 2005 it is purchase by Google.

=>First version of an Android is launched in year 2007 android 1.0.
=>The latest version of an Android is android 10.0.1 that is launched in year 3 sept 2019, Android Q version.

Widgets : Widgets are acontrol in android. some ex of an Android Widgets are given below:

1.button
2.edit view
3.text view
4.spinner
5.list view
6.card view
7.image view

Note :Every Widgets control of an Android is also a Class. 

Layout Control : its a define the structure or layout view of an Application.

Some example of layout is given below :
---------------------------------------

1.LinearLayout :- Its  working as Vertical or Horizontal. both values is handle by Orientation property.
2.RelativeLayout :- Its  used to manage all type of Widgets .but it do act according to parent child relationship.
3.FrameLayout :- Its used to manage the Frames (pages).

How we can develop Application in an Android 
=============================================

Activity :- Every Layout into an Android is known as Activity. Every Activity contains two pages.
            activity_main.xml---------Activity-----------MainActivity.java 

Type of Activity : there are different type of Activity
1. Empty Activity
2. Bottom Activity
3. Navigation Drawer Activity
4. Map Activity
5. Tabbed Activity 

How we can develop an Application :
----------------------------------
Open Android Studio----File----New Project---Open New Window---ProjectName---PackageName---Language(Java) 

Almost every Widgets have following two methods :

1.getText(): its used to get the value from Widgets.
 
Syntax :objectOfWidget.getText();

2.setText() : its used to set the value on the Widgets.

Syntax : objectOfWidget.setText(value); 

ListView : its used to display data record into the list. you can display any data like as simple data or data with image.

Ex. Contact,Dictionary list ... etc

There are two type of ListView :

1.Built-in  ListView

2.Custom ListView 

1.ListView

2.Intent :- its built class of an Android that is used to link from Activity to another Activity.
Intent class have Built-in properties and methods related : 
Camera,Call,Message Intent ...etc 

3.Toast

RatingBar :- its also Widgets into an Android. it provides Built-in methods and properties thet is given as following :

1.getRating() :- it always return float point of value.
2.getNumsStar() :- it return the int types value.
3.numsStar:it have the number of stars.

Fragment :- its a class of java that is used to display 

Project :-
========  Pocket Notes App-->

Gearhost :- it provide online server database connectivity . here you can create ms sql,my sql, or mongodb ..etc

first you ctreate your account here then ypu can get id password and create your database here.

For login in Gearhost Admin panel :
==================================

Userid : Email id here
Password : Password here ...

Crediential for Database Connectivity :

Server Name :- den1.mssql8.gear.host
DatabaseName :- sannudb
Login :- sannudb
Password :- sannu123@	

Table of my database :
---------------------

1
create table register
(
name varchar(60),
gender varchar(50),
mob varchar(40),
email varchar(120) not null primary key,
passwd varchar(150)
)

2
create table login
(
userid varchar(120) not null primary key,
passwd varchar(80)
)

3
create table enquiery
(
name varchar(60),
email varchar(120),
mob varchar(40),
query varchar(max)
)

4
create table review
(
name varchar(60),
email varchar(120),
review varchar(40)
)


Server Name :- den1.mssql8.gear.host
DatabaseName :- nidhidb
Login :- nidhidb
Password :- nidhiy123@







