# spring-graphql-services
Spring boot with Graphql

## Important Fixes
1. Kotlin version as below in maven properties
`<kotlin.version>1.3.10</kotlin.version>`
2. Spring boot parent version: 2.1.4.RELEASE
```
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>2.1.4.RELEASE</version>
<relativePath/> <!-- lookup parent from repository -->
</parent>
```

3. Following dependencies and version work
```
<dependency>
<groupId>com.graphql-java-kickstart</groupId>
<artifactId>graphiql-spring-boot-starter</artifactId>
<version>5.7.3</version>
<scope>runtime</scope>
</dependency>
<dependency>
<groupId>com.graphql-java-kickstart</groupId>
<artifactId>graphql-spring-boot-starter</artifactId>
<version>5.7.3</version>
</dependency>
<dependency>
<groupId>com.graphql-java-kickstart</groupId>
<artifactId>graphql-java-tools</artifactId>
<version>5.5.2</version>
</dependency>
```

[Schema](https://github.com/anupmanekar/spring-graphql-services/blob/master/src/main/resources/graphqls/laundry.graphqls)

