$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/prueba.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@case1"
    },
    {
      "name": "@browser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Lanzo chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "prueba.java:9"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busco \"prueba\"",
  "keyword": "And "
});
formatter.match({
  "location": "prueba.java:13"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click en buscar",
  "keyword": "When "
});
formatter.match({
  "location": "prueba.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});