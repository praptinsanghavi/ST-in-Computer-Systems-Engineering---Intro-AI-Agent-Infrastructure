---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:18Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_local_start.html
title: 'akka local start :: Akka Documentation'
---

# akka local start :: Akka Documentation

## Content

# akka local start

Start the local development environment in background mode (no TUI).

## Synopsis

Start the Akka local development environment in daemon mode.
This starts the gRPC proxy, service registry, HTTP server, and trace collection — the same infrastructure as 'akka local console' — but without the interactive terminal UI.

Designed for use by AI agents via MCP tools.
The daemon writes its PID and state to \~/.akka/local/ for process management.

```
akka local start [flags]
```

## Options

```
  -h, --help          help for start
  -p, --port uint16   HTTP port for the local console. (default 9889)
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

- [akka local](akka_local.html) \- Interact with and manage Akka services running locally.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_local.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_local_start.html](https://doc.akka.io/reference/cli/akka-cli/akka_local_start.html)*