# Project of UI automation testing <a target="_blank" href="https://voiso.com/">voiso.com</a>
![](images/voiso_logo.png)
### :pencil: Content:
- :pushpin: [Test coverage](#bar_chart-Test-coverage)
- :pushpin: [Technology stack](#woman_technologist-Technology-stack)
- :pushpin: [Running tests from terminal](#black_large_square-Running-tests-from-terminal)
- :pushpin: [Allure report](#-Allure-report)
- :pushpin: [Telegram report](#-Telegram-report)

### :bar_chart:	Test coverage:
> - [x] *Check if button 'request a demo' exists*
> - [x] *Check if video exists on the main banner*
> - [x] *Check title of the main page*
> - [x] *Check if blog page exists*
> - [x] *Page console log should not have errors*
### :woman_technologist: Technology stack:
<p  align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="images/GitHub.svg" width="50" height="50"  alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5" title="JUnit5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins" title="Jenkins"/></a>
<a href="https://www.jenkins.io/"><img src="images/Telegram.svg" width="50" height="50"  alt="Jenkins" title="Telegram"/></a>
</p>

> In this project, autotests are written in <code>Java</code> and use <code>Selenide</code> for UI-tests.
>
> <code>Selenoid</code> launches browsers in containers <code>Docker</code>.
>
> <code>Allure Report</code> generates a test run report.
>
> For automated building of the project, <code>Gradle</code> was used.
>
> Library for unit testing uses <code>JUnit 5</code>.
>
> <code>Jenkins</code> for runs tests
>
> Test run results are sent to <code>Telegram</code>.

### :black_large_square: Running tests from terminal:
:black_circle:	Local running tests
```
gradle clean test
```
:black_circle:	Remote running tests
```
clean
test
-DremoteUrl=${REMOTEURL}
-Duser=${USER}
-Dpassword=${PASSWORD}
-Dbrowser=${BROWSER}
-DbrowserVersion=${VERSION}
-DbrowserSize=${RESOLUTION}
```
:black_medium_small_square:	Build options
REPOSITORY
> <code>REPOSITORY</code> – tests are run from it.
>
> <code>REMOTE_DRIVER_URL</code> – address of the remote server the tests will run.
>
> <code>BROWSER</code> – browser will be used to run the tests  (_default - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – version of the browser will be used to run the tests (_default - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – size of the browser window will be used to run the tests (_default - <code>1920x1080</code>_).

### <img src="images/Allure_Report.svg" width="25" height="25" /></a> <a target="_blank" href="https://jenkins.autotests.cloud/job/0yanna_hw13/allure/">Allure report</a>

Main window and build history
![](images/allure report.png)

Test suite
![](images/allure_suites.png)

Graphs
![](images/Graphs.png)

### <img src="images/Telegram.svg" width="25" height="25" /></a> Telegram report
![](images/telegram_report.png)

### Test execution example
<p align="center">
  <img title="Selenoid Video" src="images/24838d6398f7dd9febb7d1d5da55d51c.gif">
</p>