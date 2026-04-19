---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.StringMayWrapperForVerb.html
title: MayVerb.StringMayWrapperForVerb
---

# MayVerb.StringMayWrapperForVerb

## Content

Package [akka.persistence.scalatest](package-summary.html)
## Interface MayVerb.StringMayWrapperForVerb

- Enclosing interface:
[MayVerb](MayVerb.html "interface in akka.persistence.scalatest")

---

```
public static interface MayVerb.StringMayWrapperForVerb
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[leftSideString](#leftSideString())()` |  |
	| `void` | `[may](#may(scala.Function0,org.scalatest.verbs.StringVerbBlockRegistration,org.scalactic.source.Position))​(scala.Function0<scala.runtime.BoxedUnit> right,  org.scalatest.verbs.StringVerbBlockRegistration fun,  org.scalactic.source.Position pos)` | Block of tests which MAY pass, and if not should be ignored. |

- - ### Method Detail
	
	
	
		- #### leftSideString
		
		
		
		```
		java.lang.String leftSideString()
		```
		- #### may
		
		
		
		```
		void may​(scala.Function0<scala.runtime.BoxedUnit> right,
		         org.scalatest.verbs.StringVerbBlockRegistration fun,
		         org.scalactic.source.Position pos)
		```
		
		Block of tests which MAY pass, and if not should be ignored.
		 Such as rules which may be optionally implemented by Journals.
		 
		 MUST be used in conjunction with [`MayVerb.optional(java.lang.String, scala.Function0<scala.runtime.BoxedUnit>)`](MayVerb.html#optional(java.lang.String,scala.Function0)) to provide explanation as to why it may be ok to fail this spec.
		 
		
		
		 The word `MAY` is to be understood as defined in RFC 2119
		 
		
		
		
		See Also:
		[RFC 2119](https://www.rfc-editor.org/rfc/rfc2119.txt)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.StringMayWrapperForVerb.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.StringMayWrapperForVerb.html)*