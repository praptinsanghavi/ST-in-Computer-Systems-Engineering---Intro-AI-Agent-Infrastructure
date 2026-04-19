---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:41Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_code.html
title: 'akka code :: Akka Documentation'
---

# akka code :: Akka Documentation

## Content

# akka code

Develop Akka services

## Synopsis

The 'code' command provides tools for developing Akka services, including AI assistance configuration and Akka samples downloading.

## Options

```
  -h, --help   help for code
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
- [akka code check](akka_code_check.html) \- Check if your environment is ready for Akka development
- [akka code context\-update](akka_code_context-update.html) \- Updates the Akka SDK context directory and optionally AI assistant files.
- [akka code init](akka_code_init.html) \- Initialize a new Akka SDK project.
- [akka code token](akka_code_token.html) \- The token command allow you to provision a resolver for Akka dependency downloads.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_check.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_context-update.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_init.html
- https://doc.akka.io/reference/cli/akka-cli/akka_code_token.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_code.html](https://doc.akka.io/reference/cli/akka-cli/akka_code.html)*