---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LogCapturing.html
title: LogCapturing
---

# LogCapturing

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class LogCapturing

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.LogCapturing

- All Implemented Interfaces:
`org.junit.rules.TestRule`

---

```
public final class LogCapturing
extends java.lang.Object
implements org.junit.rules.TestRule
```

JUnit `TestRule` to make log lines appear only when the test failed.
 
 Use this in test by adding a public field annotated with `@TestRule`:
 

```

   @Rule public final LogCapturing logCapturing = new LogCapturing();
 
```

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

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogCapturing](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `org.junit.runners.model.Statement` | `[apply](#apply(org.junit.runners.model.Statement,org.junit.runner.Description))​(org.junit.runners.model.Statement base,  org.junit.runner.Description description)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LogCapturing
		
		
		
		```
		public LogCapturing()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public org.junit.runners.model.Statement apply​(org.junit.runners.model.Statement base,
		                                               org.junit.runner.Description description)
		```
		
		
		Specified by:
		`apply` in interface `org.junit.rules.TestRule`

## Code Examples

### Example 1: Class LogCapturing

```text
@Rule public final LogCapturing logCapturing = new LogCapturing();
```

### Example 2: Class LogCapturing

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

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LogCapturing.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LogCapturing.html)*