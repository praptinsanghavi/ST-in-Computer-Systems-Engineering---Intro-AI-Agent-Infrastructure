---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/LicenseKeySupplier.html
title: LicenseKeySupplier
---

# LicenseKeySupplier

## Content

Package [akka.actor.dungeon](package-summary.html)
## Interface LicenseKeySupplier

- ---

```
public interface LicenseKeySupplier
```

INTERNAL API: Supplies an Akka license key.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[get](#get(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `void` | `[implementing_this_is_a_violation_of_the_akka_license](#implementing_this_is_a_violation_of_the_akka_license())()` | This method exists to make clear to anyone that is trying to circumvent the Akka license check  that doing so is a violation of the Akka license. |

- - ### Method Detail
	
	
	
		- #### implementing\_this\_is\_a\_violation\_of\_the\_akka\_license
		
		
		
		```
		void implementing_this_is_a_violation_of_the_akka_license()
		```
		
		This method exists to make clear to anyone that is trying to circumvent the Akka license check
		 that doing so is a violation of the Akka license.
		- #### get
		
		
		
		```
		java.lang.String get​(com.typesafe.config.Config config)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/LicenseKeySupplier.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/LicenseKeySupplier.html)*