$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/Trip.feature");
formatter.feature({
  "name": "Trip Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Trip Background",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: -0.041\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-Q6T8I2O\u0027, ip: \u0027192.168.43.251\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50946}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 095797b09b1046c8f483ddb570fc15b6\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.config.BaseClass.init(BaseClass.java:90)\r\n\tat util_cucu.Helper.initi(Helper.java:15)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Type of trip to be selected",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.FlightTrip.type_of_trip_to_be_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "City to be Selected",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.FlightTrip.city_to_be_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the date block",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.FlightTrip.verify_the_date_block()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search Round Trip",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Date to be selected",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.FlightTrip.date_to_be_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Number of adults to be selected",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.FlightTrip.number_of_adults_to_be_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Select Currency",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.FlightTrip.select_currency()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Search for the flight",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.FlightTrip.search_for_the_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the data",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.FlightTrip.verify_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});