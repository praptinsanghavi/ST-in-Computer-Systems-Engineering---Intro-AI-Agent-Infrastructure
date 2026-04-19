---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:45:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/internal/ResponseCode$.html
title: ResponseCode$
---

# ResponseCode$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class ResponseCode$

- java.lang.Object
- - scala.Enumeration
	- - akka.io.dns.internal.ResponseCode$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ResponseCode$
extends scala.Enumeration
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.io.dns.internal.ResponseCode$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class scala.Enumeration
		
		
		`scala.Enumeration.Val, scala.Enumeration.Value, scala.Enumeration.ValueOrdering$, scala.Enumeration.ValueSet, scala.Enumeration.ValueSet$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ResponseCode$](ResponseCode$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |
	
	
		- ### Fields inherited from class scala.Enumeration
		
		
		`scala$Enumeration$$bottomId, scala$Enumeration$$topId`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResponseCode$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Enumeration.Value` | `[FORMAT_ERROR](#FORMAT_ERROR())()` |  |
	| `scala.Enumeration.Value` | `[NAME_ERROR](#NAME_ERROR())()` |  |
	| `scala.Enumeration.Value` | `[NOT_IMPLEMENTED](#NOT_IMPLEMENTED())()` |  |
	| `scala.Enumeration.Value` | `[REFUSED](#REFUSED())()` |  |
	| `scala.Enumeration.Value` | `[SERVER_FAILURE](#SERVER_FAILURE())()` |  |
	| `scala.Enumeration.Value` | `[SUCCESS](#SUCCESS())()` |  |
	
	
		- ### Methods inherited from class scala.Enumeration
		
		
		`apply, maxId, nextId, nextId_$eq, nextName, nextName_$eq, readResolve, scala$Enumeration$$nameOf, scala$Enumeration$$nextNameOrNull, scala$Enumeration$$vmap, scala$Enumeration$$vsetDefined_$eq, toString, Value, Value, Value, Value, ValueOrdering, values, ValueSet, withName`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ResponseCode$](ResponseCode$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResponseCode$
		
		
		
		```
		public ResponseCode$()
		```

	- ### Method Detail
	
	
	
		- #### SUCCESS
		
		
		
		```
		public scala.Enumeration.Value SUCCESS()
		```
		- #### FORMAT\_ERROR
		
		
		
		```
		public scala.Enumeration.Value FORMAT_ERROR()
		```
		- #### SERVER\_FAILURE
		
		
		
		```
		public scala.Enumeration.Value SERVER_FAILURE()
		```
		- #### NAME\_ERROR
		
		
		
		```
		public scala.Enumeration.Value NAME_ERROR()
		```
		- #### NOT\_IMPLEMENTED
		
		
		
		```
		public scala.Enumeration.Value NOT_IMPLEMENTED()
		```
		- #### REFUSED
		
		
		
		```
		public scala.Enumeration.Value REFUSED()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/internal/ResponseCode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/internal/ResponseCode$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/dns/internal/ResponseCode$.html)*