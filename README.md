# jboss-fuse-tests
The exercise received during the internship in RedHat

<h3>Stage 1: JBoss Fuse</h3>
Create a test that will run JBoss Fuse and that will execute some command in karaf shell and assert that the response is OK

<h4>Stage 1.5: Explore hawtio</h4>
Run JBoss Fuse manually
Unzip
Edit <jboss-fuse-dir>/etc/users.properties - uncomment default admin user
Check the content of hawtio page

<h3>Stage 2: Selenium</h3>
Create a new test that will run JBoss Fuse and that will open a hawtio page, navigate through the page and try to get some value from some element and assert its value.

<h3>Stage 3: Selenium + Page Objects</h3>
Create a new selenium test that uses Page Objects, and try to navigate somewhere and again click somewhere/get some value and assert that
Refactor the current structure so that the shared configuration is in parent class so that you avoid the code duplication

<h3>Stage 4: Selenide + Page Objects</h3>
Do the same as Stage 3, but using Selenide

<h3>Resources:</h3>
Fafram: https://gitlab.mw.lab.eng.bos.redhat.com/fuse/fafram/tree/master
