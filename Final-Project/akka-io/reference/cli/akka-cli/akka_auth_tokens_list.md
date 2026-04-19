---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:39Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_list.html
title: 'akka auth tokens list :: Akka Documentation'
---

# akka auth tokens list :: Akka Documentation

## Content

# akka auth tokens list

List all server managed Akka tokens.

## Synopsis

The command `akka auth tokens list` will display all currently authorized tokens for your account.

See: `akka auth login`

```
akka auth tokens list [flags]
```

## Options

```
  -h, --help   help for list
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

- [akka auth tokens](akka_auth_tokens.html) \- Manage Akka authentication tokens for your user.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_list.html](https://doc.akka.io/reference/cli/akka-cli/akka_auth_tokens_list.html)*