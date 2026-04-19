---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime$.html
title: DateTime$
---

# DateTime$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class DateTime$

- java.lang.Object
- - akka.http.scaladsl.model.DateTime$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DateTime$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.DateTime$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DateTime$](DateTime$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DateTime$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[apply](#apply(int,int,int,int,int,int))​(int year,  int month,  int day,  int hour,  int minute,  int second)` | Creates a new `DateTime` with the given properties. |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[apply](#apply(long))​(long clicks)` | Creates a new `DateTime` from the number of milli seconds  since the start of "the epoch", namely January 1, 1970, 00:00:00 GMT. |
	| `scala.Option<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>` | `[fromIsoDateTimeString](#fromIsoDateTimeString(java.lang.String))​(java.lang.String string)` | Creates a new DateTime instance from the given String,  if it adheres to the format `yyyy-mm-ddThh:mm:ss[.SSSZ]`. |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[MaxValue](#MaxValue())()` |  |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[MinValue](#MinValue())()` |  |
	| `java.lang.String` | `[month](#month(int))​(int index)` | Returns the three\-letter string for the month with the given index. |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[now](#now())()` | Creates a new `DateTime` instance for the current point in time. |
	| `java.lang.String` | `[weekday](#weekday(int))​(int index)` | Returns the three\-letter string for the weekday with the given index. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DateTime$](DateTime$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DateTime$
		
		
		
		```
		public DateTime$()
		```

	- ### Method Detail
	
	
	
		- #### weekday
		
		
		
		```
		public java.lang.String weekday​(int index)
		```
		
		Returns the three\-letter string for the weekday with the given index. Sunday is zero.
		
		Parameters:
		`index` \- (undocumented)
		Returns:
		(undocumented)
		- #### month
		
		
		
		```
		public java.lang.String month​(int index)
		```
		
		Returns the three\-letter string for the month with the given index. January is zero.
		
		Parameters:
		`index` \- (undocumented)
		Returns:
		(undocumented)
		- #### MinValue
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") MinValue()
		```
		- #### MaxValue
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") MaxValue()
		```
		- #### apply
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") apply​(int year,
		                      int month,
		                      int day,
		                      int hour,
		                      int minute,
		                      int second)
		```
		
		Creates a new `DateTime` with the given properties.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Parameters:
		`year` \- (undocumented)
		`month` \- (undocumented)
		`day` \- (undocumented)
		`hour` \- (undocumented)
		`minute` \- (undocumented)
		`second` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") apply​(long clicks)
		```
		
		Creates a new `DateTime` from the number of milli seconds
		 since the start of "the epoch", namely January 1, 1970, 00:00:00 GMT.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Parameters:
		`clicks` \- (undocumented)
		Returns:
		(undocumented)
		- #### now
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") now()
		```
		
		Creates a new `DateTime` instance for the current point in time.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Returns:
		(undocumented)
		- #### fromIsoDateTimeString
		
		
		
		```
		public scala.Option<[DateTime](DateTime.html "class in akka.http.scaladsl.model")> fromIsoDateTimeString​(java.lang.String string)
		```
		
		Creates a new DateTime instance from the given String,
		 if it adheres to the format `yyyy-mm-ddThh:mm:ss[.SSSZ]`.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Parameters:
		`string` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime$.html)*