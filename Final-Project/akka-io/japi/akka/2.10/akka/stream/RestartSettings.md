---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html
title: RestartSettings
---

# RestartSettings

## Content

Package [akka.stream](package-summary.html)
## Class RestartSettings

- java.lang.Object
- - akka.stream.RestartSettings

- ---

```
public final class RestartSettings
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` |  |
	| `static class` | `[RestartSettings.LogSettings$](RestartSettings.LogSettings$.html "class in akka.stream")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RestartSettings](RestartSettings.html "class in akka.stream")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Scala API |
	| `static [RestartSettings](RestartSettings.html "class in akka.stream")` | `[create](#create(java.time.Duration,java.time.Duration,double))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API |
	| `static [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[createLogSettings](#createLogSettings(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Java API |
	| `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[logSettings](#logSettings())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxBackoff](#maxBackoff())()` |  |
	| `int` | `[maxRestarts](#maxRestarts())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxRestartsWithin](#maxRestartsWithin())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[minBackoff](#minBackoff())()` |  |
	| `double` | `[randomFactor](#randomFactor())()` |  |
	| `scala.Function1<java.lang.Throwable,​java.lang.Object>` | `[restartOn](#restartOn())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withLogSettings](#withLogSettings(akka.stream.RestartSettings.LogSettings))​([RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") newLogSettings)` |  |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMaxBackoff](#withMaxBackoff(java.time.Duration))​(java.time.Duration value)` | Java API: the exponential back\-off is capped to this duration |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMaxBackoff](#withMaxBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` | Scala API: the exponential back\-off is capped to this duration |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMaxRestarts](#withMaxRestarts(int,java.time.Duration))​(int count,  java.time.Duration within)` | Java API: The amount of restarts is capped to \`count\` within a timeframe of \`within\` |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMaxRestarts](#withMaxRestarts(int,scala.concurrent.duration.FiniteDuration))​(int count,  scala.concurrent.duration.FiniteDuration within)` | Scala API: The amount of restarts is capped to \`count\` within a timeframe of \`within\` |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMinBackoff](#withMinBackoff(java.time.Duration))​(java.time.Duration value)` | Java API: minimum (initial) duration until the child actor will started again, if it is terminated |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withMinBackoff](#withMinBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` | Scala API: minimum (initial) duration until the child actor will started again, if it is terminated |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withRandomFactor](#withRandomFactor(double))​(double value)` | After calculation of the exponential back\-off an additional random delay based on this factor is added  e.g. |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[withRestartOn](#withRestartOn(java.util.function.Predicate))​(java.util.function.Predicate<java.lang.Throwable> restartOn)` | Decides whether the failure should restart the stream or make the surrounding stream fail |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartSettings
		
		
		
		```
		public RestartSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RestartSettings](RestartSettings.html "class in akka.stream") apply​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                    scala.concurrent.duration.FiniteDuration maxBackoff,
		                                    double randomFactor)
		```
		
		Scala API
		- #### create
		
		
		
		```
		public static [RestartSettings](RestartSettings.html "class in akka.stream") create​(java.time.Duration minBackoff,
		                                     java.time.Duration maxBackoff,
		                                     double randomFactor)
		```
		
		Java API
		- #### createLogSettings
		
		
		
		```
		public static [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") createLogSettings​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Java API
		- #### minBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration minBackoff()
		```
		- #### maxBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxBackoff()
		```
		- #### randomFactor
		
		
		
		```
		public double randomFactor()
		```
		- #### maxRestarts
		
		
		
		```
		public int maxRestarts()
		```
		- #### maxRestartsWithin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxRestartsWithin()
		```
		- #### logSettings
		
		
		
		```
		public [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") logSettings()
		```
		- #### restartOn
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​java.lang.Object> restartOn()
		```
		- #### withMinBackoff
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMinBackoff​(scala.concurrent.duration.FiniteDuration value)
		```
		
		Scala API: minimum (initial) duration until the child actor will started again, if it is terminated
		- #### withMinBackoff
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMinBackoff​(java.time.Duration value)
		```
		
		Java API: minimum (initial) duration until the child actor will started again, if it is terminated
		- #### withMaxBackoff
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMaxBackoff​(scala.concurrent.duration.FiniteDuration value)
		```
		
		Scala API: the exponential back\-off is capped to this duration
		- #### withMaxBackoff
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMaxBackoff​(java.time.Duration value)
		```
		
		Java API: the exponential back\-off is capped to this duration
		- #### withRandomFactor
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withRandomFactor​(double value)
		```
		
		After calculation of the exponential back\-off an additional random delay based on this factor is added
		 e.g. `0.2` adds up to `20%` delay. In order to skip this additional delay pass in `0`
		- #### withMaxRestarts
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMaxRestarts​(int count,
		                                       scala.concurrent.duration.FiniteDuration within)
		```
		
		Scala API: The amount of restarts is capped to \`count\` within a timeframe of \`within\`
		- #### withMaxRestarts
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withMaxRestarts​(int count,
		                                       java.time.Duration within)
		```
		
		Java API: The amount of restarts is capped to \`count\` within a timeframe of \`within\`
		- #### withRestartOn
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withRestartOn​(java.util.function.Predicate<java.lang.Throwable> restartOn)
		```
		
		Decides whether the failure should restart the stream or make the surrounding stream fail
		- #### withLogSettings
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") withLogSettings​([RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") newLogSettings)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.LogSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.LogSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html](https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html)*