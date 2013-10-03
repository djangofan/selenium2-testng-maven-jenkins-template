selenium2-testng-maven-jenkins-template
============

A template/archetype and example of using Maven and TestNG to run Selenium tests.  Optimized for being
executed from Jenkins.

*This project is currently in progress.  Will finish before Christmas 2013 .  See bug list in this project.*

*The short term goals of this project are:*

*1. Create Etsy.Com tests that save a screenshot whenever an error occurs.*

*2. In the TestNG report, show a hyperlink to view the screenshot.*

*3. Make all of that work with Selenium Grid with multiple browsers running.*


Instructions
==============

Run the included .bat script to get it running OR by using the Maven
task "clean test".

# Configuration And Setup

#### Eclipse
To get it working on a regular Eclipse Kepler or later, follow these steps:
 
    1. Use the "Eclipse Marketplace" panel to install the Maven M2E
       plugin for your version of Eclipse.  Also, install the TestNG
       plugin for Eclipse.  
    2. Use the Eclipse "Import" function from the Eclipse "File
       menu" to import a existing "Project" of type "Maven".
    3. Use the pom.xml editor to resolve any build problems you
       may have after the import.
    4. Right click on your project and choose "Run As-->External
       Tools Configuration".  Configure a new "clean" and "test"
       configuration for running a Maven build.
    5. Some other things: don't enable "Allow output folders for
       source folders", you may need to first run "eclipse:clean"
       or "eclipse:clean eclipse:clean" and then refresh the 
       project in order to properly configure the build path. 
       The process of getting the project imported and properly
       configured is a little tricky but hopefully these 
       instructions help.  The .classpath file I am including
       may help you if you read it first.

#### IntelliJ-IDEA

The required Maven functionality is already built into IntelliJ-IDEA 12.1+ .

#### WebSite

[http://djangofan.github.io/maven-testng-selenium2-archetype](http://djangofan.github.io/maven-testng-selenium-archetype/)
