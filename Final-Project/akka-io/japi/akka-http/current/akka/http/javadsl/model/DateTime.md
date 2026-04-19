---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
title: DateTime
---

# DateTime

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class DateTime

- java.lang.Object
- - akka.http.javadsl.model.DateTime

- Direct Known Subclasses:
`[DateTime](../../scaladsl/model/DateTime.html "class in akka.http.scaladsl.model")`

---

```
public abstract class DateTime
extends java.lang.Object
```

Immutable, fast and efficient Date \+ Time implementation without any dependencies.
 Does not support TimeZones, all DateTime values are always GMT based.
 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DateTime](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract long` | `[clicks](#clicks())()` | Returns this instant as "clicks", i.e. as milliseconds since January 1, 1970, 00:00:00 GMT |
	| `static [DateTime](DateTime.html "class in akka.http.javadsl.model")` | `[create](#create(int,int,int,int,int,int))​(int year,  int month,  int day,  int hour,  int minute,  int second)` | Returns a new DateTime instance by interpreting the given date/time components as an instant in GMT. |
	| `static [DateTime](DateTime.html "class in akka.http.javadsl.model")` | `[create](#create(long))​(long clicks)` | Returns a new DateTime instance representing the instant as defined by "clicks"  i.e. from the number of milliseconds since the start of "the epoch", namely  January 1, 1970, 00:00:00 GMT. |
	| `abstract int` | `[day](#day())()` | Returns the day of this instant in GMT. |
	| `static java.util.Optional<[DateTime](DateTime.html "class in akka.http.javadsl.model")>` | `[fromIsoDateTimeString](#fromIsoDateTimeString(java.lang.String))​(java.lang.String isoDateTimeString)` | Returns a new DateTime instance parsed from IsoDateTimeString as Some(dateTime). |
	| `abstract int` | `[hour](#hour())()` | Returns the hour of this instant in GMT. |
	| `abstract boolean` | `[isLeapYear](#isLeapYear())()` | Returns if this instant interpreted as a Date in GMT belongs to a leap year. |
	| `abstract [DateTime](DateTime.html "class in akka.http.javadsl.model")` | `[minus](#minus(long))​(long millis)` | Creates a new \`DateTime\` that represents the point in time the given number of ms earlier. |
	| `abstract int` | `[minute](#minute())()` | Returns the minute of this instant in GMT. |
	| `abstract int` | `[month](#month())()` | Returns the month of this instant in GMT. |
	| `abstract java.lang.String` | `[monthStr](#monthStr())()` | Returns the month as a 3 letter abbreviation:  \`Jan\`, \`Feb\`, \`Mar\`, \`Apr\`, \`May\`, \`Jun\`, \`Jul\`, \`Aug\`, \`Sep\`, \`Oct\`, \`Nov\` or \`Dec\` |
	| `static [DateTime](DateTime.html "class in akka.http.javadsl.model")` | `[now](#now())()` | Returns a new DateTime instance representing the current instant. |
	| `abstract [DateTime](DateTime.html "class in akka.http.javadsl.model")` | `[plus](#plus(long))​(long millis)` | Creates a new \`DateTime\` that represents the point in time the given number of ms later. |
	| `abstract int` | `[second](#second())()` | Returns the second of this instant in GMT. |
	| `abstract java.lang.String` | `[toIsoDateString](#toIsoDateString())()` | Returns a String representation like this: \`yyyy\-mm\-dd\` |
	| `abstract java.lang.String` | `[toIsoDateTimeString](#toIsoDateTimeString())()` | Returns a String representation like this: \`yyyy\-mm\-ddThh:mm:ss\` |
	| `abstract java.lang.String` | `[toIsoLikeDateTimeString](#toIsoLikeDateTimeString())()` | Returns a String representation like this: \`yyyy\-mm\-dd hh:mm:ss\` |
	| `abstract java.lang.String` | `[toRfc1123DateTimeString](#toRfc1123DateTimeString())()` | Returns an RFC1123 date string, e.g. |
	| `abstract int` | `[weekday](#weekday())()` | Returns the weekday of this instant in GMT. |
	| `abstract java.lang.String` | `[weekdayStr](#weekdayStr())()` | Returns the day of the week as a 3 letter abbreviation:  \`Sun\`, \`Mon\`, \`Tue\`, \`Wed\`, \`Thu\`, \`Fri\` or \`Sat\` |
	| `abstract int` | `[year](#year())()` | Returns the year of this instant in GMT. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DateTime
		
		
		
		```
		public DateTime()
		```

	- ### Method Detail
	
	
	
		- #### year
		
		
		
		```
		public abstract int year()
		```
		
		Returns the year of this instant in GMT.
		- #### month
		
		
		
		```
		public abstract int month()
		```
		
		Returns the month of this instant in GMT.
		- #### day
		
		
		
		```
		public abstract int day()
		```
		
		Returns the day of this instant in GMT.
		- #### hour
		
		
		
		```
		public abstract int hour()
		```
		
		Returns the hour of this instant in GMT.
		- #### minute
		
		
		
		```
		public abstract int minute()
		```
		
		Returns the minute of this instant in GMT.
		- #### second
		
		
		
		```
		public abstract int second()
		```
		
		Returns the second of this instant in GMT.
		- #### weekday
		
		
		
		```
		public abstract int weekday()
		```
		
		Returns the weekday of this instant in GMT. Sunday is 0, Monday is 1, etc.
		- #### clicks
		
		
		
		```
		public abstract long clicks()
		```
		
		Returns this instant as "clicks", i.e. as milliseconds since January 1, 1970, 00:00:00 GMT
		- #### isLeapYear
		
		
		
		```
		public abstract boolean isLeapYear()
		```
		
		Returns if this instant interpreted as a Date in GMT belongs to a leap year.
		- #### weekdayStr
		
		
		
		```
		public abstract java.lang.String weekdayStr()
		```
		
		Returns the day of the week as a 3 letter abbreviation:
		 \`Sun\`, \`Mon\`, \`Tue\`, \`Wed\`, \`Thu\`, \`Fri\` or \`Sat\`
		- #### monthStr
		
		
		
		```
		public abstract java.lang.String monthStr()
		```
		
		Returns the month as a 3 letter abbreviation:
		 \`Jan\`, \`Feb\`, \`Mar\`, \`Apr\`, \`May\`, \`Jun\`, \`Jul\`, \`Aug\`, \`Sep\`, \`Oct\`, \`Nov\` or \`Dec\`
		- #### toIsoDateString
		
		
		
		```
		public abstract java.lang.String toIsoDateString()
		```
		
		Returns a String representation like this: \`yyyy\-mm\-dd\`
		- #### toIsoDateTimeString
		
		
		
		```
		public abstract java.lang.String toIsoDateTimeString()
		```
		
		Returns a String representation like this: \`yyyy\-mm\-ddThh:mm:ss\`
		- #### toIsoLikeDateTimeString
		
		
		
		```
		public abstract java.lang.String toIsoLikeDateTimeString()
		```
		
		Returns a String representation like this: \`yyyy\-mm\-dd hh:mm:ss\`
		- #### toRfc1123DateTimeString
		
		
		
		```
		public abstract java.lang.String toRfc1123DateTimeString()
		```
		
		Returns an RFC1123 date string, e.g. \`Sun, 06 Nov 1994 08:49:37 GMT\`
		- #### now
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.javadsl.model") now()
		```
		
		Returns a new DateTime instance representing the current instant.
		- #### minus
		
		
		
		```
		public abstract [DateTime](DateTime.html "class in akka.http.javadsl.model") minus​(long millis)
		```
		
		Creates a new \`DateTime\` that represents the point in time the given number of ms earlier.
		- #### plus
		
		
		
		```
		public abstract [DateTime](DateTime.html "class in akka.http.javadsl.model") plus​(long millis)
		```
		
		Creates a new \`DateTime\` that represents the point in time the given number of ms later.
		- #### fromIsoDateTimeString
		
		
		
		```
		public static java.util.Optional<[DateTime](DateTime.html "class in akka.http.javadsl.model")> fromIsoDateTimeString​(java.lang.String isoDateTimeString)
		```
		
		Returns a new DateTime instance parsed from IsoDateTimeString as Some(dateTime). Returns None if
		 parsing has failed.
		- #### create
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.javadsl.model") create​(long clicks)
		```
		
		Returns a new DateTime instance representing the instant as defined by "clicks"
		 i.e. from the number of milliseconds since the start of "the epoch", namely
		 January 1, 1970, 00:00:00 GMT.
		 Note that this implementation discards milliseconds (i.e. rounds down to full seconds).
		- #### create
		
		
		
		```
		public static [DateTime](DateTime.html "class in akka.http.javadsl.model") create​(int year,
		                              int month,
		                              int day,
		                              int hour,
		                              int minute,
		                              int second)
		```
		
		Returns a new DateTime instance by interpreting the given date/time components as an instant in GMT.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html)*