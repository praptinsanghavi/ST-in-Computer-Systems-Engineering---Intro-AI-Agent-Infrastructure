---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html
title: LogCapturing
---

# LogCapturing

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface LogCapturing

- All Superinterfaces:
`org.scalatest.BeforeAndAfterAll`, `org.scalatest.SuiteMixin`

---

```
public interface LogCapturing
extends org.scalatest.BeforeAndAfterAll
```

Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.
 
 Requires Logback and configuration like the following the logback\-test.xml:
 

```

     <appender name="CapturingAppender" class="akka.actor.testkit.typed.internal.CapturingAppender" />

     <logger name="akka.actor.testkit.typed.internal.CapturingAppenderDelegate" >
       <appender-ref ref="STDOUT"/>
     </logger>

     <root level="DEBUG">
         <appender-ref ref="CapturingAppender"/>
     </root>
 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterAll](#afterAll())()` |  |
	| `void` | `[clearCapturedLogs](#clearCapturedLogs())()` | May be called to explicitly clear the captured logs. |
	| `boolean` | `[clearLogsAfterEachTest](#clearLogsAfterEachTest())()` | If true, the logs will be cleared after each test. |
	| `void` | `[super$afterAll](#super$afterAll())()` |  |
	| `org.scalatest.Outcome` | `[withFixture](#withFixture(org.scalatest.TestSuite.NoArgTest))​(org.scalatest.TestSuite.NoArgTest test)` |  |
	
	
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterAll
		
		
		`beforeAll, invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected, org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq, run`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTest, runTests, styleName, suiteId, suiteName, tags, testDataFor, testNames`

- - ### Method Detail
	
	
	
		- #### afterAll
		
		
		
		```
		void afterAll()
		```
		
		
		Specified by:
		`afterAll` in interface `org.scalatest.BeforeAndAfterAll`
		- #### clearCapturedLogs
		
		
		
		```
		void clearCapturedLogs()
		```
		
		May be called to explicitly clear the captured logs.
		 
		 Useful for when logs are not cleared after each test. If clearing after every test
		 is desirable, overriding [`clearLogsAfterEachTest()`](#clearLogsAfterEachTest()) is preferable.
		- #### clearLogsAfterEachTest
		
		
		
		```
		boolean clearLogsAfterEachTest()
		```
		
		If true, the logs will be cleared after each test.
		 
		 This is not enabled by default for Scala tests, since state may be shared between
		 sequential tests, and logs from earlier tests may be important.
		- #### super$afterAll
		
		
		
		```
		void super$afterAll()
		```
		- #### withFixture
		
		
		
		```
		org.scalatest.Outcome withFixture​(org.scalatest.TestSuite.NoArgTest test)
		```

## Code Examples

### Example 1: Interface LogCapturing

```text
<appender name="CapturingAppender" class="akka.actor.testkit.typed.internal.CapturingAppender" />

     <logger name="akka.actor.testkit.typed.internal.CapturingAppenderDelegate" >
       <appender-ref ref="STDOUT"/>
     </logger>

     <root level="DEBUG">
         <appender-ref ref="CapturingAppender"/>
     </root>
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html)*