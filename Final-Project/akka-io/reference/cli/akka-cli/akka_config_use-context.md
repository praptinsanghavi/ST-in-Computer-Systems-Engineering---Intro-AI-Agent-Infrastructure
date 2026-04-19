---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:45Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_config_use-context.html
title: 'akka config use-context :: Akka Documentation'
---

# akka config use-context :: Akka Documentation

## Content

# akka config use\-context

Switch to a context.

## Synopsis

The command `akka config use-context context-name` sets the current configuration context to the context specified with *context\-name*.

This context will remain selected for subsequent commands.

|  | You can also use the `--context` flag to specify a different context for an individual command. |
| --- | --- |

```
akka config use-context CONTEXT [flags]
```

## Options

```
  -h, --help   help for use-context
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka config](akka_config.html) \- Manage configuration and context for the Akka CLI.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_config.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_config_use-context.html](https://doc.akka.io/reference/cli/akka-cli/akka_config_use-context.html)*