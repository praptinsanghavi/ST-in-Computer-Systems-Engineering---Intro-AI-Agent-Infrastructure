// Declares this class as part of the root 'springai' package of the application.
// Placing the controller at the root package (edu.neu.springai) ensures that
// Spring Boot's @SpringBootApplication component scan, which starts from this package,
// automatically discovers this class without any additional configuration.
package edu.neu.springai;

// Imports the GutenbergTools class from the 'tools' sub-package.
// GutenbergTools holds the @Tool-annotated methods (e.g., firstSentencesContaining,
// countSentencesContaining) that the LLM can invoke as tools during a conversation.
// By importing it here, this controller can register those tools with the ChatClient.
import edu.neu.springai.tools.GutenbergTools;

// Imports the ChatClient interface from Spring AI.
// ChatClient is the primary high-level abstraction for interacting with a Large Language Model (LLM).
// It provides a fluent builder API to configure system prompts, tools, and message content,
// then call the model and retrieve its response in a clean, readable chain.
import org.springframework.ai.chat.client.ChatClient;

// Imports the @GetMapping annotation, which is a composed annotation that acts as
// a shortcut for @RequestMapping(method = RequestMethod.GET).
// It maps HTTP GET requests to a specific URI path directly to the annotated handler method.
import org.springframework.web.bind.annotation.GetMapping;

// Imports the @RequestParam annotation, used to bind a specific HTTP query parameter
// (e.g., ?q=some+question) from the incoming request URL to a method parameter.
// This makes it easy to extract user input passed via the URL query string.
import org.springframework.web.bind.annotation.RequestParam;

// Imports the @RestController annotation, which is a convenience annotation that combines
// @Controller and @ResponseBody. It marks this class as a Spring MVC controller where
// every method's return value is written directly into the HTTP response body
// (serialized as JSON or plain text), rather than being resolved as a view name.
import org.springframework.web.bind.annotation.RestController;

// Marks this class as a RESTful Spring MVC controller.
// Spring automatically registers it as a web layer bean, and all handler method return values
// are serialized directly into the HTTP response body (no view templates involved).
// Combined with the @GetMapping below, this enables a simple REST API endpoint.
@RestController
public class AskController {

  // Declares a private, immutable reference to the configured ChatClient
  // instance.
  // 'final' ensures this reference is set exactly once — during construction —
  // and cannot
  // be reassigned afterward, supporting immutability and making the dependency
  // clearly visible.
  // The ChatClient is the configured gateway to the LLM, pre-wired with the
  // Gutenberg tools.
  private final ChatClient chatClient;

  // Constructor used by Spring to inject its dependencies via constructor
  // injection.
  // Spring automatically resolves and provides:
  // - ChatClient.Builder: a Spring AI auto-configured builder for the LLM
  // ChatClient,
  // pre-configured with the model settings from application.properties (e.g.,
  // model name, API key).
  // - GutenbergTools: the Spring-managed bean containing @Tool-annotated methods
  // that the LLM
  // can invoke (e.g., to search or count sentences in the Gutenberg book).
  // Constructor injection is preferred over @Autowired field injection because it
  // guarantees
  // all dependencies are non-null when the object is created and makes the class
  // easier to test.
  public AskController(ChatClient.Builder builder, GutenbergTools tools) {

    // Builds and stores the ChatClient using a fluent builder pattern.
    // .defaultTools(tools) registers all @Tool-annotated methods from the
    // GutenbergTools bean
    // with this ChatClient. When the LLM decides it needs to call a tool during a
    // conversation,
    // Spring AI intercepts the model's tool-call request, executes the
    // corresponding Java method,
    // and feeds the result back to the LLM automatically — all within a single
    // .call() invocation.
    this.chatClient = builder
        // Registers the GutenbergTools instance as the set of default tools available
        // to the LLM.
        // Spring AI inspects GutenbergTools at startup, reads each @Tool annotation's
        // description,
        // and sends the tool schemas to the model so it can decide when and how to
        // invoke them.
        .defaultTools(tools)
        // Finalizes the ChatClient configuration and constructs the immutable
        // ChatClient instance.
        // After .build(), the ChatClient is ready to send prompts and handle tool
        // invocations.
        .build();
  }

  // Maps HTTP GET requests to the "/ask" endpoint to this handler method.
  // For example, a request like: GET /ask?q=How+many+sentences+mention+the+sea
  // will be routed here. The method name ("ask") is just a Java convention — the
  // actual
  // URL path is determined solely by the value in @GetMapping.
  @GetMapping("/ask")

  // Handler method that accepts a natural-language question from the user and
  // returns the LLM's answer.
  // Parameters:
  // q - the user's question, extracted from the HTTP query parameter named "q"
  // (e.g., ?q=...)
  // Returns a plain String containing the LLM's final response, which Spring
  // writes directly
  // into the HTTP response body (as plain text, since the return type is String).
  public String ask(@RequestParam String q) {

    // Starts a new prompt interaction with the LLM using the ChatClient fluent API.
    // .prompt() initializes a new ChatPrompt builder, ready to receive user and
    // system messages.
    return chatClient.prompt()
        // Sets the user message for this prompt to the question received from the HTTP
        // request.
        // This is equivalent to the "user" role in the OpenAI chat format — the human
        // turn of the conversation. The LLM will receive this as the question it needs to
        // answer.
        .user(q)
        // Sends the assembled prompt to the LLM and blocks until a response (or tool
        // calls) are complete.
        // If the model decides to invoke a tool (e.g., firstSentencesContaining or
        // countSentencesContaining),
        // Spring AI handles the tool-execution round-trip transparently before
        // producing the final answer.
        .call()
        // Extracts the final text content from the LLM's response object.
        // .content() unwraps the ChatResponse to return just the assistant's message as
        // a plain String,
        // which is then returned to the HTTP caller as the response body.
        .content();
  }
}
