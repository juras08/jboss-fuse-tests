# jboss-fuse-tests
The exercise received during the internship in RedHat

Stage 1: JBoss Fuse
Create a test that will run JBoss Fuse and that will execute some command in karaf shell and assert that the response is OK
Stage 1.5: Explore hawtio
Run JBoss Fuse manually
Unzip
Edit <jboss-fuse-dir>/etc/users.properties - uncomment default admin user
Check the content of hawtio page

Stage 2: Selenium
Create a new test that will run JBoss Fuse and that will open a hawtio page, navigate through the page and try to get some value from some element and assert its value

Stage 3: Selenium + Page Objects
Create a new selenium test that uses Page Objects, and try to navigate somewhere and again click somewhere/get some value and assert that
Refactor the current structure so that the shared configuration is in parent class so that you avoid the code duplication

Stage 4: Selenide + Page Objects
Do the same as Stage 3, but using selenide
