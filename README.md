# Portable pipeline

Prototype for a portable pipeline thing.

## Technical stuff

### Logs 


## API

### Run pipeline
HTTP POST: /run

Arguments:


### Get version
HTTP GET: /version

Arguments: None

Result:
HTTP 200.
Returns:
```

```


## Tests

### Run pipeline

```
curl -X POST http://localhost:8080/run -H 'Content-Type: application/json' -d '{"name":"p1", "steps":[] }'
```

```
curl -X POST http://localhost:8080/run -H 'Content-Type: application/json' -d '{"name":"p1", "steps":[{"name":"ca", "image":"thrane/tiny-ca", "arguments":[]}]}'
```


### Get version

Example:
```
curl http://localhost:8080/version
```