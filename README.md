# SONGR
Contributer: Shingo Nakajima

Took about 4hrs 

### Day1 
## Steps to run app
1. Launch gradlew -test
2. Open http://localhost:8080/
3. Once landing page opens then click on image to go to album page or go to http://localhost:8080/albums
4. If you want to capitalize words go to http://localhost:8080/capitalize/"insert words you want to capitalize"
5. If you want to check hello route go to http://localhost:8080/hello

### Day2
## Steps to run database
1. Create database in local machine 
    a. run psql in terminal
    b. CREATE DATABASE <database name>]
    c. run \c <database name> to connect to database
2. Open localhost 8080 and submit necessary album info including working image url 
3. It will automatically redirect you to /albums page
4. Check database to see if album was added to table by SELECT * from <table name>; 
