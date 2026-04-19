---
description: 'declaration: package: akka.javasdk, class: CommandException'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:44Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CommandException.html
title: CommandException
---

# CommandException

> **Summary:** declaration: package: akka.javasdk, class: CommandException

## Content

Package [akka.javasdk](package-summary.html)
# Class CommandException

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")
[Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")
[RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")
[IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")
akka.javasdk.CommandException

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`

---

public class CommandException
extends [IllegalArgumentException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/IllegalArgumentException.html "class or interface in java.lang")
An exception that can be thrown by user code to signal domain validation errors or business rule
 violations.

 This exception is designed to be used in command handlers of [`KeyValueEntity`](keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity"), [`EventSourcedEntity`](eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity"), or [`Workflow`](workflow/Workflow.html "class in akka.javasdk.workflow") components when the incoming command doesn't fulfill the
 requirements or the current state doesn't allow the command to be handled.

 

**HTTP Response Behavior:**

- By default, `CommandException` is transformed into an HTTP 400 Bad Request response
- The exception message becomes the response body
- Can be caught and transformed into custom HTTP responses for fine\-tuned error handling

**Network Serialization:** Only `CommandException` and its subtypes are
 serialized and sent over the network when components are called across different nodes. Other
 exceptions are transformed into generic HTTP 500 errors. The Jackson serialization is configured
 to ignore fields like stack trace or cause from the [`Throwable`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang") class.

 

**Usage Examples:**

Using error effects:

 

```

 // In a command handler
 if (value > 10000) {
   return effects().error("Increasing counter above 10000 is blocked");
 }
 
```

Throwing directly:

 

```

 // In a command handler
 if (value > 10000) {
   throw new CommandException("Increasing counter above 10000 is blocked");
 }
 
```

Creating custom subtypes:

 

```

 public class CounterLimitExceededException extends CommandException {
   public CounterLimitExceededException(String message) {
     super(message);
   }
 }

 // Usage
 throw new CounterLimitExceededException("Counter limit exceeded");
 
```

**Error Handling in Endpoints:**

```

 try {
   return componentClient
            .forEventSourcedEntity(counterId)
            .method(CounterEntity::increase)
            .invoke(value);
 } catch (CommandException e) {
   // Handle the command exception, e.g., return a bad request response
 }
 
```

See Also:

- [`KeyValueEntity`](keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity")
- [`EventSourcedEntity`](eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity")
- [`Workflow`](workflow/Workflow.html "class in akka.javasdk.workflow")
- [Serialized Form](../../serialized-form.html#akka.javasdk.CommandException)

- ## Constructor Summary

Constructors

Constructor
Description
`[CommandException](#%3Cinit%3E(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message)`
- ## Method Summary

Modifier and Type
Method
Description
`[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")`
`[fillInStackTrace](#fillInStackTrace())()`
 

### Methods inherited from class java.lang.[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")

`[addSuppressed](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#addSuppressed(java.lang.Throwable) "class or interface in java.lang"), [getCause](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getCause() "class or interface in java.lang"), [getLocalizedMessage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getLocalizedMessage() "class or interface in java.lang"), [getMessage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getMessage() "class or interface in java.lang"), [getStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getStackTrace() "class or interface in java.lang"), [getSuppressed](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getSuppressed() "class or interface in java.lang"), [initCause](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#initCause(java.lang.Throwable) "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace() "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace(java.io.PrintStream) "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace(java.io.PrintWriter) "class or interface in java.lang"), [setStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#setStackTrace(java.lang.StackTraceElement%5B%5D) "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#toString() "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### CommandException
	
	
	public CommandException([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message)
- ## Method Details

	- ### fillInStackTrace
	
	
	public [Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang") fillInStackTrace()
	
	Overrides:
	`[fillInStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#fillInStackTrace() "class or interface in java.lang")` in class `[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")`

## Code Examples

### Example 1: Class CommandException

```text
// In a command handler
 if (value > 10000) {
   return effects().error("Increasing counter above 10000 is blocked");
 }
```

### Example 2: Class CommandException

```text
// In a command handler
 if (value > 10000) {
   throw new CommandException("Increasing counter above 10000 is blocked");
 }
```

### Example 3: Class CommandException

```text
public class CounterLimitExceededException extends CommandException {
   public CounterLimitExceededException(String message) {
     super(message);
   }
 }

 // Usage
 throw new CounterLimitExceededException("Counter limit exceeded");
```

### Example 4: Class CommandException

```text
try {
   return componentClient
            .forEventSourcedEntity(counterId)
            .method(CounterEntity::increase)
            .invoke(value);
 } catch (CommandException e) {
   // Handle the command exception, e.g., return a bad request response
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html
- https://doc.akka.io/sdk/_attachments/api/serialized-form.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CommandException.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CommandException.html)*