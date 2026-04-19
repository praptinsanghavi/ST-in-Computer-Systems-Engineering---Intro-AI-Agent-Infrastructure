---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html
title: Uri.Path
---

# Uri.Path

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Uri.Path

- java.lang.Object
- - akka.http.scaladsl.model.Uri.Path

- Direct Known Subclasses:
`[Uri.Path$.Segment](Uri.Path$.Segment.html "class in akka.http.scaladsl.model")`, `[Uri.Path$.SlashOrEmpty](Uri.Path$.SlashOrEmpty.html "class in akka.http.scaladsl.model")`

Enclosing class:
[Uri](Uri.html "class in akka.http.scaladsl.model")

---

```
public abstract static class Uri.Path
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Path](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract int` | `[charCount](#charCount())()` |  |
	| `abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[dropChars](#dropChars(int))​(int count)` |  |
	| `boolean` | `[endsWith](#endsWith(java.lang.String,boolean))​(java.lang.String suffix,  boolean ignoreTrailingSlash)` |  |
	| `boolean` | `[endsWithSlash](#endsWithSlash())()` |  |
	| `abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[head](#head())()` |  |
	| `abstract boolean` | `[isEmpty](#isEmpty())()` |  |
	| `abstract int` | `[length](#length())()` |  |
	| `[Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[reverse](#reverse())()` |  |
	| `abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[reverseAndPrependTo](#reverseAndPrependTo(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") prefix)` |  |
	| `abstract boolean` | `[startsWith](#startsWith(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") that)` |  |
	| `abstract boolean` | `[startsWithSegment](#startsWithSegment())()` |  |
	| `abstract boolean` | `[startsWithSlash](#startsWithSlash())()` |  |
	| `abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model")` | `[tail](#tail())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Path
		
		
		
		```
		public Path()
		```

	- ### Method Detail
	
	
	
		- #### isEmpty
		
		
		
		```
		public abstract boolean isEmpty()
		```
		- #### startsWithSlash
		
		
		
		```
		public abstract boolean startsWithSlash()
		```
		- #### startsWithSegment
		
		
		
		```
		public abstract boolean startsWithSegment()
		```
		- #### endsWithSlash
		
		
		
		```
		public boolean endsWithSlash()
		```
		- #### endsWith
		
		
		
		```
		public final boolean endsWith​(java.lang.String suffix,
		                              boolean ignoreTrailingSlash)
		```
		- #### head
		
		
		
		```
		public abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") head()
		```
		- #### tail
		
		
		
		```
		public abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") tail()
		```
		- #### length
		
		
		
		```
		public abstract int length()
		```
		- #### charCount
		
		
		
		```
		public abstract int charCount()
		```
		- #### reverse
		
		
		
		```
		public [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") reverse()
		```
		- #### reverseAndPrependTo
		
		
		
		```
		public abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") reverseAndPrependTo​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") prefix)
		```
		- #### startsWith
		
		
		
		```
		public abstract boolean startsWith​([Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") that)
		```
		- #### dropChars
		
		
		
		```
		public abstract [Uri.Path](Uri.Path.html "class in akka.http.scaladsl.model") dropChars​(int count)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path$.Segment.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path$.SlashOrEmpty.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html)*