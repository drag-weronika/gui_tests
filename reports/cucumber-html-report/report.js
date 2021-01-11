$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    },
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 5561850600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with invalid password",
  "description": "",
  "id": "login;login-with-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I set email",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I set password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should see main page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 1295740000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_set_email()"
});
formatter.result({
  "duration": 263020800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_set_password()"
});
formatter.result({
  "duration": 226829200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_submit_button()"
});
formatter.result({
  "duration": 1138896000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_main_page_displayed()"
});
formatter.result({
  "duration": 701279000,
  "status": "passed"
});
formatter.after({
  "duration": 119300,
  "status": "passed"
});
formatter.uri("postCreation.feature");
formatter.feature({
  "line": 2,
  "name": "Post creation",
  "description": "",
  "id": "post-creation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@createPost"
    }
  ]
});
formatter.before({
  "duration": 2940100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Post creation",
  "description": "",
  "id": "post-creation;post-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Editor by link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I set title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I set description",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I set content",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I set tag",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I submit posting",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see post created with icons for edition, deletion and commenting",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I navigate to home page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click Global Feed tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see the post listed",
  "keyword": "Then "
});
formatter.match({
  "location": "PostCreationSteps.i_navigate_to_home_page()"
});
formatter.result({
  "duration": 678114700,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_navigate_to_Editor_by_link()"
});
formatter.result({
  "duration": 852066800,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_set_title()"
});
formatter.result({
  "duration": 746994800,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_set_description()"
});
formatter.result({
  "duration": 210665600,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_set_content()"
});
formatter.result({
  "duration": 212605000,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_set_tag()"
});
formatter.result({
  "duration": 196170100,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_submit_posting()"
});
formatter.result({
  "duration": 1151776300,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_should_see_post_created_with_icons_for_edition_deletion_and_commenting()"
});
formatter.result({
  "duration": 1334206300,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_navigate_to_home_page()"
});
formatter.result({
  "duration": 482975900,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_click_Global_Feed_tab()"
});
formatter.result({
  "duration": 755712800,
  "status": "passed"
});
formatter.match({
  "location": "PostCreationSteps.i_should_see_the_post_listed()"
});
formatter.result({
  "duration": 1047665700,
  "status": "passed"
});
formatter.after({
  "duration": 60400,
  "status": "passed"
});
});