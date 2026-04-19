---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/annotation/ApiMayChange.html
title: ApiMayChange
---

# ApiMayChange

## Content

Package [akka.annotation](package-summary.html)
## Annotation Type ApiMayChange

- ---

```
@Documented
@Retention(CLASS)
@Target({METHOD,CONSTRUCTOR,FIELD,TYPE,PACKAGE})
public @interface ApiMayChange
```

Marks APIs that are meant to evolve towards becoming stable APIs, but are not stable APIs yet.

 Evolving interfaces MAY change from one patch release to another (i.e. 2\.4\.10 to 2\.4\.11\)
 without up\-front notice. A best\-effort approach is taken to not cause more breakage than really
 necessary, and usual deprecation techniques are utilised while evolving these APIs, however there
 is NO strong guarantee regarding the source or binary compatibility of APIs marked using this
 annotation.

 

It MAY also change when promoting the API to stable, for example such changes may include
 removal of deprecated methods that were introduced during the evolution and final refactoring
 that were deferred because they would have introduced to much breaking changes during the
 evolution phase.

 

Promoting the API to stable MAY happen in a patch release.

 

It is encouraged to document in ScalaDoc how exactly this API is expected to evolve.

- - ### Optional Element Summary
	
	
	
	Optional Elements 
	| Modifier and Type | Optional Element | Description |
	| `java.lang.String` | `[issue](#issue())` | Reference to issue discussing the future evolvement of this API |

- - ### Element Detail
	
	
	
		- #### issue
		
		
		
		```
		java.lang.String issue
		```
		
		Reference to issue discussing the future evolvement of this API
		
		Default:
		""

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/annotation/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/annotation/ApiMayChange.html](https://doc.akka.io/japi/akka-core/2.10/akka/annotation/ApiMayChange.html)*