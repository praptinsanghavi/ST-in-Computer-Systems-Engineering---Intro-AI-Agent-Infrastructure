---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.Scalatest.html
title: TestFrameworkInterface.Scalatest
---

# TestFrameworkInterface.Scalatest

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface TestFrameworkInterface.Scalatest

- All Superinterfaces:
`org.scalatest.BeforeAndAfterAll`, `org.scalatest.SuiteMixin`, `[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")`

All Known Subinterfaces:
`[ScalatestRouteTest](ScalatestRouteTest.html "interface in akka.http.scaladsl.testkit")`

Enclosing interface:
[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")

---

```
public static interface TestFrameworkInterface.Scalatest
extends [TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit"), org.scalatest.BeforeAndAfterAll
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.testkit.[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")
		
		
		`[TestFrameworkInterface.Scalatest](TestFrameworkInterface.Scalatest.html "interface in akka.http.scaladsl.testkit")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterAll](#afterAll())()` |  |
	| `scala.runtime.Nothing$` | `[failTest](#failTest(java.lang.String))​(java.lang.String msg)` |  |
	| `[ExceptionHandler](../server/ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[testExceptionHandler](#testExceptionHandler())()` |  |
	
	
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterAll
		
		
		`beforeAll, invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected, org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq, run`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTest, runTests, styleName, suiteId, suiteName, tags, testDataFor, testNames`
		- ### Methods inherited from interface akka.http.scaladsl.testkit.[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")
		
		
		`[cleanUp](TestFrameworkInterface.html#cleanUp())`

- - ### Method Detail
	
	
	
		- #### afterAll
		
		
		
		```
		void afterAll()
		```
		
		
		Specified by:
		`afterAll` in interface `org.scalatest.BeforeAndAfterAll`
		- #### failTest
		
		
		
		```
		scala.runtime.Nothing$ failTest​(java.lang.String msg)
		```
		
		
		Specified by:
		`[failTest](TestFrameworkInterface.html#failTest(java.lang.String))` in interface `[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")`
		- #### testExceptionHandler
		
		
		
		```
		[ExceptionHandler](../server/ExceptionHandler.html "interface in akka.http.scaladsl.server") testExceptionHandler()
		```
		
		
		Specified by:
		`[testExceptionHandler](TestFrameworkInterface.html#testExceptionHandler())` in interface `[TestFrameworkInterface](TestFrameworkInterface.html "interface in akka.http.scaladsl.testkit")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.Scalatest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.Scalatest.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.Scalatest.html)*