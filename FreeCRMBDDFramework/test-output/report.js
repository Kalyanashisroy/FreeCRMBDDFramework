$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KALYANASHIS/git/FreeCRMBDDFramework/FreeCRMBDDFramework/CRMFeatures/JenkinsLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Jenkins Login Feature",
  "description": "",
  "id": "jenkins-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Jenkins Login Test Scenario",
  "description": "",
  "id": "jenkins-login-feature;jenkins-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 8034495666,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.title_of_login_page_is_Jenkins()"
});
formatter.result({
  "duration": 32506834,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_enter_username_and_password()"
});
formatter.result({
  "duration": 692705432,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_click_on_login_button()"
});
formatter.result({
  "duration": 3474805938,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_is_on_home_page()"
});
formatter.result({
  "duration": 48355,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.close_the_browser()"
});
formatter.result({
  "duration": 1036086278,
  "status": "passed"
});
});