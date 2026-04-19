---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:10Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_local.html
title: 'akka local :: Akka Documentation'
---

# akka local :: Akka Documentation

## Content

# akka local

Interact with and manage Akka services running locally.

## Synopsis

The `akka local` commands help with local development by providing ways to interact with, discover and explore Akka services and its data when running them locally.

## Options

```
  -h, --help   help for local
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

- [akka](akka.html) \- Akka control
- [akka local cluster](akka_local_cluster.html) \- Start and manage a local Akka cluster
- [akka local console](akka_local_console.html) \- Start the Akka local console.
- [akka local remote](akka_local_remote.html) \- Manage remote Akka services.
- [akka local services](akka_local_services.html) \- Manage Akka services locally.
- [akka local start](akka_local_start.html) \- Start the local development environment in background mode (no TUI).
- [akka local status](akka_local_status.html) \- Show status of the local development environment.
- [akka local stop](akka_local_stop.html) \- Stop the local development environment daemon.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_cluster.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_console.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_remote.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_services.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_start.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_status.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_stop.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_local.html](https://doc.akka.io/reference/cli/akka-cli/akka_local.html)*