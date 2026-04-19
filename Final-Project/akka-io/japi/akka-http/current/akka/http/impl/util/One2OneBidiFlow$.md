---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow$.html
title: One2OneBidiFlow$
---

# One2OneBidiFlow$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class One2OneBidiFlow$

- java.lang.Object
- - akka.http.impl.util.One2OneBidiFlow$

- ---

```
public class One2OneBidiFlow$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [One2OneBidiFlow$](One2OneBidiFlow$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[One2OneBidiFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<I,​O>akka.stream.scaladsl.BidiFlow<I,​I,​O,​O,​akka.NotUsed>` | `[apply](#apply(int,scala.Function1,scala.Function1))​(int maxPending,  scala.Function1<java.lang.Object,​java.lang.Throwable> outputTruncationException,  scala.Function1<java.lang.Object,​java.lang.Throwable> unexpectedOutputException)` | Creates a generic BidiFlow which verifies that another flow produces exactly one output element per  input element, at the right time. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [One2OneBidiFlow$](One2OneBidiFlow$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### One2OneBidiFlow$
		
		
		
		```
		public One2OneBidiFlow$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <I,​O> akka.stream.scaladsl.BidiFlow<I,​I,​O,​O,​akka.NotUsed> apply​(int maxPending,
		                                                                                                     scala.Function1<java.lang.Object,​java.lang.Throwable> outputTruncationException,
		                                                                                                     scala.Function1<java.lang.Object,​java.lang.Throwable> unexpectedOutputException)
		```
		
		Creates a generic BidiFlow which verifies that another flow produces exactly one output element per
		 input element, at the right time. Specifically it
		 
		 1\. triggers an UnexpectedOutputException if the inner flow produces an output element before having
		 consumed the respective input element.
		 2\. triggers an `OutputTruncationException` if the inner flow completes before having produced an output element
		 for every input element.
		 3\. triggers an `OutputTruncationException` if the inner flow cancels its inputs before the upstream completes its
		 stream of inputs.
		 4\. Backpressures the input side if the maximum number of pending output elements has been reached,
		 which is given via the maxPending parameter. You can use \-1 to disable this feature.
		
		
		
		Parameters:
		`maxPending` \- (undocumented)
		`outputTruncationException` \- (undocumented)
		`unexpectedOutputException` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/One2OneBidiFlow$.html)*