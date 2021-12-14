## Test App To Share Case Issue

- added -Amicronaut.openapi.property.naming.strategy=SNAKE_CASE in pom.xml
- and property-naming-strategy in Application.yml

<pre>

➜  mntest1 curl http://localhost:8080/v1/things/fred
{"thingId":"fred","propertyOne":"hatstand"}%

</pre>

