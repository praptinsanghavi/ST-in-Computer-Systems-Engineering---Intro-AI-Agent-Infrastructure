---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:43Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_specify.html
title: 'akka specify :: Akka Documentation'
---

# akka specify :: Akka Documentation

## Content

# akka specify

Initialize and manage AI\-assisted Akka development projects.

## Synopsis

The 'akka specify' commands set up Akka projects for AI\-assisted development.
Use 'akka specify init' to create a new project with all the resources needed for AI coding agents, including slash commands, templates, and MCP configuration.

## Options

```
  -h, --help   help for specify
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
- [akka specify init](akka_specify_init.html) \- Initialize a new Akka project for AI\-assisted development.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_specify_init.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_specify.html](https://doc.akka.io/reference/cli/akka-cli/akka_specify.html)*