---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
title: DateTime
---

# DateTime

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class DateTime

- java.lang.Object
- - [akka.http.javadsl.model.DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.DateTime

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `java.lang.Comparable<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>`, `scala.Equals`, `scala.math.Ordered<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>`, `scala.Product`

---

```
public final class DateTime
extends [DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")
implements scala.math.Ordered<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>, [Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

Immutable, fast and efficient Date \+ Time implementation without any dependencies.
 Does not support TimeZones, all DateTime values are always GMT based.
 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.DateTime)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DateTime](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[apply](#apply(int,int,int,int,int,int))​(int year,  int month,  int day,  int hour,  int minute,  int second)` | Creates a new `DateTime` with the given properties. |
	| `static [DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[apply](#apply(long))​(long clicks)` | Creates a new `DateTime` from the number of milli seconds  since the start of "the epoch", namely January 1, 1970, 00:00:00 GMT. |
	| `long` | `[clicks](#clicks())()` | Returns this instant as "clicks", i.e. as milliseconds since January 1, 1970, 00:00:00 GMT |
	| `int` | `[compare](#compare(akka.http.scaladsl.model.DateTime))​([DateTime](DateTime.html "class in akka.http.scaladsl.model") that)` |  |
	| `int` | `[day](#day())()` | Returns the day of this instant in GMT. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static scala.Option<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>` | `[fromIsoDateTimeString](#fromIsoDateTimeString(java.lang.String))​(java.lang.String string)` | Creates a new DateTime instance from the given String,  if it adheres to the format `yyyy-mm-ddThh:mm:ss[.SSSZ]`. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[hour](#hour())()` | Returns the hour of this instant in GMT. |
	| `boolean` | `[isLeapYear](#isLeapYear())()` | Returns if this instant interpreted as a Date in GMT belongs to a leap year. |
	| `static [DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[MaxValue](#MaxValue())()` |  |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[minus](#minus(long))​(long millis)` | Creates a new `DateTime` that represents the point in time the given number of ms earlier. |
	| `int` | `[minute](#minute())()` | Returns the minute of this instant in GMT. |
	| `static [DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[MinValue](#MinValue())()` |  |
	| `int` | `[month](#month())()` | Returns the month of this instant in GMT. |
	| `java.lang.String` | `[monthStr](#monthStr())()` | The month as a 3 letter abbreviation:  `Jan`, `Feb`, `Mar`, `Apr`, `May`, `Jun`, `Jul`, `Aug`, `Sep`, `Oct`, `Nov` or `Dec` |
	| `static [DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[now](#now())()` | Creates a new `DateTime` instance for the current point in time. |
	| `[DateTime](DateTime.html "class in akka.http.scaladsl.model")` | `[plus](#plus(long))​(long millis)` | Creates a new `DateTime` that represents the point in time the given number of ms later. |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` | `yyyy-mm-ddThh:mm:ss` |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderIsoDate](#renderIsoDate(R))​(R r)` | `yyyy-mm-dd` |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderIsoDateTimeString](#renderIsoDateTimeString(R))​(R r)` | `yyyy-mm-ddThh:mm:ss` |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderIsoLikeDateTimeString](#renderIsoLikeDateTimeString(R))​(R r)` | `yyyy-mm-dd hh:mm:ss` |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderRfc1123DateTimeString](#renderRfc1123DateTimeString(R))​(R r)` | RFC1123 date string, e.g. |
	| `int` | `[second](#second())()` | Returns the second of this instant in GMT. |
	| `java.lang.String` | `[toIsoDateString](#toIsoDateString())()` | `yyyy-mm-dd` |
	| `java.lang.String` | `[toIsoDateTimeString](#toIsoDateTimeString())()` | `yyyy-mm-ddThh:mm:ss` |
	| `java.lang.String` | `[toIsoLikeDateTimeString](#toIsoLikeDateTimeString())()` | `yyyy-mm-dd hh:mm:ss` |
	| `java.lang.String` | `[toRfc1123DateTimeString](#toRfc1123DateTimeString())()` | RFC1123 date string, e.g. |
	| `java.lang.String` | `[toString](#toString())()` | `yyyy-mm-ddThh:mm:ss` |
	| `int` | `[weekday](#weekday())()` | Returns the weekday of this instant in GMT. |
	| `java.lang.String` | `[weekdayStr](#weekdayStr())()` | The day of the week as a 3 letter abbreviation:  `Sun`, `Mon`, `Tue`, `Wed`, `Thu`, `Fri` or `Sat` |
	| `int` | `[year](#year())()` | Returns the year of this instant in GMT. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/DateTime.html#create(int,int,int,int,int,int)), [create](../../javadsl/model/DateTime.html#create(long))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual`
		- ### Methods inherited from interface scala.math.Ordered
		
		
		`$greater, $greater$eq, $less, $less$eq, compareTo`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### DateTime
		
		
		
		```
		public DateTime()
		```

	- ### Method Detail
	
	
	
		- #### MinValue
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.scaladsl.model") MinValue()
		```
		- #### MaxValue
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.scaladsl.model") MaxValue()
		```
		- #### apply
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.scaladsl.model") apply​(int year,
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
		public static [DateTime](DateTime.html "class in akka.http.scaladsl.model") apply​(long clicks)
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
		public static [DateTime](DateTime.html "class in akka.http.scaladsl.model") now()
		```
		
		Creates a new `DateTime` instance for the current point in time.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Returns:
		(undocumented)
		- #### fromIsoDateTimeString
		
		
		
		```
		public static scala.Option<[DateTime](DateTime.html "class in akka.http.scaladsl.model")> fromIsoDateTimeString​(java.lang.String string)
		```
		
		Creates a new DateTime instance from the given String,
		 if it adheres to the format `yyyy-mm-ddThh:mm:ss[.SSSZ]`.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		
		Parameters:
		`string` \- (undocumented)
		Returns:
		(undocumented)
		- #### year
		
		
		
		```
		public int year()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#year())`
		Returns the year of this instant in GMT.
		
		Specified by:
		`[year](../../javadsl/model/DateTime.html#year())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### month
		
		
		
		```
		public int month()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#month())`
		Returns the month of this instant in GMT.
		
		Specified by:
		`[month](../../javadsl/model/DateTime.html#month())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### day
		
		
		
		```
		public int day()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#day())`
		Returns the day of this instant in GMT.
		
		Specified by:
		`[day](../../javadsl/model/DateTime.html#day())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### hour
		
		
		
		```
		public int hour()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#hour())`
		Returns the hour of this instant in GMT.
		
		Specified by:
		`[hour](../../javadsl/model/DateTime.html#hour())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### minute
		
		
		
		```
		public int minute()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#minute())`
		Returns the minute of this instant in GMT.
		
		Specified by:
		`[minute](../../javadsl/model/DateTime.html#minute())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### second
		
		
		
		```
		public int second()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#second())`
		Returns the second of this instant in GMT.
		
		Specified by:
		`[second](../../javadsl/model/DateTime.html#second())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### weekday
		
		
		
		```
		public int weekday()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#weekday())`
		Returns the weekday of this instant in GMT. Sunday is 0, Monday is 1, etc.
		
		Specified by:
		`[weekday](../../javadsl/model/DateTime.html#weekday())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### clicks
		
		
		
		```
		public long clicks()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#clicks())`
		Returns this instant as "clicks", i.e. as milliseconds since January 1, 1970, 00:00:00 GMT
		
		Specified by:
		`[clicks](../../javadsl/model/DateTime.html#clicks())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### isLeapYear
		
		
		
		```
		public boolean isLeapYear()
		```
		
		Description copied from class: `[DateTime](../../javadsl/model/DateTime.html#isLeapYear())`
		Returns if this instant interpreted as a Date in GMT belongs to a leap year.
		
		Specified by:
		`[isLeapYear](../../javadsl/model/DateTime.html#isLeapYear())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		- #### weekdayStr
		
		
		
		```
		public java.lang.String weekdayStr()
		```
		
		The day of the week as a 3 letter abbreviation:
		 `Sun`, `Mon`, `Tue`, `Wed`, `Thu`, `Fri` or `Sat`
		
		Specified by:
		`[weekdayStr](../../javadsl/model/DateTime.html#weekdayStr())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### monthStr
		
		
		
		```
		public java.lang.String monthStr()
		```
		
		The month as a 3 letter abbreviation:
		 `Jan`, `Feb`, `Mar`, `Apr`, `May`, `Jun`, `Jul`, `Aug`, `Sep`, `Oct`, `Nov` or `Dec`
		
		Specified by:
		`[monthStr](../../javadsl/model/DateTime.html#monthStr())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### minus
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") minus​(long millis)
		```
		
		Creates a new `DateTime` that represents the point in time the given number of ms earlier.
		
		Specified by:
		`[minus](../../javadsl/model/DateTime.html#minus(long))` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Parameters:
		`millis` \- (undocumented)
		Returns:
		(undocumented)
		- #### plus
		
		
		
		```
		public [DateTime](DateTime.html "class in akka.http.scaladsl.model") plus​(long millis)
		```
		
		Creates a new `DateTime` that represents the point in time the given number of ms later.
		
		Specified by:
		`[plus](../../javadsl/model/DateTime.html#plus(long))` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Parameters:
		`millis` \- (undocumented)
		Returns:
		(undocumented)
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		`yyyy-mm-ddThh:mm:ss`
		
		Specified by:
		`[render](../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		Parameters:
		`r` \- (undocumented)
		Returns:
		(undocumented)
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		`yyyy-mm-ddThh:mm:ss`
		
		Overrides:
		`toString` in class `java.lang.Object`
		Returns:
		(undocumented)
		- #### renderIsoDate
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderIsoDate​(R r)
		```
		
		`yyyy-mm-dd`
		
		Parameters:
		`r` \- (undocumented)
		Returns:
		(undocumented)
		- #### toIsoDateString
		
		
		
		```
		public java.lang.String toIsoDateString()
		```
		
		`yyyy-mm-dd`
		
		Specified by:
		`[toIsoDateString](../../javadsl/model/DateTime.html#toIsoDateString())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### renderIsoDateTimeString
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderIsoDateTimeString​(R r)
		```
		
		`yyyy-mm-ddThh:mm:ss`
		
		Parameters:
		`r` \- (undocumented)
		Returns:
		(undocumented)
		- #### toIsoDateTimeString
		
		
		
		```
		public java.lang.String toIsoDateTimeString()
		```
		
		`yyyy-mm-ddThh:mm:ss`
		
		Specified by:
		`[toIsoDateTimeString](../../javadsl/model/DateTime.html#toIsoDateTimeString())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### renderIsoLikeDateTimeString
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderIsoLikeDateTimeString​(R r)
		```
		
		`yyyy-mm-dd hh:mm:ss`
		
		Parameters:
		`r` \- (undocumented)
		Returns:
		(undocumented)
		- #### toIsoLikeDateTimeString
		
		
		
		```
		public java.lang.String toIsoLikeDateTimeString()
		```
		
		`yyyy-mm-dd hh:mm:ss`
		
		Specified by:
		`[toIsoLikeDateTimeString](../../javadsl/model/DateTime.html#toIsoLikeDateTimeString())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### renderRfc1123DateTimeString
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") renderRfc1123DateTimeString​(R r)
		```
		
		RFC1123 date string, e.g. `Sun, 06 Nov 1994 08:49:37 GMT`
		
		Parameters:
		`r` \- (undocumented)
		Returns:
		(undocumented)
		- #### toRfc1123DateTimeString
		
		
		
		```
		public java.lang.String toRfc1123DateTimeString()
		```
		
		RFC1123 date string, e.g. `Sun, 06 Nov 1994 08:49:37 GMT`
		
		Specified by:
		`[toRfc1123DateTimeString](../../javadsl/model/DateTime.html#toRfc1123DateTimeString())` in class `[DateTime](../../javadsl/model/DateTime.html "class in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### compare
		
		
		
		```
		public int compare​([DateTime](DateTime.html "class in akka.http.scaladsl.model") that)
		```
		
		
		Specified by:
		`compare` in interface `scala.math.Ordered<[DateTime](DateTime.html "class in akka.http.scaladsl.model")>`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html)*