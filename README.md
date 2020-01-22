# SONGR
Contributer: Shingo Nakajima

## Steps to run app
1. Clone the app to your local machine
2. Edit the application.properties file 
    a. set db url to something you can access
        i. Create database in local machine 
               a. run psql in terminal
               b. CREATE DATABASE <database name>]
               c. run \c <database name> to connect to database
    b. set db username and password
3. run app with ./gradlew bootRun to run 
4. Open http://localhost:8080/
5. Once landing page opens then click on image to go to album page or go to http://localhost:8080/albums
6. If you want to capitalize words go to http://localhost:8080/capitalize/"insert words you want to capitalize"
7. If you want to check hello route go to http://localhost:8080/hello
8. Submit necessary album info including working image url 
9. It will automatically redirect you to /albums page
10. Check db to see if album was added to table by SELECT * from <table name>; 
