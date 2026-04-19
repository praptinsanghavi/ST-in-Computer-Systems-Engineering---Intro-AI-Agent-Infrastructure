---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:05Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/ai-coding-assistant.html
title: 'Using an AI coding assistant :: Akka Documentation'
---

# Using an AI coding assistant :: Akka Documentation

## Content

# Using an AI coding assistant

AI coding assistants can increase your productivity when developing Akka services. This guide will give you some practical hints of how to setup Akka knowledge and how to prompt the AI assistant. We are using [Claude code](https://docs.claude.com/en/docs/claude-code/overview), [Qodo](https://www.qodo.ai), [Cursor](https://www.cursor.com) and [IntelliJ IDEA](https://www.jetbrains.com/help/idea/ai-assistant-in-jetbrains-ides.html) as examples of such coding assistants, but the techniques are applicable for other tools as well.

Some key benefits of using an AI coding assistant:

- **Scaffolding:** Quickly create a foundational structure for your Akka services, ready to be filled with business logic.
- **Faster learning:** Accelerate your understanding and application of Akka concepts.
- **Code comprehension:** Get an overview explanation of existing codebases or sample applications.
- **Debugging:** Get assistance in identifying and resolving issues.
- **Test generation:** Rapidly generate tests to ensure code correctness.

In summary, we will look at the following:

1. Akka documentation in LLM\-friendly format
2. Configure your AI assistant (Cursor, Qodo, etc.) to use this documentation
3. Include relevant sample code as additional context
4. Use our coding guidelines template for better code generation
5. Follow the prompt examples for common Akka development tasks

## Why doesn’t AI know about latest Akka?

The LLMs have been trained on web content that didn’t include the latest documentation of the Akka SDK. If you ask it questions about Akka it will answer based on the knowledge it was trained on, which most certainly was about the Akka libraries. Some assistants will try to use web search to retrieve the latest information, but that is typically not enough and not an efficient way for a coding assistant. For example, if you ask:

```
What are the core components of Akka?
```

The AI response will look something like this…​

```
Akka is a toolkit for building highly concurrent, distributed,
and resilient message-driven applications...
1. Actor System ...
2. Actors ...
...
```

This is correct for the Akka libraries but not helpful when developing with the Akka SDK.

We need to give the LLM knowledge about the latest Akka documentation.

## LLM\-friendly documentation

In addition to human\-readable HTML, the Akka documentation is also published in markdown format that an LLM can understand in a good and efficient way. Each page has a corresponding `.md` page, for example [event\-sourced\-entities.html.md](https://doc.akka.io/sdk/event-sourced-entities.html.md).

The markdown documentation is published according to the widely used standard proposal [llmstxt](https://llmstxt.org):

- [llms.txt](https://doc.akka.io/llms.txt) \- website index
- [llms\-full.txt](https://doc.akka.io/llms-full.txt) \- full, concatenated, documentation
- [llms\-ctx.txt](https://doc.akka.io/llms-ctx.txt) \- full documentation without the optional parts of llms.txt
- [llms\-ctx\-full.txt](https://doc.akka.io/llms-ctx-full.txt) \- full documentation including the optional parts of llms.txt

## Setup AI assistant to use the Akka documentation

We need to make the AI coding assistant aware of the latest Akka documentation. The Akka CLI will help you with this. [Install the Akka CLI](../getting-started/quick-install-cli.html) and run:

```
akka code init
```

1. Select an example, such as the "Hello world agent".
2. The CLI will download the Akka documentation and place it in the `akka-context` directory.
3. Select which AI coding assistant to use. The CLI will describe the additional steps of how to configure the assistant.

Make sure that you download the latest documentation regularly to make use of documentation improvements and new features. This can be done with:

```
akka code context-update .
```

The `akka-context` documentation bundle is also available as [akka\-docs\-md.zip](../sdk/_attachments/akka-docs-md.zip) if you prefer that.

Add `akka-context` to your `.gitignore` file, if you use git.

If your AI coding assistant isn’t included in the Akka CLI you can use the [AGENTS.md](https://agents.md) option in the Akka CLI, or download it from [Akka AGENTS.md](../_attachments/AGENTS.md).

### Notes about Claude code

For [Claude code](https://www.anthropic.com/claude-code) the `CLAUDE.md` from the Akka CLI includes the detailed instructions from `AGENTS.md`. The reason for the separation into two files is that you should be able to download updated versions of `AGENTS.md` and have your custom instructions in `CLAUDE.md` remain unchanged.

This `CLAUDE.md` also defines an iterative generation workflow. You can modify or remove that if you prefer another way of working with Claude.

### Notes about Copilot

If you are using [Github Copilot](https://github.com/features/copilot) as a standalone editor or [as a CLI](https://docs.github.com/en/copilot/concepts/agents/about-copilot-cli), then it should automatically detect the context from the files used during code initialization. If it is not using the `akka-context` directory, then you can manually add this directory by attaching it to context in your copilot chat, either with the paperclip (📎) icon in the IDE or with the `#` prefix in either app.

### Notes about Cursor

An alternative to the local `akka-context` documentation is to use documentation from a custom website, and include relevant information to the LLM by similarity search of that content.

You can point it directly to `<https://doc.akka.io/llms-full.txt>`, which is already in LLM\-friendly markdown format.

You find the settings for custom documentation in: Cursor Settings \> Features \> Docs

In the chat window it is important that you include the Akka documentation as context. Type `@Docs` \- tab, and select the custom Akka docs that you added in the settings.

### Notes about Qodo

In the chat window it is important that you include the Akka documentation as context. Use `@` to include the `akka-context` folder.

### Notes about IntelliJ IDEA AI assistant

For the AI assistant in IntelliJ IDEA you can download the [llms\-ctx.txt](https://doc.akka.io/llms-ctx.txt) file and place it in the root of the project directory. The AI assistant will include relevant information to the LLM.

Add `llms-ctx.txt` to your `.gitignore` file, if you use git.

It is important that you include the Akka documentation as context by enabling `Codebase` in the chat window.

Make sure that you download the latest documentation regularly to make use of documentation improvements and new features.

### Notes about Gemini CLI

For Gemini CLI you can use `akka code init` and select Claude as coding assistant. Then rename the file `CLAUDE.md` to `GEMINI.md`.

If Gemini CLI doesn’t make use of the documentation in `akka-context` directory it can be because it is listed in `.gitignore`. Then you have to remove `akka-context` from `.gitignore`.

### Notes about OpenAI Codex

If Codex doesn’t make use of the documentation in `akka-context` directory it can be because it is listed in `.gitignore`. Then you have to remove `akka-context` from `.gitignore`.

## Verify that it works

To verify that the assistant now knows about Akka, we can ask the question again:

```
What are the core components of Akka?
```

it should answer with something like

```
1. Event Sourced Entities ...
2. Key Value Entities ...
3. HTTP Endpoints ...
...
```

## Include sample source code

Even though the documentation includes comprehensive code snippets it can be good to include the full source code of one or a few samples. This makes it easier for the coding assistant to follow the same structure as the sample.

1. Pick one or a few samples from [Additional samples](../getting-started/samples.html), which are relevant to what you are developing. If you are just getting started learning Akka you can pick the Shopping Cart sample.
2. Clone the sample GitHub repository. Pull latest if you have already cloned the repository before.
3. Copy the source code to a folder `akka-context/` in your development project, e.g. `akka-context/travel-agent/src`.
4. Add `akka-context/` to your `.gitignore` file, if you use git.

Include the samples (`akka-context/`) as context in the chat window.

Make sure that you pull the latest samples regularly to make use of improvements and new features.

## Coding guidelines

The coding assistant will generate more accurate code if we give it some detailed instructions. We have prepared such [guidelines](ai-coding-assistant-guidelines.html) that you can use as a template. You find even more detailed instructions in [AGENTS.md](../_attachments/AGENTS.md)

For some assistants you can define instructions in configuration settings or files like `AGENTS.md` or `CLAUDE.md`.

If your AI coding assistant doesn’t support that, you can include the guidelines directly in the chat session prompt like this:

```
Don't generate any code yet, but remember the following guidelines and use them when writing code in this project.

<paste guidelines>
```

You can copy\-paste the guidelines from [ai\-coding\-assistant\-guidelines.html.md](https://doc.akka.io/sdk/ai-coding-assistant-guidelines.html.md)

## Prompt examples

Here are some examples of prompts that you can use as templates when giving instruction to the coding assistant.

### General advise

- Develop incrementally and don’t ask for too much at the same time.
- Compile and test after each step using `mvn test` or `mvn verify`. Fix compilation errors and test failures before proceeding too far.
- Commit the changes often so that you can compare and revert if something goes wrong.
- Be precise in the instructions and make corrections by further instructions if it doesn’t generate what you want.
- Even with custom docs, AI might still occasionally "hallucinate" or provide slightly off answers. It’s important to include time for human review in the development loop.
- Make sure that the AI does not introduce security vulnerabilities. You are still responsible for the generated code.
- Some things are just easier with ordinary IDE tooling, such as simple refactoring.

### Entities

```
Create a credit card entity, use the shopping cart sample as template.
```

That will probably generate an event sourced entity, but you can be more specific by saying "event sourced entity" or "key value entity."

To matches your business domain you should be more precise when it comes to what to include in the domain objects. Start small, and iterate.

```
Let's add a unit test for the entity
```

Ensure it uses the `EventSourcedTestKit`, which is described in the coding guidelines.

### Endpoints

```
Add an http endpoint for the entity
```

```
Add example curl commands for the endpoint to the readme
```

```
Add an integration test for the endpoint
```

Ensure it uses the integration test is using the `httpClient` of the `TestKitSupport`, which is described in the coding guidelines.

### Views

```
Add a View that lists brief credit card information given a cardholder name
```

```
Add an integration test for the view
```

```
Include the endpoint for the view in the existing CreditCardEndpoint
```

```
add example curl commands for that in the readme
```

### Workflow

```
Create a Workflow that transfers money from an external bank service to the credit card. It should have the following steps:
- withdraw
- deposit
- compensate-withdraw

The transitions for a transfer:
- starts with the bank withdrawal
- if withdrawal was successful it continues with the credit card deposit
- if the deposit fails for some reason it should return the money to the bank account in the compensate-withdraw step
```

### Runtime errors

If you see an error message when running the application or tests you can try to ask the assistant for help finding the bug. Paste the error message in the chat question.

## See also

- [Spec\-Driven Development](spec-driven-development.html)

## Code Examples

### Example 1: Why doesn’t AI know about latest Akka?

```none
What are the core components of Akka?
```

### Example 2: Why doesn’t AI know about latest Akka?

```none
Akka is a toolkit for building highly concurrent, distributed,
and resilient message-driven applications...
1. Actor System ...
2. Actors ...
...
```

### Example 3: Setup AI assistant to use the Akka documentation

```command
akka code init
```

### Example 4: Setup AI assistant to use the Akka documentation

```command
akka code context-update .
```

### Example 5: Verify that it works

```none
What are the core components of Akka?
```

### Example 6: Verify that it works

```none
1. Event Sourced Entities ...
2. Key Value Entities ...
3. HTTP Endpoints ...
...
```

### Example 7: Coding guidelines

```none
Don't generate any code yet, but remember the following guidelines and use them when writing code in this project.

<paste guidelines>
```

### Example 8: Entities

```none
Create a credit card entity, use the shopping cart sample as template.
```

### Example 9: Entities

```none
Let's add a unit test for the entity
```

### Example 10: Endpoints

```none
Add an http endpoint for the entity
```

### Example 11: Endpoints

```none
Add example curl commands for the endpoint to the readme
```

### Example 12: Endpoints

```none
Add an integration test for the endpoint
```

### Example 13: Views

```none
Add a View that lists brief credit card information given a cardholder name
```

### Example 14: Views

```none
Add an integration test for the view
```

### Example 15: Views

```none
Include the endpoint for the view in the existing CreditCardEndpoint
```

### Example 16: Views

```none
add example curl commands for that in the readme
```

### Example 17: Workflow

```none
Create a Workflow that transfers money from an external bank service to the credit card. It should have the following steps:
- withdraw
- deposit
- compensate-withdraw

The transitions for a transfer:
- starts with the bank withdrawal
- if withdrawal was successful it continues with the credit card deposit
- if the deposit fails for some reason it should return the money to the bank account in the compensate-withdraw step
```

## Related Pages (Internal Links)

- https://doc.akka.io/_attachments/AGENTS.md
- https://doc.akka.io/getting-started/quick-install-cli.html
- https://doc.akka.io/getting-started/samples.html
- https://doc.akka.io/llms-ctx-full.txt
- https://doc.akka.io/llms-ctx.txt
- https://doc.akka.io/llms-full.txt
- https://doc.akka.io/llms.txt
- https://doc.akka.io/sdk/_attachments/akka-docs-md.zip
- https://doc.akka.io/sdk/ai-coding-assistant-guidelines.html
- https://doc.akka.io/sdk/ai-coding-assistant-guidelines.html.md
- https://doc.akka.io/sdk/event-sourced-entities.html.md
- https://doc.akka.io/sdk/spec-driven-development.html

---
*Source: [https://doc.akka.io/sdk/ai-coding-assistant.html](https://doc.akka.io/sdk/ai-coding-assistant.html)*