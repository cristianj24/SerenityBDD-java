# Proyecto base de Serenity BDD

### Ejecución de test por línea de comandos


#### Maven
```json
$ mvn clean verify -Ddriver=firefox
```

#### Gradle
```json
$ gradlew clean test -Pdriver=firefox
```

### Ejecución de test por línea de comandos por ambiente
#### Gradle
```json
gradlew clean test -Denvironment=dev 
```
```json
$ mvn clean verify -Denvironment=dev
```