---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Switch.html
title: Switch
---

# Switch

## Content

Package [akka.util](package-summary.html)
## Class Switch

- java.lang.Object
- - akka.util.Switch

- ---

```
public class Switch
extends java.lang.Object
```

An atomic switch that can be either on or off

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Switch](#%3Cinit%3E(boolean))​(boolean startAsOn)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `<T> T` | `[fold](#fold(scala.Function0,scala.Function0))​(scala.Function0<T> on,  scala.Function0<T> off)` | Executes the provided callbacks depending on if the switch is either on or off waiting for any pending changes to happen before (locking)  Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance |
	| `boolean` | `[ifOff](#ifOff(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action and returns if the action was executed or not, if the switch is IMMEDIATELY off (i.e. |
	| `<T> scala.Option<T>` | `[ifOffYield](#ifOffYield(scala.Function0))​(scala.Function0<T> action)` | Executes the provided action and returns its value if the switch is IMMEDIATELY off (i.e. |
	| `boolean` | `[ifOn](#ifOn(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action and returns if the action was executed or not, if the switch is IMMEDIATELY on (i.e. |
	| `<T> scala.Option<T>` | `[ifOnYield](#ifOnYield(scala.Function0))​(scala.Function0<T> action)` | Executes the provided action and returns its value if the switch is IMMEDIATELY on (i.e. |
	| `boolean` | `[isOff](#isOff())()` | Returns whether the switch is IMMEDIATELY off (no locking) |
	| `boolean` | `[isOn](#isOn())()` | Returns whether the switch is IMMEDIATELY on (no locking) |
	| `<T> T` | `[locked](#locked(scala.Function0))​(scala.Function0<T> code)` | Executes the given code while holding this switch\&rsquo;s lock, i.e. |
	| `boolean` | `[switchOff](#switchOff())()` | Switches the switch off (if on), uses locking |
	| `boolean` | `[switchOff](#switchOff(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action if the lock is on under a lock, so be \_very\_ careful with longrunning/blocking operations in it  Only executes the action if the switch is on, and switches it off immediately after obtaining the lock  Will switch it back on if the provided action throws an exception |
	| `boolean` | `[switchOn](#switchOn())()` | Switches the switch on (if off), uses locking |
	| `boolean` | `[switchOn](#switchOn(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action if the lock is off under a lock, so be \_very\_ careful with longrunning/blocking operations in it  Only executes the action if the switch is off, and switches it on immediately after obtaining the lock  Will switch it back off if the provided action throws an exception |
	| `protected boolean` | `[transcend](#transcend(boolean,scala.Function0))​(boolean from,  scala.Function0<scala.runtime.BoxedUnit> action)` |  |
	| `boolean` | `[whileOff](#whileOff(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action and returns if the action was executed or not, if the switch is off, waiting for any pending changes to happen before (locking)  Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance |
	| `<T> scala.Option<T>` | `[whileOffYield](#whileOffYield(scala.Function0))​(scala.Function0<T> action)` | Executes the provided action and returns its value if the switch is off, waiting for any pending changes to happen before (locking)  Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance |
	| `boolean` | `[whileOn](#whileOn(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> action)` | Executes the provided action and returns if the action was executed or not, if the switch is on, waiting for any pending changes to happen before (locking)  Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance |
	| `<T> scala.Option<T>` | `[whileOnYield](#whileOnYield(scala.Function0))​(scala.Function0<T> action)` | Executes the provided action and returns its value if the switch is on, waiting for any pending changes to happen before (locking)  Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Switch
		
		
		
		```
		public Switch​(boolean startAsOn)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static boolean $lessinit$greater$default$1()
		```
		- #### transcend
		
		
		
		```
		protected boolean transcend​(boolean from,
		                            scala.Function0<scala.runtime.BoxedUnit> action)
		```
		- #### switchOff
		
		
		
		```
		public boolean switchOff​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action if the lock is on under a lock, so be \_very\_ careful with longrunning/blocking operations in it
		 Only executes the action if the switch is on, and switches it off immediately after obtaining the lock
		 Will switch it back on if the provided action throws an exception
		- #### switchOn
		
		
		
		```
		public boolean switchOn​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action if the lock is off under a lock, so be \_very\_ careful with longrunning/blocking operations in it
		 Only executes the action if the switch is off, and switches it on immediately after obtaining the lock
		 Will switch it back off if the provided action throws an exception
		- #### switchOff
		
		
		
		```
		public boolean switchOff()
		```
		
		Switches the switch off (if on), uses locking
		- #### switchOn
		
		
		
		```
		public boolean switchOn()
		```
		
		Switches the switch on (if off), uses locking
		- #### ifOnYield
		
		
		
		```
		public <T> scala.Option<T> ifOnYield​(scala.Function0<T> action)
		```
		
		Executes the provided action and returns its value if the switch is IMMEDIATELY on (i.e. no lock involved)
		- #### ifOffYield
		
		
		
		```
		public <T> scala.Option<T> ifOffYield​(scala.Function0<T> action)
		```
		
		Executes the provided action and returns its value if the switch is IMMEDIATELY off (i.e. no lock involved)
		- #### ifOn
		
		
		
		```
		public boolean ifOn​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action and returns if the action was executed or not, if the switch is IMMEDIATELY on (i.e. no lock involved)
		- #### ifOff
		
		
		
		```
		public boolean ifOff​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action and returns if the action was executed or not, if the switch is IMMEDIATELY off (i.e. no lock involved)
		- #### whileOnYield
		
		
		
		```
		public <T> scala.Option<T> whileOnYield​(scala.Function0<T> action)
		```
		
		Executes the provided action and returns its value if the switch is on, waiting for any pending changes to happen before (locking)
		 Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance
		- #### whileOffYield
		
		
		
		```
		public <T> scala.Option<T> whileOffYield​(scala.Function0<T> action)
		```
		
		Executes the provided action and returns its value if the switch is off, waiting for any pending changes to happen before (locking)
		 Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance
		- #### whileOn
		
		
		
		```
		public boolean whileOn​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action and returns if the action was executed or not, if the switch is on, waiting for any pending changes to happen before (locking)
		 Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance
		- #### whileOff
		
		
		
		```
		public boolean whileOff​(scala.Function0<scala.runtime.BoxedUnit> action)
		```
		
		Executes the provided action and returns if the action was executed or not, if the switch is off, waiting for any pending changes to happen before (locking)
		 Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance
		- #### fold
		
		
		
		```
		public <T> T fold​(scala.Function0<T> on,
		                  scala.Function0<T> off)
		```
		
		Executes the provided callbacks depending on if the switch is either on or off waiting for any pending changes to happen before (locking)
		 Be careful of longrunning or blocking within the provided action as it can lead to deadlocks or bad performance
		- #### locked
		
		
		
		```
		public <T> T locked​(scala.Function0<T> code)
		```
		
		Executes the given code while holding this switch\&rsquo;s lock, i.e. protected from concurrent modification of the switch status.
		- #### isOn
		
		
		
		```
		public boolean isOn()
		```
		
		Returns whether the switch is IMMEDIATELY on (no locking)
		- #### isOff
		
		
		
		```
		public boolean isOff()
		```
		
		Returns whether the switch is IMMEDIATELY off (no locking)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Switch.html](https://doc.akka.io/japi/akka/current/akka/util/Switch.html)*