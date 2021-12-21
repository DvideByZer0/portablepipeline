# Tinyp

Prototype for a tiny pipeline thing



## Tests


### Run pipeline

HTTP POST: /run

'''
curl -X POST http://localhost:8080/run -H 'Content-Type: application/json' -d '{"name":"p1", "steps":[] }'
'''

'''
curl -X POST http://localhost:8080/run -H 'Content-Type: application/json' -d '{"name":"p1", "steps":[{"name":"ca", "image":"thrane/tiny-ca", "arguments":[]}]}'
'''


### Get version

HTTP GET: /version

'''
curl http://localhost:8080/version
'''
