---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/RetrySettings.html
title: RetrySettings
---

# RetrySettings

## Content

Package [akka.pattern](package-summary.html)
## Class RetrySettings

- java.lang.Object
- - akka.pattern.RetrySettings

- ---

```
public final class RetrySettings
extends java.lang.Object
```

Settings for retrying operations.
 param: maxRetries maximum number of retries
 param: delayFunction function to calculate the delay between retries
 param: shouldRetry function to determine if a failure should be retried

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetrySettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RetrySettings](RetrySettings.html "class in akka.pattern")` | `[apply](#apply(int))​(int maxRetries)` | Scala API: Create settings with exponential backoff delay between retries. |
	| `static [RetrySettings](RetrySettings.html "class in akka.pattern")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Create settings from configuration. |
	| `static [RetrySettings](RetrySettings.html "class in akka.pattern")` | `[create](#create(int))​(int maxRetries)` | Scala API: Create settings with exponential backoff delay between retries. |
	| `static [RetrySettings](RetrySettings.html "class in akka.pattern")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from configuration. |
	| `scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>>` | `[delayFunction](#delayFunction())()` |  |
	| `int` | `[maxRetries](#maxRetries())()` |  |
	| `scala.Function1<java.lang.Throwable,​java.lang.Object>` | `[shouldRetry](#shouldRetry())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withDecider](#withDecider(scala.Function1))​(scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry)` | Scala API: Set the function to determine if a failure should be retried. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withDelayFunction](#withDelayFunction(scala.Function1))​(scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction)` | Scala API: Set custom delay function between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withExponentialBackoff](#withExponentialBackoff(java.time.Duration,java.time.Duration,double))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API: Set exponential backoff delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withExponentialBackoff](#withExponentialBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Scala API: Set exponential backoff delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withFixedDelay](#withFixedDelay(java.time.Duration))​(java.time.Duration fixedDelay)` | Java API: Set fixed delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withFixedDelay](#withFixedDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration fixedDelay)` | Scala API: Set fixed delay between retries. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withJavaDecider](#withJavaDecider(java.util.function.Function))​(java.util.function.Function<java.lang.Throwable,​java.lang.Boolean> shouldRetry)` | Java API: Set the function to determine if a failure should be retried. |
	| `[RetrySettings](RetrySettings.html "class in akka.pattern")` | `[withJavaDelayFunction](#withJavaDelayFunction(java.util.function.IntFunction))​(java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction)` | Java API: Set custom delay function between retries. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RetrySettings
		
		
		
		```
		public RetrySettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RetrySettings](RetrySettings.html "class in akka.pattern") apply​(int maxRetries)
		```
		
		Scala API: Create settings with exponential backoff delay between retries.
		 The exponential backoff settings are calculated based on number of retries.
		
		Parameters:
		`maxRetries` \- maximum number of retries
		Returns:
		RetrySettings with exponential backoff delay
		- #### create
		
		
		
		```
		public static [RetrySettings](RetrySettings.html "class in akka.pattern") create​(int maxRetries)
		```
		
		Scala API: Create settings with exponential backoff delay between retries.
		 The exponential backoff settings are calculated based on number of retries.
		
		Parameters:
		`maxRetries` \- maximum number of retries
		Returns:
		RetrySettings with exponential backoff delay
		- #### apply
		
		
		
		```
		public static [RetrySettings](RetrySettings.html "class in akka.pattern") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Create settings from configuration.
		- #### create
		
		
		
		```
		public static [RetrySettings](RetrySettings.html "class in akka.pattern") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from configuration.
		- #### maxRetries
		
		
		
		```
		public int maxRetries()
		```
		- #### delayFunction
		
		
		
		```
		public scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction()
		```
		- #### shouldRetry
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### withExponentialBackoff
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withExponentialBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                            scala.concurrent.duration.FiniteDuration maxBackoff,
		                                            double randomFactor)
		```
		
		Scala API: Set exponential backoff delay between retries.
		 
		
		Parameters:
		`minBackoff` \- minimum backoff duration
		`maxBackoff` \- maximum backoff duration
		`randomFactor` \- random factor to add jitter to the backoff
		- #### withExponentialBackoff
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withExponentialBackoff​(java.time.Duration minBackoff,
		                                            java.time.Duration maxBackoff,
		                                            double randomFactor)
		```
		
		Java API: Set exponential backoff delay between retries.
		 
		
		Parameters:
		`minBackoff` \- minimum backoff duration
		`maxBackoff` \- maximum backoff duration
		`randomFactor` \- random factor to add jitter to the backoff
		Returns:
		Updated settings
		- #### withFixedDelay
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withFixedDelay​(scala.concurrent.duration.FiniteDuration fixedDelay)
		```
		
		Scala API: Set fixed delay between retries.
		
		Parameters:
		`fixedDelay` \- fixed delay between retries
		Returns:
		Updated settings
		- #### withFixedDelay
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withFixedDelay​(java.time.Duration fixedDelay)
		```
		
		Java API: Set fixed delay between retries.
		
		Parameters:
		`fixedDelay` \- fixed delay between retries
		Returns:
		Updated settings
		- #### withDelayFunction
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withDelayFunction​(scala.Function1<java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>> delayFunction)
		```
		
		Scala API: Set custom delay function between retries.
		
		Parameters:
		`delayFunction` \- function to calculate the delay between retries
		Returns:
		Updated settings
		- #### withJavaDelayFunction
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withJavaDelayFunction​(java.util.function.IntFunction<java.util.Optional<java.time.Duration>> delayFunction)
		```
		
		Java API: Set custom delay function between retries.
		
		Parameters:
		`delayFunction` \- function to calculate the delay between retries
		Returns:
		Updated settings
		- #### withDecider
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withDecider​(scala.Function1<java.lang.Throwable,​java.lang.Object> shouldRetry)
		```
		
		Scala API: Set the function to determine if a failure should be retried.
		
		Parameters:
		`shouldRetry` \- function to determine if a failure should be retried
		Returns:
		Updated settings
		- #### withJavaDecider
		
		
		
		```
		public [RetrySettings](RetrySettings.html "class in akka.pattern") withJavaDecider​(java.util.function.Function<java.lang.Throwable,​java.lang.Boolean> shouldRetry)
		```
		
		Java API: Set the function to determine if a failure should be retried.
		
		Parameters:
		`shouldRetry` \- function to determine if a failure should be retried
		Returns:
		Updated settings

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/RetrySettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/RetrySettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/RetrySettings.html)*